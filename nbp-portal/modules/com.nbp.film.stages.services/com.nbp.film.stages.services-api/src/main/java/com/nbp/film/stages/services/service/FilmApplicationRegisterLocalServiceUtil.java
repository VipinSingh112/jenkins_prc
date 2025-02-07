/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.film.stages.services.model.FilmApplicationRegister;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FilmApplicationRegister. This utility wraps
 * <code>com.nbp.film.stages.services.service.impl.FilmApplicationRegisterLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationRegisterLocalService
 * @generated
 */
public class FilmApplicationRegisterLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.film.stages.services.service.impl.FilmApplicationRegisterLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static FilmApplicationRegister addFilmApplicationRegister(
		FilmApplicationRegister filmApplicationRegister) {

		return getService().addFilmApplicationRegister(filmApplicationRegister);
	}

	/**
	 * Creates a new film application register with the primary key. Does not add the film application register to the database.
	 *
	 * @param filmApplicationRegisterId the primary key for the new film application register
	 * @return the new film application register
	 */
	public static FilmApplicationRegister createFilmApplicationRegister(
		long filmApplicationRegisterId) {

		return getService().createFilmApplicationRegister(
			filmApplicationRegisterId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
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
	public static FilmApplicationRegister deleteFilmApplicationRegister(
		FilmApplicationRegister filmApplicationRegister) {

		return getService().deleteFilmApplicationRegister(
			filmApplicationRegister);
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
	public static FilmApplicationRegister deleteFilmApplicationRegister(
			long filmApplicationRegisterId)
		throws PortalException {

		return getService().deleteFilmApplicationRegister(
			filmApplicationRegisterId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static FilmApplicationRegister fetchFilmApplicationRegister(
		long filmApplicationRegisterId) {

		return getService().fetchFilmApplicationRegister(
			filmApplicationRegisterId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static FilmApplicationRegister getApplicationRegisterBy_CI(
		String caseId) {

		return getService().getApplicationRegisterBy_CI(caseId);
	}

	/**
	 * Returns the film application register with the primary key.
	 *
	 * @param filmApplicationRegisterId the primary key of the film application register
	 * @return the film application register
	 * @throws PortalException if a film application register with the primary key could not be found
	 */
	public static FilmApplicationRegister getFilmApplicationRegister(
			long filmApplicationRegisterId)
		throws PortalException {

		return getService().getFilmApplicationRegister(
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
	public static List<FilmApplicationRegister> getFilmApplicationRegisters(
		int start, int end) {

		return getService().getFilmApplicationRegisters(start, end);
	}

	/**
	 * Returns the number of film application registers.
	 *
	 * @return the number of film application registers
	 */
	public static int getFilmApplicationRegistersCount() {
		return getService().getFilmApplicationRegistersCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
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
	public static FilmApplicationRegister updateFilmApplicationRegister(
		FilmApplicationRegister filmApplicationRegister) {

		return getService().updateFilmApplicationRegister(
			filmApplicationRegister);
	}

	public static FilmApplicationRegister updateFilmApplicationRegister(
		String caseId, String nameOfApplicant, java.sql.Date registrationDate,
		String filmRegistrationNumber, String titleOfProductionOrProject,
		java.sql.Date dateOfRegistrationPermitIssued, String productionCompany,
		String technicalFormatOfProduction, String OriginOfProductionCompany,
		String permitsRequired, String shootLocationInJamaica,
		java.sql.Date preProductionDate, java.sql.Date productionStartDate,
		String proposedDateOfArrival, String portOfEntry,
		java.sql.Date proposedDateOfDeparture, String fullProductionBudget,
		String expectedBudgetSpendInJA, String numberOFForeignCrewHired,
		String numberJamaicaCrewHired, String valueOfBondWaiver,
		String customsBroker, String localProductionManagerOrFixer) {

		return getService().updateFilmApplicationRegister(
			caseId, nameOfApplicant, registrationDate, filmRegistrationNumber,
			titleOfProductionOrProject, dateOfRegistrationPermitIssued,
			productionCompany, technicalFormatOfProduction,
			OriginOfProductionCompany, permitsRequired, shootLocationInJamaica,
			preProductionDate, productionStartDate, proposedDateOfArrival,
			portOfEntry, proposedDateOfDeparture, fullProductionBudget,
			expectedBudgetSpendInJA, numberOFForeignCrewHired,
			numberJamaicaCrewHired, valueOfBondWaiver, customsBroker,
			localProductionManagerOrFixer);
	}

	public static FilmApplicationRegisterLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<FilmApplicationRegisterLocalService>
		_serviceSnapshot = new Snapshot<>(
			FilmApplicationRegisterLocalServiceUtil.class,
			FilmApplicationRegisterLocalService.class);

}