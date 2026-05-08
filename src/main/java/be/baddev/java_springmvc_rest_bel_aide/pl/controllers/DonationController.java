package be.baddev.java_springmvc_rest_bel_aide.pl.controllers;

import be.baddev.java_springmvc_rest_bel_aide.bll.services.donation.interfaces.DonationService;
import be.baddev.java_springmvc_rest_bel_aide.bll.mappers.donation.DonationMapper;

import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.donation.in.*;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.donation.out.*;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/donations")
@RequiredArgsConstructor
public class DonationController {

    private final DonationService donationService;
    private final DonationMapper donationMapper;

    // =========================
    // CREATE - PHYSICAL ITEM
    // =========================
    @PostMapping("/physical/item")
    public ResponseEntity<Void> createPhysicalItem(
            @Valid @RequestBody DonationPhysicalItemCreateForm dto
    ) {
        donationService.create(
                donationMapper.physicalItemCreateFormToEntity(dto)
        );

        return ResponseEntity.ok().build();
    }

    // =========================
    // CREATE - PHYSICAL SERVICE
    // =========================
    @PostMapping("/physical/service")
    public ResponseEntity<Void> createPhysicalService(
            @Valid @RequestBody DonationPhysicalServiceCreateForm dto
    ) {
        donationService.create(
                donationMapper.physicalServiceCreateFormToEntity(dto)
        );

        return ResponseEntity.ok().build();
    }

    // =========================
    // CREATE - REMOTE SERVICE
    // =========================
    @PostMapping("/remote/service")
    public ResponseEntity<Void> createRemoteService(
            @Valid @RequestBody DonationRemoteServiceCreateForm dto
    ) {
        donationService.create(
                donationMapper.remoteServiceCreateFormToEntity(dto)
        );

        return ResponseEntity.ok().build();
    }

    // =========================
    // INDEX
    // =========================
    @GetMapping
    public ResponseEntity<List<DonationIndexOut>> getAll() {

        return ResponseEntity.ok(
                donationService.findAll()
                        .stream()
                        .map(donationMapper::entityToIndexOut)
                        .toList()
        );
    }

    // =========================
    // DETAILS - PHYSICAL ITEM
    // =========================
    @GetMapping("/{id}/physical/item")
    public ResponseEntity<DonationPhysicalItemDetailsOut> getPhysicalItem(@PathVariable UUID id) {

        var donation = donationService.findById(id);

        return ResponseEntity.ok(
                donationMapper.entityToPhysicalItemDetailsOut(donation)
        );
    }

    // =========================
    // DETAILS - PHYSICAL SERVICE
    // =========================
    @GetMapping("/{id}/physical/service")
    public ResponseEntity<DonationPhysicalServiceDetailsOut> getPhysicalService(@PathVariable UUID id) {

        var donation = donationService.findById(id);

        return ResponseEntity.ok(
                donationMapper.entityToPhysicalServiceDetailsOut(donation)
        );
    }

    // =========================
    // DETAILS - REMOTE SERVICE
    // =========================
    @GetMapping("/{id}/remote/service")
    public ResponseEntity<DonationRemoteServiceDetailsOut> getRemoteService(@PathVariable UUID id) {

        var donation = donationService.findById(id);

        return ResponseEntity.ok(
                donationMapper.entityToRemoteServiceDetailsOut(donation)
        );
    }

    // =========================
    // DELETE
    // =========================
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {

        donationService.delete(id);

        return ResponseEntity.noContent().build();
    }
}