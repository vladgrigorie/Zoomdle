package base.service;

import base.domain.AplicareLicenta;
import base.repository.AplicareLicentaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Service Implementation for managing {@link AplicareLicenta}.
 */
@Service
@Transactional
public class AplicareLicentaService {

    private final Logger log = LoggerFactory.getLogger(AplicareLicentaService.class);

    private final AplicareLicentaRepository aplicareLicentaRepository;

    public AplicareLicentaService(AplicareLicentaRepository aplicareLicentaRepository) {
        this.aplicareLicentaRepository = aplicareLicentaRepository;
    }

    /**
     * Save a aplicareLicenta.
     *
     * @param aplicareLicenta the entity to save.
     * @return the persisted entity.
     */
    public AplicareLicenta save(AplicareLicenta aplicareLicenta) {
        log.debug("Request to save AplicareLicenta : {}", aplicareLicenta);
        return aplicareLicentaRepository.save(aplicareLicenta);
    }

    /**
     * Get all the aplicareLicentas.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public Page<AplicareLicenta> findAll(Pageable pageable) {
        log.debug("Request to get all AplicareLicentas");
        return aplicareLicentaRepository.findAll(pageable);
    }

    /**
     * Get one aplicareLicenta by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<AplicareLicenta> findOne(Long id) {
        log.debug("Request to get AplicareLicenta : {}", id);
        return aplicareLicentaRepository.findById(id);
    }

    /**
     * Delete the aplicareLicenta by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete AplicareLicenta : {}", id);
        aplicareLicentaRepository.deleteById(id);
    }
}
