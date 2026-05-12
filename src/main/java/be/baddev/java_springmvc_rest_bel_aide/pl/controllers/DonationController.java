package be.baddev.java_springmvc_rest_bel_aide.pl.controllers;

import be.baddev.java_springmvc_rest_bel_aide.bll.mappers.donation.DonationMapper;
import be.baddev.java_springmvc_rest_bel_aide.bll.services.donation.interfaces.DonationService;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.donation.in.*;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.donation.out.*;
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
 * REST controller responsible for donation management.
 *
 * <p>
 * This controller exposes endpoints used to create,
 * retrieve and delete donation posts.
 * </p>
 *
 * @author BaD-DeV
 * @since 1.0
 */
@RestController
@RequestMapping("/donations")
@RequiredArgsConstructor
@Tag(
        name = "Donations",
        description = "Donation management endpoints"
)
public class DonationController {

    /**
     * Donation service layer.
     */
    private final DonationService donationService;

    /**
     * Donation mapper used to convert DTOs and entities.
     */
    private final DonationMapper donationMapper;

    /**
     * Creates a physical item donation.
     *
     * @param dto creation payload
     * @return empty HTTP response
     */
    @Operation(
            summary = "Create a physical item donation",
            description = "Creates a donation for a physical item"
    )
    @PreAuthorize("hasRole('user')")
    @PostMapping("/physical/item")
    public ResponseEntity<Void> createPhysicalItem(
            @Valid @RequestBody DonationPhysicalItemCreateForm dto
    ) {

        donationService.create(
                donationMapper.physicalItemCreateFormToEntity(dto)
        );

        return ResponseEntity.ok().build();
    }

    /**
     * Creates a physical service donation.
     *
     * @param dto creation payload
     * @return empty HTTP response
     */
    @Operation(
            summary = "Create a physical service donation",
            description = "Creates a donation for a physical service"
    )
    @PreAuthorize("hasRole('user')")
    @PostMapping("/physical/service")
    public ResponseEntity<Void> createPhysicalService(
            @Valid @RequestBody DonationPhysicalServiceCreateForm dto
    ) {

        donationService.create(
                donationMapper.physicalServiceCreateFormToEntity(dto)
        );

        return ResponseEntity.ok().build();
    }

    /**
     * Creates a remote service donation.
     *
     * @param dto creation payload
     * @return empty HTTP response
     */
    @Operation(
            summary = "Create a remote service donation",
            description = "Creates a donation for a remote service"
    )
    @PreAuthorize("hasRole('user')")
    @PostMapping("/remote/service")
    public ResponseEntity<Void> createRemoteService(
            @Valid @RequestBody DonationRemoteServiceCreateForm dto
    ) {

        donationService.create(
                donationMapper.remoteServiceCreateFormToEntity(dto)
        );

        return ResponseEntity.ok().build();
    }

    /**
     * Retrieves all donations.
     *
     * @return list of donations
     */
    @Operation(
            summary = "Get all donations",
            description = "Retrieves all donation posts"
    )
    @PreAuthorize("hasRole('user')")
    @GetMapping
    public ResponseEntity<List<DonationIndexOut>> getAll() {

        return ResponseEntity.ok(
                donationService.findAll()
                        .stream()
                        .map(donationMapper::entityToIndexOut)
                        .toList()
        );
    }

    /**
     * Retrieves a physical item donation by its identifier.
     *
     * @param id donation identifier
     * @return detailed donation response
     */
    @Operation(
            summary = "Get a physical item donation",
            description = "Retrieves details of a physical item donation"
    )
    @PreAuthorize("hasRole('user')")
    @GetMapping("/{id}/physical/item")
    public ResponseEntity<DonationPhysicalItemDetailsOut> getPhysicalItem(
            @PathVariable UUID id
    ) {

        var donation = donationService.findById(id);

        return ResponseEntity.ok(
                donationMapper.entityToPhysicalItemDetailsOut(donation)
        );
    }

    /**
     * Retrieves a physical service donation by its identifier.
     *
     * @param id donation identifier
     * @return detailed donation response
     */
    @Operation(
            summary = "Get a physical service donation",
            description = "Retrieves details of a physical service donation"
    )
    @PreAuthorize("hasRole('user')")
    @GetMapping("/{id}/physical/service")
    public ResponseEntity<DonationPhysicalServiceDetailsOut> getPhysicalService(
            @PathVariable UUID id
    ) {

        var donation = donationService.findById(id);

        return ResponseEntity.ok(
                donationMapper.entityToPhysicalServiceDetailsOut(donation)
        );
    }

    /**
     * Retrieves a remote service donation by its identifier.
     *
     * @param id donation identifier
     * @return detailed donation response
     */
    @Operation(
            summary = "Get a remote service donation",
            description = "Retrieves details of a remote service donation"
    )
    @PreAuthorize("hasRole('user')")
    @GetMapping("/{id}/remote/service")
    public ResponseEntity<DonationRemoteServiceDetailsOut> getRemoteService(
            @PathVariable UUID id
    ) {

        var donation = donationService.findById(id);

        return ResponseEntity.ok(
                donationMapper.entityToRemoteServiceDetailsOut(donation)
        );
    }

    /**
     * Deletes a donation by its identifier.
     *
     * @param id donation identifier
     * @return empty HTTP response
     */
    @Operation(
            summary = "Delete a donation",
            description = "Deletes a donation by its identifier"
    )
    @PreAuthorize("hasRole('user')")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {

        donationService.delete(id);

        return ResponseEntity.noContent().build();
    }
}