/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismBonaOperatorInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaOperatorInfoLocalService
 * @generated
 */
public class TourismBonaOperatorInfoLocalServiceWrapper
	implements ServiceWrapper<TourismBonaOperatorInfoLocalService>,
			   TourismBonaOperatorInfoLocalService {

	public TourismBonaOperatorInfoLocalServiceWrapper() {
		this(null);
	}

	public TourismBonaOperatorInfoLocalServiceWrapper(
		TourismBonaOperatorInfoLocalService
			tourismBonaOperatorInfoLocalService) {

		_tourismBonaOperatorInfoLocalService =
			tourismBonaOperatorInfoLocalService;
	}

	/**
	 * Adds the tourism bona operator info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaOperatorInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaOperatorInfo the tourism bona operator info
	 * @return the tourism bona operator info that was added
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaOperatorInfo
			addTourismBonaOperatorInfo(
				com.nbp.tourism.application.form.services.model.
					TourismBonaOperatorInfo tourismBonaOperatorInfo) {

		return _tourismBonaOperatorInfoLocalService.addTourismBonaOperatorInfo(
			tourismBonaOperatorInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaOperatorInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism bona operator info with the primary key. Does not add the tourism bona operator info to the database.
	 *
	 * @param tourismBonaOperatorInfoId the primary key for the new tourism bona operator info
	 * @return the new tourism bona operator info
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaOperatorInfo
			createTourismBonaOperatorInfo(long tourismBonaOperatorInfoId) {

		return _tourismBonaOperatorInfoLocalService.
			createTourismBonaOperatorInfo(tourismBonaOperatorInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaOperatorInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the tourism bona operator info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaOperatorInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaOperatorInfoId the primary key of the tourism bona operator info
	 * @return the tourism bona operator info that was removed
	 * @throws PortalException if a tourism bona operator info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaOperatorInfo
				deleteTourismBonaOperatorInfo(long tourismBonaOperatorInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaOperatorInfoLocalService.
			deleteTourismBonaOperatorInfo(tourismBonaOperatorInfoId);
	}

	/**
	 * Deletes the tourism bona operator info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaOperatorInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaOperatorInfo the tourism bona operator info
	 * @return the tourism bona operator info that was removed
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaOperatorInfo
			deleteTourismBonaOperatorInfo(
				com.nbp.tourism.application.form.services.model.
					TourismBonaOperatorInfo tourismBonaOperatorInfo) {

		return _tourismBonaOperatorInfoLocalService.
			deleteTourismBonaOperatorInfo(tourismBonaOperatorInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismBonaOperatorInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismBonaOperatorInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismBonaOperatorInfoLocalService.dynamicQuery();
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

		return _tourismBonaOperatorInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaOperatorInfoModelImpl</code>.
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

		return _tourismBonaOperatorInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaOperatorInfoModelImpl</code>.
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

		return _tourismBonaOperatorInfoLocalService.dynamicQuery(
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

		return _tourismBonaOperatorInfoLocalService.dynamicQueryCount(
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

		return _tourismBonaOperatorInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaOperatorInfo
			fetchTourismBonaOperatorInfo(long tourismBonaOperatorInfoId) {

		return _tourismBonaOperatorInfoLocalService.
			fetchTourismBonaOperatorInfo(tourismBonaOperatorInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismBonaOperatorInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismBonaOperatorInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaOperatorInfo
				getOperatorInfoById(long tourismApplicationId)
			throws com.nbp.tourism.application.form.services.exception.
				NoSuchTourismBonaOperatorInfoException {

		return _tourismBonaOperatorInfoLocalService.getOperatorInfoById(
			tourismApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaOperatorInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaOperatorInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the tourism bona operator info with the primary key.
	 *
	 * @param tourismBonaOperatorInfoId the primary key of the tourism bona operator info
	 * @return the tourism bona operator info
	 * @throws PortalException if a tourism bona operator info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaOperatorInfo
				getTourismBonaOperatorInfo(long tourismBonaOperatorInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaOperatorInfoLocalService.getTourismBonaOperatorInfo(
			tourismBonaOperatorInfoId);
	}

	/**
	 * Returns a range of all the tourism bona operator infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaOperatorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona operator infos
	 * @param end the upper bound of the range of tourism bona operator infos (not inclusive)
	 * @return the range of tourism bona operator infos
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismBonaOperatorInfo> getTourismBonaOperatorInfos(
				int start, int end) {

		return _tourismBonaOperatorInfoLocalService.getTourismBonaOperatorInfos(
			start, end);
	}

	/**
	 * Returns the number of tourism bona operator infos.
	 *
	 * @return the number of tourism bona operator infos
	 */
	@Override
	public int getTourismBonaOperatorInfosCount() {
		return _tourismBonaOperatorInfoLocalService.
			getTourismBonaOperatorInfosCount();
	}

	/**
	 * Updates the tourism bona operator info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaOperatorInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaOperatorInfo the tourism bona operator info
	 * @return the tourism bona operator info that was updated
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaOperatorInfo
			updateTourismBonaOperatorInfo(
				com.nbp.tourism.application.form.services.model.
					TourismBonaOperatorInfo tourismBonaOperatorInfo) {

		return _tourismBonaOperatorInfoLocalService.
			updateTourismBonaOperatorInfo(tourismBonaOperatorInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismBonaOperatorInfoLocalService.getBasePersistence();
	}

	@Override
	public TourismBonaOperatorInfoLocalService getWrappedService() {
		return _tourismBonaOperatorInfoLocalService;
	}

	@Override
	public void setWrappedService(
		TourismBonaOperatorInfoLocalService
			tourismBonaOperatorInfoLocalService) {

		_tourismBonaOperatorInfoLocalService =
			tourismBonaOperatorInfoLocalService;
	}

	private TourismBonaOperatorInfoLocalService
		_tourismBonaOperatorInfoLocalService;

}