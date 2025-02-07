/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismBonaWaterSportSignInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaWaterSportSignInfoLocalService
 * @generated
 */
public class TourismBonaWaterSportSignInfoLocalServiceWrapper
	implements ServiceWrapper<TourismBonaWaterSportSignInfoLocalService>,
			   TourismBonaWaterSportSignInfoLocalService {

	public TourismBonaWaterSportSignInfoLocalServiceWrapper() {
		this(null);
	}

	public TourismBonaWaterSportSignInfoLocalServiceWrapper(
		TourismBonaWaterSportSignInfoLocalService
			tourismBonaWaterSportSignInfoLocalService) {

		_tourismBonaWaterSportSignInfoLocalService =
			tourismBonaWaterSportSignInfoLocalService;
	}

	/**
	 * Adds the tourism bona water sport sign info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaWaterSportSignInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaWaterSportSignInfo the tourism bona water sport sign info
	 * @return the tourism bona water sport sign info that was added
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportSignInfo addTourismBonaWaterSportSignInfo(
			com.nbp.tourism.application.form.services.model.
				TourismBonaWaterSportSignInfo tourismBonaWaterSportSignInfo) {

		return _tourismBonaWaterSportSignInfoLocalService.
			addTourismBonaWaterSportSignInfo(tourismBonaWaterSportSignInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaWaterSportSignInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism bona water sport sign info with the primary key. Does not add the tourism bona water sport sign info to the database.
	 *
	 * @param tourismBonaWSSignId the primary key for the new tourism bona water sport sign info
	 * @return the new tourism bona water sport sign info
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportSignInfo createTourismBonaWaterSportSignInfo(
			long tourismBonaWSSignId) {

		return _tourismBonaWaterSportSignInfoLocalService.
			createTourismBonaWaterSportSignInfo(tourismBonaWSSignId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaWaterSportSignInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the tourism bona water sport sign info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaWaterSportSignInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaWSSignId the primary key of the tourism bona water sport sign info
	 * @return the tourism bona water sport sign info that was removed
	 * @throws PortalException if a tourism bona water sport sign info with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportSignInfo deleteTourismBonaWaterSportSignInfo(
				long tourismBonaWSSignId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaWaterSportSignInfoLocalService.
			deleteTourismBonaWaterSportSignInfo(tourismBonaWSSignId);
	}

	/**
	 * Deletes the tourism bona water sport sign info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaWaterSportSignInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaWaterSportSignInfo the tourism bona water sport sign info
	 * @return the tourism bona water sport sign info that was removed
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportSignInfo deleteTourismBonaWaterSportSignInfo(
			com.nbp.tourism.application.form.services.model.
				TourismBonaWaterSportSignInfo tourismBonaWaterSportSignInfo) {

		return _tourismBonaWaterSportSignInfoLocalService.
			deleteTourismBonaWaterSportSignInfo(tourismBonaWaterSportSignInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismBonaWaterSportSignInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismBonaWaterSportSignInfoLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismBonaWaterSportSignInfoLocalService.dynamicQuery();
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

		return _tourismBonaWaterSportSignInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaWaterSportSignInfoModelImpl</code>.
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

		return _tourismBonaWaterSportSignInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaWaterSportSignInfoModelImpl</code>.
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

		return _tourismBonaWaterSportSignInfoLocalService.dynamicQuery(
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

		return _tourismBonaWaterSportSignInfoLocalService.dynamicQueryCount(
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

		return _tourismBonaWaterSportSignInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportSignInfo fetchTourismBonaWaterSportSignInfo(
			long tourismBonaWSSignId) {

		return _tourismBonaWaterSportSignInfoLocalService.
			fetchTourismBonaWaterSportSignInfo(tourismBonaWSSignId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismBonaWaterSportSignInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismBonaWaterSportSignInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaWaterSportSignInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaWaterSportSignInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the tourism bona water sport sign info with the primary key.
	 *
	 * @param tourismBonaWSSignId the primary key of the tourism bona water sport sign info
	 * @return the tourism bona water sport sign info
	 * @throws PortalException if a tourism bona water sport sign info with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportSignInfo getTourismBonaWaterSportSignInfo(
				long tourismBonaWSSignId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaWaterSportSignInfoLocalService.
			getTourismBonaWaterSportSignInfo(tourismBonaWSSignId);
	}

	/**
	 * Returns a range of all the tourism bona water sport sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaWaterSportSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sport sign infos
	 * @param end the upper bound of the range of tourism bona water sport sign infos (not inclusive)
	 * @return the range of tourism bona water sport sign infos
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismBonaWaterSportSignInfo> getTourismBonaWaterSportSignInfos(
				int start, int end) {

		return _tourismBonaWaterSportSignInfoLocalService.
			getTourismBonaWaterSportSignInfos(start, end);
	}

	/**
	 * Returns the number of tourism bona water sport sign infos.
	 *
	 * @return the number of tourism bona water sport sign infos
	 */
	@Override
	public int getTourismBonaWaterSportSignInfosCount() {
		return _tourismBonaWaterSportSignInfoLocalService.
			getTourismBonaWaterSportSignInfosCount();
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportSignInfo getTourismById(long tourismApplicationId)
			throws com.nbp.tourism.application.form.services.exception.
				NoSuchTourismBonaWaterSportSignInfoException {

		return _tourismBonaWaterSportSignInfoLocalService.getTourismById(
			tourismApplicationId);
	}

	/**
	 * Updates the tourism bona water sport sign info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaWaterSportSignInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaWaterSportSignInfo the tourism bona water sport sign info
	 * @return the tourism bona water sport sign info that was updated
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportSignInfo updateTourismBonaWaterSportSignInfo(
			com.nbp.tourism.application.form.services.model.
				TourismBonaWaterSportSignInfo tourismBonaWaterSportSignInfo) {

		return _tourismBonaWaterSportSignInfoLocalService.
			updateTourismBonaWaterSportSignInfo(tourismBonaWaterSportSignInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismBonaWaterSportSignInfoLocalService.getBasePersistence();
	}

	@Override
	public TourismBonaWaterSportSignInfoLocalService getWrappedService() {
		return _tourismBonaWaterSportSignInfoLocalService;
	}

	@Override
	public void setWrappedService(
		TourismBonaWaterSportSignInfoLocalService
			tourismBonaWaterSportSignInfoLocalService) {

		_tourismBonaWaterSportSignInfoLocalService =
			tourismBonaWaterSportSignInfoLocalService;
	}

	private TourismBonaWaterSportSignInfoLocalService
		_tourismBonaWaterSportSignInfoLocalService;

}