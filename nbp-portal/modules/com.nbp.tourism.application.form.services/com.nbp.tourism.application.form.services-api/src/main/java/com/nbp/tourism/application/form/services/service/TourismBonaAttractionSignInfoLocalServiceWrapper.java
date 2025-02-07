/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismBonaAttractionSignInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionSignInfoLocalService
 * @generated
 */
public class TourismBonaAttractionSignInfoLocalServiceWrapper
	implements ServiceWrapper<TourismBonaAttractionSignInfoLocalService>,
			   TourismBonaAttractionSignInfoLocalService {

	public TourismBonaAttractionSignInfoLocalServiceWrapper() {
		this(null);
	}

	public TourismBonaAttractionSignInfoLocalServiceWrapper(
		TourismBonaAttractionSignInfoLocalService
			tourismBonaAttractionSignInfoLocalService) {

		_tourismBonaAttractionSignInfoLocalService =
			tourismBonaAttractionSignInfoLocalService;
	}

	/**
	 * Adds the tourism bona attraction sign info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAttractionSignInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAttractionSignInfo the tourism bona attraction sign info
	 * @return the tourism bona attraction sign info that was added
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionSignInfo addTourismBonaAttractionSignInfo(
			com.nbp.tourism.application.form.services.model.
				TourismBonaAttractionSignInfo tourismBonaAttractionSignInfo) {

		return _tourismBonaAttractionSignInfoLocalService.
			addTourismBonaAttractionSignInfo(tourismBonaAttractionSignInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAttractionSignInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism bona attraction sign info with the primary key. Does not add the tourism bona attraction sign info to the database.
	 *
	 * @param tourismBonAttrSignId the primary key for the new tourism bona attraction sign info
	 * @return the new tourism bona attraction sign info
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionSignInfo createTourismBonaAttractionSignInfo(
			long tourismBonAttrSignId) {

		return _tourismBonaAttractionSignInfoLocalService.
			createTourismBonaAttractionSignInfo(tourismBonAttrSignId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAttractionSignInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the tourism bona attraction sign info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAttractionSignInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonAttrSignId the primary key of the tourism bona attraction sign info
	 * @return the tourism bona attraction sign info that was removed
	 * @throws PortalException if a tourism bona attraction sign info with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionSignInfo deleteTourismBonaAttractionSignInfo(
				long tourismBonAttrSignId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAttractionSignInfoLocalService.
			deleteTourismBonaAttractionSignInfo(tourismBonAttrSignId);
	}

	/**
	 * Deletes the tourism bona attraction sign info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAttractionSignInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAttractionSignInfo the tourism bona attraction sign info
	 * @return the tourism bona attraction sign info that was removed
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionSignInfo deleteTourismBonaAttractionSignInfo(
			com.nbp.tourism.application.form.services.model.
				TourismBonaAttractionSignInfo tourismBonaAttractionSignInfo) {

		return _tourismBonaAttractionSignInfoLocalService.
			deleteTourismBonaAttractionSignInfo(tourismBonaAttractionSignInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismBonaAttractionSignInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismBonaAttractionSignInfoLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismBonaAttractionSignInfoLocalService.dynamicQuery();
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

		return _tourismBonaAttractionSignInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionSignInfoModelImpl</code>.
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

		return _tourismBonaAttractionSignInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionSignInfoModelImpl</code>.
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

		return _tourismBonaAttractionSignInfoLocalService.dynamicQuery(
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

		return _tourismBonaAttractionSignInfoLocalService.dynamicQueryCount(
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

		return _tourismBonaAttractionSignInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionSignInfo fetchTourismBonaAttractionSignInfo(
			long tourismBonAttrSignId) {

		return _tourismBonaAttractionSignInfoLocalService.
			fetchTourismBonaAttractionSignInfo(tourismBonAttrSignId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismBonaAttractionSignInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismBonaAttractionSignInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaAttractionSignInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAttractionSignInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the tourism bona attraction sign info with the primary key.
	 *
	 * @param tourismBonAttrSignId the primary key of the tourism bona attraction sign info
	 * @return the tourism bona attraction sign info
	 * @throws PortalException if a tourism bona attraction sign info with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionSignInfo getTourismBonaAttractionSignInfo(
				long tourismBonAttrSignId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAttractionSignInfoLocalService.
			getTourismBonaAttractionSignInfo(tourismBonAttrSignId);
	}

	/**
	 * Returns a range of all the tourism bona attraction sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction sign infos
	 * @param end the upper bound of the range of tourism bona attraction sign infos (not inclusive)
	 * @return the range of tourism bona attraction sign infos
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismBonaAttractionSignInfo> getTourismBonaAttractionSignInfos(
				int start, int end) {

		return _tourismBonaAttractionSignInfoLocalService.
			getTourismBonaAttractionSignInfos(start, end);
	}

	/**
	 * Returns the number of tourism bona attraction sign infos.
	 *
	 * @return the number of tourism bona attraction sign infos
	 */
	@Override
	public int getTourismBonaAttractionSignInfosCount() {
		return _tourismBonaAttractionSignInfoLocalService.
			getTourismBonaAttractionSignInfosCount();
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionSignInfo getTourismById(long tourismApplicationId)
			throws com.nbp.tourism.application.form.services.exception.
				NoSuchTourismBonaAttractionSignInfoException {

		return _tourismBonaAttractionSignInfoLocalService.getTourismById(
			tourismApplicationId);
	}

	/**
	 * Updates the tourism bona attraction sign info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAttractionSignInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAttractionSignInfo the tourism bona attraction sign info
	 * @return the tourism bona attraction sign info that was updated
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionSignInfo updateTourismBonaAttractionSignInfo(
			com.nbp.tourism.application.form.services.model.
				TourismBonaAttractionSignInfo tourismBonaAttractionSignInfo) {

		return _tourismBonaAttractionSignInfoLocalService.
			updateTourismBonaAttractionSignInfo(tourismBonaAttractionSignInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismBonaAttractionSignInfoLocalService.getBasePersistence();
	}

	@Override
	public TourismBonaAttractionSignInfoLocalService getWrappedService() {
		return _tourismBonaAttractionSignInfoLocalService;
	}

	@Override
	public void setWrappedService(
		TourismBonaAttractionSignInfoLocalService
			tourismBonaAttractionSignInfoLocalService) {

		_tourismBonaAttractionSignInfoLocalService =
			tourismBonaAttractionSignInfoLocalService;
	}

	private TourismBonaAttractionSignInfoLocalService
		_tourismBonaAttractionSignInfoLocalService;

}