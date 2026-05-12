package be.baddev.java_springmvc_rest_bel_aide.pl.controllers;

import be.baddev.java_springmvc_rest_bel_aide.bll.mappers.exchange.ExchangeMapper;
import be.baddev.java_springmvc_rest_bel_aide.bll.services.exchange.interfaces.ExchangeService;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.exchange.in.*;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.exchange.out.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import jakarta.validation.Valid;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * REST controller responsible for exchange management.
 *
 * <p>
 * This controller exposes endpoints used to create,
 * retrieve and delete exchange posts.
 * </p>
 *
 * @author BaD-DeV
 * @since 1.0
 */
@RestController
@RequestMapping("/exchanges")
@RequiredArgsConstructor
@Tag(
        name = "Exchanges",
        description = "Exchange management endpoints"
)
public class ExchangeController {

    /**
     * Exchange service layer.
     */
    private final ExchangeService exchangeService;

    /**
     * Exchange mapper used to convert DTOs and entities.
     */
    private final ExchangeMapper exchangeMapper;

    /**
     * Creates a physical item exchange.
     *
     * @param dto creation payload
     * @return empty HTTP response
     */
    @Operation(
            summary = "Create a physical item exchange",
            description = "Creates an exchange for a physical item"
    )
    @PreAuthorize("hasRole('user')")
    @PostMapping("/physical/item")
    public ResponseEntity<Void> createPhysicalItem(
            @Valid @RequestBody ExchangePhysicalItemCreateForm dto
    ) {

        exchangeService.create(
                exchangeMapper.physicalItemCreateFormToEntity(dto)
        );

        return ResponseEntity.ok().build();
    }

    /**
     * Creates a physical service exchange.
     *
     * @param dto creation payload
     * @return empty HTTP response
     */
    @Operation(
            summary = "Create a physical service exchange",
            description = "Creates an exchange for a physical service"
    )
    @PreAuthorize("hasRole('user')")
    @PostMapping("/physical/service")
    public ResponseEntity<Void> createPhysicalService(
            @Valid @RequestBody ExchangePhysicalServiceCreateForm dto
    ) {

        exchangeService.create(
                exchangeMapper.physicalServiceCreateFormToEntity(dto)
        );

        return ResponseEntity.ok().build();
    }

    /**
     * Creates a remote service exchange.
     *
     * @param dto creation payload
     * @return empty HTTP response
     */
    @Operation(
            summary = "Create a remote service exchange",
            description = "Creates an exchange for a remote service"
    )
    @PreAuthorize("hasRole('user')")
    @PostMapping("/remote/service")
    public ResponseEntity<Void> createRemoteService(
            @Valid @RequestBody ExchangeRemoteServiceCreateForm dto
    ) {

        exchangeService.create(
                exchangeMapper.remoteServiceCreateFormToEntity(dto)
        );

        return ResponseEntity.ok().build();
    }

    /**
     * Retrieves all exchanges.
     *
     * @return list of exchanges
     */
    @Operation(
            summary = "Get all exchanges",
            description = "Retrieves all exchange posts"
    )
    @PreAuthorize("hasRole('user')")
    @GetMapping
    public ResponseEntity<List<ExchangeIndexOut>> getAll() {

        return ResponseEntity.ok(
                exchangeService.findAll()
                        .stream()
                        .map(exchangeMapper::entityToIndexOut)
                        .toList()
        );
    }

    /**
     * Retrieves a physical item exchange by its identifier.
     *
     * @param id exchange identifier
     * @return detailed exchange response
     */
    @Operation(
            summary = "Get a physical item exchange",
            description = "Retrieves details of a physical item exchange"
    )
    @PreAuthorize("hasRole('user')")
    @GetMapping("/{id}/physical/item")
    public ResponseEntity<ExchangePhysicalItemDetailsOut> getPhysicalItem(
            @PathVariable UUID id
    ) {

        var exchange = exchangeService.findById(id);

        return ResponseEntity.ok(
                exchangeMapper.entityToPhysicalItemDetailsOut(exchange)
        );
    }

    /**
     * Retrieves a physical service exchange by its identifier.
     *
     * @param id exchange identifier
     * @return detailed exchange response
     */
    @Operation(
            summary = "Get a physical service exchange",
            description = "Retrieves details of a physical service exchange"
    )
    @PreAuthorize("hasRole('user')")
    @GetMapping("/{id}/physical/service")
    public ResponseEntity<ExchangePhysicalServiceDetailsOut> getPhysicalService(
            @PathVariable UUID id
    ) {

        var exchange = exchangeService.findById(id);

        return ResponseEntity.ok(
                exchangeMapper.entityToPhysicalServiceDetailsOut(exchange)
        );
    }

    /**
     * Retrieves a remote service exchange by its identifier.
     *
     * @param id exchange identifier
     * @return detailed exchange response
     */
    @Operation(
            summary = "Get a remote service exchange",
            description = "Retrieves details of a remote service exchange"
    )
    @PreAuthorize("hasRole('user')")
    @GetMapping("/{id}/remote/service")
    public ResponseEntity<ExchangeRemoteServiceDetailsOut> getRemoteService(
            @PathVariable UUID id
    ) {

        var exchange = exchangeService.findById(id);

        return ResponseEntity.ok(
                exchangeMapper.entityToRemoteServiceDetailsOut(exchange)
        );
    }

    /**
     * Deletes an exchange by its identifier.
     *
     * @param id exchange identifier
     * @return empty HTTP response
     */
    @Operation(
            summary = "Delete an exchange",
            description = "Deletes an exchange by its identifier"
    )
    @PreAuthorize("hasRole('user')")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {

        exchangeService.delete(id);

        return ResponseEntity.noContent().build();
    }
}