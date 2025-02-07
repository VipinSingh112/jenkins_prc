/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FilmApplicationRegisterLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationRegisterLocalService
 * @generated
 */
public class FilmApplicationRegisterLocalServiceWrapper
	implements FilmApplicationRegisterLocalService,
			   ServiceWrapper<FilmApplicationRegisterLocalService> {

	public FilmApplicationRegisterLocalServiceWrapper() {
		this(null);
	}

	public FilmApplicationRegisterLocalServiceWrapper(
		FilmApplicationRegisterLocalService
			filmApplicationRegisterLocalService) {

		_filmApplicationRegisterLocalService =
			filmApplicationRegisterLocalService;
	}

	/**
	 * Adds the film application register to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmApplicationRegisterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmApplicationRegister the film application register
	 * @return the film application register that was added
	 */
	@Override
	public com.nbp.film.stages.services.model.FilmApplicationRegister
		addFilmApplicationRegister(
			com.nbp.film.stages.services.model.FilmApplicationRegister
				filmApplicationRegister) {

		return _filmApplicationRegisterLocalService.addFilmApplicationRegister(
			filmApplicationRegister);
	}

	/**
	 * Creates a new film application register with the primary key. Does not add the film application register to the database.
	 *
	 * @param filmApplicationRegisterId the primary key for the new film application register
	 * @return the new film application register
	 */
	@Override
	public com.nbp.film.stages.services.model.FilmApplicationRegister
		createFilmApplicationRegister(long filmApplicationRegisterId) {

		return _filmApplicationRegisterLocalService.
			createFilmApplicationRegister(filmApplicationRegisterId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmApplicationRegisterLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the film application register from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmApplicationRegisterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmApplicationRegister the film application register
	 * @return the film application register that was removed
	 */
	@Override
	public com.nbp.film.stages.services.model.FilmApplicationRegister
		deleteFilmApplicationRegister(
			com.nbp.film.stages.services.model.FilmApplicationRegister
				filmApplicationRegister) {

		return _filmApplicationRegisterLocalService.
			deleteFilmApplicationRegister(filmApplicationRegister);
	}

	/**
	 * Deletes the film application register with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmApplicationRegisterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmApplicationRegisterId the primary key of the film application register
	 * @return the film application register that was removed
	 * @throws PortalException if a film application register with the primary key could not be found
	 */
	@Override
	public com.nbp.film.stages.services.model.FilmApplicationRegister
			deleteFilmApplicationRegister(long filmApplicationRegisterId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmApplicationRegisterLocalService.
			deleteFilmApplicationRegister(filmApplicationRegisterId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmApplicationRegisterLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _filmApplicationRegisterLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _filmApplicationRegisterLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _filmApplicationRegisterLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _filmApplicationRegisterLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.stages.services.model.impl.FilmApplicationRegisterModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _filmApplicationRegisterLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.stages.services.model.impl.FilmApplicationRegisterModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _filmApplicationRegisterLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _filmApplicationRegisterLocalService.dynamicQueryCount(
			dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _filmApplicationRegisterLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.film.stages.services.model.FilmApplicationRegister
		fetchFilmApplicationRegister(long filmApplicationRegisterId) {

		return _filmApplicationRegisterLocalService.
			fetchFilmApplicationRegister(filmApplicationRegisterId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _filmApplicationRegisterLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.film.stages.services.model.FilmApplicationRegister
		getApplicationRegisterBy_CI(String caseId) {

		return _filmApplicationRegisterLocalService.getApplicationRegisterBy_CI(
			caseId);
	}

	/**
	 * Returns the film application register with the primary key.
	 *
	 * @param filmApplicationRegisterId the primary key of the film application register
	 * @return the film application register
	 * @throws PortalException if a film application register with the primary key could not be found
	 */
	@Override
	public com.nbp.film.stages.services.model.FilmApplicationRegister
			getFilmApplicationRegister(long filmApplicationRegisterId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmApplicationRegisterLocalService.getFilmApplicationRegister(
			filmApplicationRegisterId);
	}

	/**
	 * Returns a range of all the film application registers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.stages.services.model.impl.FilmApplicationRegisterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application registers
	 * @param end the upper bound of the range of film application registers (not inclusive)
	 * @return the range of film application registers
	 */
	@Override
	public java.util.List
		<com.nbp.film.stages.services.model.FilmApplicationRegister>
			getFilmApplicationRegisters(int start, int end) {

		return _filmApplicationRegisterLocalService.getFilmApplicationRegisters(
			start, end);
	}

	/**
	 * Returns the number of film application registers.
	 *
	 * @return the number of film application registers
	 */
	@Override
	public int getFilmApplicationRegistersCount() {
		return _filmApplicationRegisterLocalService.
			getFilmApplicationRegistersCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _filmApplicationRegisterLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _filmApplicationRegisterLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmApplicationRegisterLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the film application register in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmApplicationRegisterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmApplicationRegister the film application register
	 * @return the film application register that was updated
	 */
	@Override
	public com.nbp.film.stages.services.model.FilmApplicationRegister
		updateFilmApplicationRegister(
			com.nbp.film.stages.services.model.FilmApplicationRegister
				filmApplicationRegister) {

		return _filmApplicationRegisterLocalService.
			updateFilmApplicationRegister(filmApplicationRegister);
	}

	@Override
	public com.nbp.film.stages.services.model.FilmApplicationRegister
		updateFilmApplicationRegister(
			String caseId, String nameOfApplicant,
			java.sql.Date registrationDate, String filmRegistrationNumber,
			String titleOfProductionOrProject,
			java.sql.Date dateOfRegistrationPermitIssued,
			String productionCompany, String technicalFormatOfProduction,
			String OriginOfProductionCompany, String permitsRequired,
			String shootLocationInJamaica, java.sql.Date preProductionDate,
			java.sql.Date productionStartDate, String proposedDateOfArrival,
			String portOfEntry, java.sql.Date proposedDateOfDeparture,
			String fullProductionBudget, String expectedBudgetSpendInJA,
			String numberOFForeignCrewHired, String numberJamaicaCrewHired,
			String valueOfBondWaiver, String customsBroker,
			String localProductionManagerOrFixer) {

		return _filmApplicationRegisterLocalService.
			updateFilmApplicationRegister(
				caseId, nameOfApplicant, registrationDate,
				filmRegistrationNumber, titleOfProductionOrProject,
				dateOfRegistrationPermitIssued, productionCompany,
				technicalFormatOfProduction, OriginOfProductionCompany,
				permitsRequired, shootLocationInJamaica, preProductionDate,
				productionStartDate, proposedDateOfArrival, portOfEntry,
				proposedDateOfDeparture, fullProductionBudget,
				expectedBudgetSpendInJA, numberOFForeignCrewHired,
				numberJamaicaCrewHired, valueOfBondWaiver, customsBroker,
				localProductionManagerOrFixer);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _filmApplicationRegisterLocalService.getBasePersistence();
	}

	@Override
	public FilmApplicationRegisterLocalService getWrappedService() {
		return _filmApplicationRegisterLocalService;
	}

	@Override
	public void setWrappedService(
		FilmApplicationRegisterLocalService
			filmApplicationRegisterLocalService) {

		_filmApplicationRegisterLocalService =
			filmApplicationRegisterLocalService;
	}

	private FilmApplicationRegisterLocalService
		_filmApplicationRegisterLocalService;

}