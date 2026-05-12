package be.baddev.java_springmvc_rest_bel_aide.pl.controllers;

import be.baddev.java_springmvc_rest_bel_aide.bll.mappers.request.RequestMapper;
import be.baddev.java_springmvc_rest_bel_aide.bll.services.request.interfaces.RequestService;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.request.in.*;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.request.out.*;

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
 * REST controller responsible for request management.
 *
 * <p>
 * This controller exposes endpoints used to create,
 * retrieve and delete request posts.
 * </p>
 *
 * @author BaD-DeV
 * @since 1.0
 */
@RestController
@RequestMapping("/requests")
@RequiredArgsConstructor
@Tag(
        name = "Requests",
        description = "Request management endpoints"
)
public class RequestController {

    /**
     * Request service layer.
     */
    private final RequestService requestService;

    /**
     * Request mapper used to convert DTOs and entities.
     */
    private final RequestMapper requestMapper;

    /**
     * Creates a physical item request.
     *
     * @param dto creation payload
     * @return empty HTTP response
     */
    @Operation(
            summary = "Create a physical item request",
            description = "Creates a request for a physical item"
    )
    @PreAuthorize("hasRole('user')")
    @PostMapping("/physical/item")
    public ResponseEntity<Void> createPhysicalItem(
            @Valid @RequestBody RequestPhysicalItemCreateForm dto
    ) {

        requestService.create(
                requestMapper.physicalItemCreateFormToEntity(dto)
        );

        return ResponseEntity.ok().build();
    }

    /**
     * Creates a physical service request.
     *
     * @param dto creation payload
     * @return empty HTTP response
     */
    @Operation(
            summary = "Create a physical service request",
            description = "Creates a request for a physical service"
    )
    @PreAuthorize("hasRole('user')")
    @PostMapping("/physical/service")
    public ResponseEntity<Void> createPhysicalService(
            @Valid @RequestBody RequestPhysicalServiceCreateForm dto
    ) {

        requestService.create(
                requestMapper.physicalServiceCreateFormToEntity(dto)
        );

        return ResponseEntity.ok().build();
    }

    /**
     * Creates a remote service request.
     *
     * @param dto creation payload
     * @return empty HTTP response
     */
    @Operation(
            summary = "Create a remote service request",
            description = "Creates a request for a remote service"
    )
    @PreAuthorize("hasRole('user')")
    @PostMapping("/remote/service")
    public ResponseEntity<Void> createRemoteService(
            @Valid @RequestBody RequestRemoteServiceCreateForm dto
    ) {

        requestService.create(
                requestMapper.remoteServiceCreateFormToEntity(dto)
        );

        return ResponseEntity.ok().build();
    }

    /**
     * Retrieves all requests.
     *
     * @return list of requests
     */
    @Operation(
            summary = "Get all requests",
            description = "Retrieves all request posts"
    )
    @PreAuthorize("hasRole('user')")
    @GetMapping
    public ResponseEntity<List<RequestIndexOut>> getAll() {

        return ResponseEntity.ok(
                requestService.findAll()
                        .stream()
                        .map(requestMapper::entityToIndexOut)
                        .toList()
        );
    }

    /**
     * Retrieves a physical item request by its identifier.
     *
     * @param id request identifier
     * @return detailed request response
     */
    @Operation(
            summary = "Get a physical item request",
            description = "Retrieves details of a physical item request"
    )
    @PreAuthorize("hasRole('user')")
    @GetMapping("/{id}/physical/item")
    public ResponseEntity<RequestPhysicalItemDetailsOut> getPhysicalItem(
            @PathVariable UUID id
    ) {

        var request = requestService.findById(id);

        return ResponseEntity.ok(
                requestMapper.entityToPhysicalItemDetailsOut(request)
        );
    }

    /**
     * Retrieves a physical service request by its identifier.
     *
     * @param id request identifier
     * @return detailed request response
     */
    @Operation(
            summary = "Get a physical service request",
            description = "Retrieves details of a physical service request"
    )
    @PreAuthorize("hasRole('user')")
    @GetMapping("/{id}/physical/service")
    public ResponseEntity<RequestPhysicalServiceDetailsOut> getPhysicalService(
            @PathVariable UUID id
    ) {

        var request = requestService.findById(id);

        return ResponseEntity.ok(
                requestMapper.entityToPhysicalServiceDetailsOut(request)
        );
    }

    /**
     * Retrieves a remote service request by its identifier.
     *
     * @param id request identifier
     * @return detailed request response
     */
    @Operation(
            summary = "Get a remote service request",
            description = "Retrieves details of a remote service request"
    )
    @PreAuthorize("hasRole('user')")
    @GetMapping("/{id}/remote/service")
    public ResponseEntity<RequestRemoteServiceDetailsOut> getRemoteService(
            @PathVariable UUID id
    ) {

        var request = requestService.findById(id);

        return ResponseEntity.ok(
                requestMapper.entityToRemoteServiceDetailsOut(request)
        );
    }

    /**
     * Deletes a request by its identifier.
     *
     * @param id request identifier
     * @return empty HTTP response
     */
    @Operation(
            summary = "Delete a request",
            description = "Deletes a request by its identifier"
    )
    @PreAuthorize("hasRole('user')")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {

        requestService.delete(id);

        return ResponseEntity.noContent().build();
    }
}