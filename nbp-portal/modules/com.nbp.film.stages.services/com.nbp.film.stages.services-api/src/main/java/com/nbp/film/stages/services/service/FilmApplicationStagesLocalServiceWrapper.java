/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FilmApplicationStagesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationStagesLocalService
 * @generated
 */
public class FilmApplicationStagesLocalServiceWrapper
	implements FilmApplicationStagesLocalService,
			   ServiceWrapper<FilmApplicationStagesLocalService> {

	public FilmApplicationStagesLocalServiceWrapper() {
		this(null);
	}

	public FilmApplicationStagesLocalServiceWrapper(
		FilmApplicationStagesLocalService filmApplicationStagesLocalService) {

		_filmApplicationStagesLocalService = filmApplicationStagesLocalService;
	}

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
	@Override
	public com.nbp.film.stages.services.model.FilmApplicationStages
		addFilmApplicationStages(
			com.nbp.film.stages.services.model.FilmApplicationStages
				filmApplicationStages) {

		return _filmApplicationStagesLocalService.addFilmApplicationStages(
			filmApplicationStages);
	}

	/**
	 * Creates a new film application stages with the primary key. Does not add the film application stages to the database.
	 *
	 * @param filmApplicationStagesId the primary key for the new film application stages
	 * @return the new film application stages
	 */
	@Override
	public com.nbp.film.stages.services.model.FilmApplicationStages
		createFilmApplicationStages(long filmApplicationStagesId) {

		return _filmApplicationStagesLocalService.createFilmApplicationStages(
			filmApplicationStagesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmApplicationStagesLocalService.createPersistedModel(
			primaryKeyObj);
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
	@Override
	public com.nbp.film.stages.services.model.FilmApplicationStages
		deleteFilmApplicationStages(
			com.nbp.film.stages.services.model.FilmApplicationStages
				filmApplicationStages) {

		return _filmApplicationStagesLocalService.deleteFilmApplicationStages(
			filmApplicationStages);
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
	@Override
	public com.nbp.film.stages.services.model.FilmApplicationStages
			deleteFilmApplicationStages(long filmApplicationStagesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmApplicationStagesLocalService.deleteFilmApplicationStages(
			filmApplicationStagesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmApplicationStagesLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _filmApplicationStagesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _filmApplicationStagesLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _filmApplicationStagesLocalService.dynamicQuery();
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

		return _filmApplicationStagesLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _filmApplicationStagesLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _filmApplicationStagesLocalService.dynamicQuery(
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

		return _filmApplicationStagesLocalService.dynamicQueryCount(
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

		return _filmApplicationStagesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.film.stages.services.model.FilmApplicationStages
		fetchFilmApplicationStages(long filmApplicationStagesId) {

		return _filmApplicationStagesLocalService.fetchFilmApplicationStages(
			filmApplicationStagesId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _filmApplicationStagesLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.film.stages.services.model.FilmApplicationStages>
			getFAS_StageName_StageStatus(String stageName, String status) {

		return _filmApplicationStagesLocalService.getFAS_StageName_StageStatus(
			stageName, status);
	}

	/**
	 * Returns the film application stages with the primary key.
	 *
	 * @param filmApplicationStagesId the primary key of the film application stages
	 * @return the film application stages
	 * @throws PortalException if a film application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.film.stages.services.model.FilmApplicationStages
			getFilmApplicationStages(long filmApplicationStagesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmApplicationStagesLocalService.getFilmApplicationStages(
			filmApplicationStagesId);
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
	@Override
	public java.util.List
		<com.nbp.film.stages.services.model.FilmApplicationStages>
			getFilmApplicationStageses(int start, int end) {

		return _filmApplicationStagesLocalService.getFilmApplicationStageses(
			start, end);
	}

	/**
	 * Returns the number of film application stageses.
	 *
	 * @return the number of film application stageses
	 */
	@Override
	public int getFilmApplicationStagesesCount() {
		return _filmApplicationStagesLocalService.
			getFilmApplicationStagesesCount();
	}

	@Override
	public java.util.List
		<com.nbp.film.stages.services.model.FilmApplicationStages> getFilmByCI(
			String caseId) {

		return _filmApplicationStagesLocalService.getFilmByCI(caseId);
	}

	@Override
	public com.nbp.film.stages.services.model.FilmApplicationStages
			getFilmByCI_SN(String caseId, String stageName)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationStagesException {

		return _filmApplicationStagesLocalService.getFilmByCI_SN(
			caseId, stageName);
	}

	@Override
	public com.nbp.film.stages.services.model.FilmApplicationStages
			getFilmByCI_ST(String caseId, String status)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationStagesException {

		return _filmApplicationStagesLocalService.getFilmByCI_ST(
			caseId, status);
	}

	@Override
	public com.nbp.film.stages.services.model.FilmApplicationStages
			getFilmByCI_ST_SN(
				String CaseId, String stageStatus, String StageName)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationStagesException {

		return _filmApplicationStagesLocalService.getFilmByCI_ST_SN(
			CaseId, stageStatus, StageName);
	}

	@Override
	public com.nbp.film.stages.services.model.FilmApplicationStages
			getFilmByFAI(long filmApplicationId)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationStagesException {

		return _filmApplicationStagesLocalService.getFilmByFAI(
			filmApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.film.stages.services.model.FilmApplicationStages> getFilmBySN(
			String stageName) {

		return _filmApplicationStagesLocalService.getFilmBySN(stageName);
	}

	@Override
	public String getfilmCurrentStage(String caseId) {
		return _filmApplicationStagesLocalService.getfilmCurrentStage(caseId);
	}

	@Override
	public java.util.List<String> getFilmDistinctStages() {
		return _filmApplicationStagesLocalService.getFilmDistinctStages();
	}

	@Override
	public Long getFilmSeenCases() {
		return _filmApplicationStagesLocalService.getFilmSeenCases();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _filmApplicationStagesLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _filmApplicationStagesLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _filmApplicationStagesLocalService.getPersistedModel(
			primaryKeyObj);
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
	@Override
	public com.nbp.film.stages.services.model.FilmApplicationStages
		updateFilmApplicationStages(
			com.nbp.film.stages.services.model.FilmApplicationStages
				filmApplicationStages) {

		return _filmApplicationStagesLocalService.updateFilmApplicationStages(
			filmApplicationStages);
	}

	@Override
	public com.nbp.film.stages.services.model.FilmApplicationStages
		updateFilmApplicationStages(
			String caseId, String stageName, java.util.Date stageStartDate,
			java.util.Date stageEndDate, String duration, String stageStatus) {

		return _filmApplicationStagesLocalService.updateFilmApplicationStages(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _filmApplicationStagesLocalService.getBasePersistence();
	}

	@Override
	public FilmApplicationStagesLocalService getWrappedService() {
		return _filmApplicationStagesLocalService;
	}

	@Override
	public void setWrappedService(
		FilmApplicationStagesLocalService filmApplicationStagesLocalService) {

		_filmApplicationStagesLocalService = filmApplicationStagesLocalService;
	}

	private FilmApplicationStagesLocalService
		_filmApplicationStagesLocalService;

}