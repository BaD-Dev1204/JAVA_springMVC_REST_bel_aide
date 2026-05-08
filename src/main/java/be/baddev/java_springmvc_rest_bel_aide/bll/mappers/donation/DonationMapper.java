package be.baddev.java_springmvc_rest_bel_aide.bll.mappers.donation;

import be.baddev.java_springmvc_rest_bel_aide.dal.entities.post.Donation;

import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.donation.in.DonationPhysicalItemCreateForm;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.donation.in.DonationPhysicalServiceCreateForm;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.donation.in.DonationRemoteServiceCreateForm;

import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.donation.out.DonationIndexOut;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.donation.out.DonationPhysicalItemDetailsOut;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.donation.out.DonationPhysicalServiceDetailsOut;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.donation.out.DonationRemoteServiceDetailsOut;

public interface DonationMapper {

    Donation physicalItemCreateFormToEntity(DonationPhysicalItemCreateForm dto);

    Donation physicalServiceCreateFormToEntity(DonationPhysicalServiceCreateForm dto);

    Donation remoteServiceCreateFormToEntity(DonationRemoteServiceCreateForm dto);

    DonationIndexOut entityToIndexOut(Donation entity);

    DonationPhysicalItemDetailsOut entityToPhysicalItemDetailsOut(Donation entity);

    DonationPhysicalServiceDetailsOut entityToPhysicalServiceDetailsOut(Donation entity);

    DonationRemoteServiceDetailsOut entityToRemoteServiceDetailsOut(Donation entity);
}