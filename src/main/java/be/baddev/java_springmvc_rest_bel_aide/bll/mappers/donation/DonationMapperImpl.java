package be.baddev.java_springmvc_rest_bel_aide.bll.mappers.donation;

import be.baddev.java_springmvc_rest_bel_aide.dal.entities.post.Donation;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.donation.in.DonationPhysicalItemCreateForm;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.donation.in.DonationPhysicalServiceCreateForm;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.donation.in.DonationRemoteServiceCreateForm;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.donation.out.DonationIndexOut;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.donation.out.DonationPhysicalItemDetailsOut;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.donation.out.DonationPhysicalServiceDetailsOut;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.donation.out.DonationRemoteServiceDetailsOut;
import org.springframework.stereotype.Component;

@Component
public class DonationMapperImpl implements DonationMapper {

    @Override
    public Donation physicalItemCreateFormToEntity(DonationPhysicalItemCreateForm dto) {

        return new Donation(
                dto.getTitle(),
                dto.getDescription(),
                dto.getStatus(),
                dto.getType(),
                dto.getMode(),
                dto.getCity(),
                dto.getLatitude(),
                dto.getLongitude(),
                dto.getCondition(),
                dto.getIsDeliveryPossible()
        );
    }

    @Override
    public Donation physicalServiceCreateFormToEntity(DonationPhysicalServiceCreateForm dto) {

        return new Donation(
                dto.getTitle(),
                dto.getDescription(),
                dto.getStatus(),
                dto.getType(),
                dto.getMode(),
                dto.getCity(),
                dto.getLatitude(),
                dto.getLongitude(),
                null,
                dto.getIsDeliveryPossible()
        );
    }

    @Override
    public Donation remoteServiceCreateFormToEntity(DonationRemoteServiceCreateForm dto) {

        return new Donation(
                dto.getTitle(),
                dto.getDescription(),
                dto.getStatus(),
                dto.getType(),
                dto.getMode(),
                null,
                null,
                null,
                null,
                false
        );
    }

    @Override
    public DonationIndexOut entityToIndexOut(Donation entity) {

        return new DonationIndexOut(
                entity.getId(),
                entity.getTitle(),
                entity.getStatus(),
                entity.getPostMode(),
                entity.getCity()
        );
    }


    @Override
    public DonationPhysicalItemDetailsOut entityToPhysicalItemDetailsOut(Donation entity) {

        return new DonationPhysicalItemDetailsOut(
                entity.getId(),
                entity.getTitle(),
                entity.getDescription(),
                entity.getStatus(),
                entity.getPostType(),
                entity.getPostMode(),
                entity.getCity(),
                entity.getLatitude(),
                entity.getLongitude(),
                entity.getItemCondition(),
                entity.isDeliveryPossible()
        );
    }

    @Override
    public DonationPhysicalServiceDetailsOut entityToPhysicalServiceDetailsOut(Donation entity) {

        return new DonationPhysicalServiceDetailsOut(
                entity.getId(),
                entity.getTitle(),
                entity.getDescription(),
                entity.getStatus(),
                entity.getPostType(),
                entity.getPostMode(),
                entity.getCity(),
                entity.getLatitude(),
                entity.getLongitude(),
                entity.isDeliveryPossible()
        );
    }

    @Override
    public DonationRemoteServiceDetailsOut entityToRemoteServiceDetailsOut(Donation entity) {

        return new DonationRemoteServiceDetailsOut(
                entity.getId(),
                entity.getTitle(),
                entity.getDescription(),
                entity.getStatus(),
                entity.getPostType(),
                entity.getPostMode(),
                entity.isDeliveryPossible()
        );
    }
}