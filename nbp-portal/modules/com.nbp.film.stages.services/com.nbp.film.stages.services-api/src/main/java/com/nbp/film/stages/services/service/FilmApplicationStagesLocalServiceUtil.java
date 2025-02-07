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

import com.nbp.film.stages.services.model.FilmApplicationStages;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FilmApplicationStages. This utility wraps
 * <code>com.nbp.film.stages.services.service.impl.FilmApplicationStagesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationStagesLocalService
 * @generated
 */
public class FilmApplicationStagesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.film.stages.services.service.impl.FilmApplicationStagesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the film application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmApplicationStages the film application stages
	 * @return the film application stages that was added
	 */
	public static FilmApplicationStages addFilmApplicationStages(
		FilmApplicationStages filmApplicationStages) {

		return getService().addFilmApplicationStages(filmApplicationStages);
	}

	/**
	 * Creates a new film application stages with the primary key. Does not add the film application stages to the database.
	 *
	 * @param filmApplicationStagesId the primary key for the new film application stages
	 * @return the new film application stages
	 */
	public static FilmApplicationStages createFilmApplicationStages(
		long filmApplicationStagesId) {

		return getService().createFilmApplicationStages(
			filmApplicationStagesId);
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
	 * Deletes the film application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmApplicationStages the film application stages
	 * @return the film application stages that was removed
	 */
	public static FilmApplicationStages deleteFilmApplicationStages(
		FilmApplicationStages filmApplicationStages) {

		return getService().deleteFilmApplicationStages(filmApplicationStages);
	}

	/**
	 * Deletes the film application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmApplicationStagesId the primary key of the film application stages
	 * @return the film application stages that was removed
	 * @throws PortalException if a film application stages with the primary key could not be found
	 */
	public static FilmApplicationStages deleteFilmApplicationStages(
			long filmApplicationStagesId)
		throws PortalException {

		return getService().deleteFilmApplicationStages(
			filmApplicationStagesId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.stages.services.model.impl.FilmApplicationStagesModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.stages.services.model.impl.FilmApplicationStagesModelImpl</code>.
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

	public static FilmApplicationStages fetchFilmApplicationStages(
		long filmApplicationStagesId) {

		return getService().fetchFilmApplicationStages(filmApplicationStagesId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<FilmApplicationStages> getFAS_StageName_StageStatus(
		String stageName, String status) {

		return getService().getFAS_StageName_StageStatus(stageName, status);
	}

	/**
	 * Returns the film application stages with the primary key.
	 *
	 * @param filmApplicationStagesId the primary key of the film application stages
	 * @return the film application stages
	 * @throws PortalException if a film application stages with the primary key could not be found
	 */
	public static FilmApplicationStages getFilmApplicationStages(
			long filmApplicationStagesId)
		throws PortalException {

		return getService().getFilmApplicationStages(filmApplicationStagesId);
	}

	/**
	 * Returns a range of all the film application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.stages.services.model.impl.FilmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application stageses
	 * @param end the upper bound of the range of film application stageses (not inclusive)
	 * @return the range of film application stageses
	 */
	public static List<FilmApplicationStages> getFilmApplicationStageses(
		int start, int end) {

		return getService().getFilmApplicationStageses(start, end);
	}

	/**
	 * Returns the number of film application stageses.
	 *
	 * @return the number of film application stageses
	 */
	public static int getFilmApplicationStagesesCount() {
		return getService().getFilmApplicationStagesesCount();
	}

	public static List<FilmApplicationStages> getFilmByCI(String caseId) {
		return getService().getFilmByCI(caseId);
	}

	public static FilmApplicationStages getFilmByCI_SN(
			String caseId, String stageName)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationStagesException {

		return getService().getFilmByCI_SN(caseId, stageName);
	}

	public static FilmApplicationStages getFilmByCI_ST(
			String caseId, String status)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationStagesException {

		return getService().getFilmByCI_ST(caseId, status);
	}

	public static FilmApplicationStages getFilmByCI_ST_SN(
			String CaseId, String stageStatus, String StageName)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationStagesException {

		return getService().getFilmByCI_ST_SN(CaseId, stageStatus, StageName);
	}

	public static FilmApplicationStages getFilmByFAI(long filmApplicationId)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationStagesException {

		return getService().getFilmByFAI(filmApplicationId);
	}

	public static List<FilmApplicationStages> getFilmBySN(String stageName) {
		return getService().getFilmBySN(stageName);
	}

	public static String getfilmCurrentStage(String caseId) {
		return getService().getfilmCurrentStage(caseId);
	}

	public static List<String> getFilmDistinctStages() {
		return getService().getFilmDistinctStages();
	}

	public static Long getFilmSeenCases() {
		return getService().getFilmSeenCases();
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
	 * Updates the film application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmApplicationStages the film application stages
	 * @return the film application stages that was updated
	 */
	public static FilmApplicationStages updateFilmApplicationStages(
		FilmApplicationStages filmApplicationStages) {

		return getService().updateFilmApplicationStages(filmApplicationStages);
	}

	public static FilmApplicationStages updateFilmApplicationStages(
		String caseId, String stageName, java.util.Date stageStartDate,
		java.util.Date stageEndDate, String duration, String stageStatus) {

		return getService().updateFilmApplicationStages(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	public static FilmApplicationStagesLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<FilmApplicationStagesLocalService>
		_serviceSnapshot = new Snapshot<>(
			FilmApplicationStagesLocalServiceUtil.class,
			FilmApplicationStagesLocalService.class);

}