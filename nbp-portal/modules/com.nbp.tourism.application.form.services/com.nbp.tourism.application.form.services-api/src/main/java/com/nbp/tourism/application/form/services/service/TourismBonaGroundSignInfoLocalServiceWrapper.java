/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismBonaGroundSignInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundSignInfoLocalService
 * @generated
 */
public class TourismBonaGroundSignInfoLocalServiceWrapper
	implements ServiceWrapper<TourismBonaGroundSignInfoLocalService>,
			   TourismBonaGroundSignInfoLocalService {

	public TourismBonaGroundSignInfoLocalServiceWrapper() {
		this(null);
	}

	public TourismBonaGroundSignInfoLocalServiceWrapper(
		TourismBonaGroundSignInfoLocalService
			tourismBonaGroundSignInfoLocalService) {

		_tourismBonaGroundSignInfoLocalService =
			tourismBonaGroundSignInfoLocalService;
	}

	/**
	 * Adds the tourism bona ground sign info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundSignInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundSignInfo the tourism bona ground sign info
	 * @return the tourism bona ground sign info that was added
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaGroundSignInfo addTourismBonaGroundSignInfo(
				com.nbp.tourism.application.form.services.model.
					TourismBonaGroundSignInfo tourismBonaGroundSignInfo) {

		return _tourismBonaGroundSignInfoLocalService.
			addTourismBonaGroundSignInfo(tourismBonaGroundSignInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundSignInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism bona ground sign info with the primary key. Does not add the tourism bona ground sign info to the database.
	 *
	 * @param tourismBonaGroundSignInfoId the primary key for the new tourism bona ground sign info
	 * @return the new tourism bona ground sign info
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaGroundSignInfo createTourismBonaGroundSignInfo(
				long tourismBonaGroundSignInfoId) {

		return _tourismBonaGroundSignInfoLocalService.
			createTourismBonaGroundSignInfo(tourismBonaGroundSignInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundSignInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the tourism bona ground sign info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundSignInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundSignInfoId the primary key of the tourism bona ground sign info
	 * @return the tourism bona ground sign info that was removed
	 * @throws PortalException if a tourism bona ground sign info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaGroundSignInfo deleteTourismBonaGroundSignInfo(
					long tourismBonaGroundSignInfoId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundSignInfoLocalService.
			deleteTourismBonaGroundSignInfo(tourismBonaGroundSignInfoId);
	}

	/**
	 * Deletes the tourism bona ground sign info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundSignInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundSignInfo the tourism bona ground sign info
	 * @return the tourism bona ground sign info that was removed
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaGroundSignInfo deleteTourismBonaGroundSignInfo(
				com.nbp.tourism.application.form.services.model.
					TourismBonaGroundSignInfo tourismBonaGroundSignInfo) {

		return _tourismBonaGroundSignInfoLocalService.
			deleteTourismBonaGroundSignInfo(tourismBonaGroundSignInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismBonaGroundSignInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismBonaGroundSignInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismBonaGroundSignInfoLocalService.dynamicQuery();
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

		return _tourismBonaGroundSignInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundSignInfoModelImpl</code>.
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

		return _tourismBonaGroundSignInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundSignInfoModelImpl</code>.
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

		return _tourismBonaGroundSignInfoLocalService.dynamicQuery(
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

		return _tourismBonaGroundSignInfoLocalService.dynamicQueryCount(
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

		return _tourismBonaGroundSignInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaGroundSignInfo fetchTourismBonaGroundSignInfo(
				long tourismBonaGroundSignInfoId) {

		return _tourismBonaGroundSignInfoLocalService.
			fetchTourismBonaGroundSignInfo(tourismBonaGroundSignInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismBonaGroundSignInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismBonaGroundSignInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaGroundSignInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundSignInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the tourism bona ground sign info with the primary key.
	 *
	 * @param tourismBonaGroundSignInfoId the primary key of the tourism bona ground sign info
	 * @return the tourism bona ground sign info
	 * @throws PortalException if a tourism bona ground sign info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaGroundSignInfo getTourismBonaGroundSignInfo(
					long tourismBonaGroundSignInfoId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundSignInfoLocalService.
			getTourismBonaGroundSignInfo(tourismBonaGroundSignInfoId);
	}

	/**
	 * Returns a range of all the tourism bona ground sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground sign infos
	 * @param end the upper bound of the range of tourism bona ground sign infos (not inclusive)
	 * @return the range of tourism bona ground sign infos
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismBonaGroundSignInfo> getTourismBonaGroundSignInfos(
				int start, int end) {

		return _tourismBonaGroundSignInfoLocalService.
			getTourismBonaGroundSignInfos(start, end);
	}

	/**
	 * Returns the number of tourism bona ground sign infos.
	 *
	 * @return the number of tourism bona ground sign infos
	 */
	@Override
	public int getTourismBonaGroundSignInfosCount() {
		return _tourismBonaGroundSignInfoLocalService.
			getTourismBonaGroundSignInfosCount();
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaGroundSignInfo getTourismById(long tourismApplicationId)
				throws com.nbp.tourism.application.form.services.exception.
					NoSuchTourismBonaGroundSignInfoException {

		return _tourismBonaGroundSignInfoLocalService.getTourismById(
			tourismApplicationId);
	}

	/**
	 * Updates the tourism bona ground sign info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundSignInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundSignInfo the tourism bona ground sign info
	 * @return the tourism bona ground sign info that was updated
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaGroundSignInfo updateTourismBonaGroundSignInfo(
				com.nbp.tourism.application.form.services.model.
					TourismBonaGroundSignInfo tourismBonaGroundSignInfo) {

		return _tourismBonaGroundSignInfoLocalService.
			updateTourismBonaGroundSignInfo(tourismBonaGroundSignInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismBonaGroundSignInfoLocalService.getBasePersistence();
	}

	@Override
	public TourismBonaGroundSignInfoLocalService getWrappedService() {
		return _tourismBonaGroundSignInfoLocalService;
	}

	@Override
	public void setWrappedService(
		TourismBonaGroundSignInfoLocalService
			tourismBonaGroundSignInfoLocalService) {

		_tourismBonaGroundSignInfoLocalService =
			tourismBonaGroundSignInfoLocalService;
	}

	private TourismBonaGroundSignInfoLocalService
		_tourismBonaGroundSignInfoLocalService;

}