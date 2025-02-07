/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismBonaWaterSportEmployeeInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaWaterSportEmployeeInfoLocalService
 * @generated
 */
public class TourismBonaWaterSportEmployeeInfoLocalServiceWrapper
	implements ServiceWrapper<TourismBonaWaterSportEmployeeInfoLocalService>,
			   TourismBonaWaterSportEmployeeInfoLocalService {

	public TourismBonaWaterSportEmployeeInfoLocalServiceWrapper() {
		this(null);
	}

	public TourismBonaWaterSportEmployeeInfoLocalServiceWrapper(
		TourismBonaWaterSportEmployeeInfoLocalService
			tourismBonaWaterSportEmployeeInfoLocalService) {

		_tourismBonaWaterSportEmployeeInfoLocalService =
			tourismBonaWaterSportEmployeeInfoLocalService;
	}

	/**
	 * Adds the tourism bona water sport employee info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaWaterSportEmployeeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaWaterSportEmployeeInfo the tourism bona water sport employee info
	 * @return the tourism bona water sport employee info that was added
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportEmployeeInfo addTourismBonaWaterSportEmployeeInfo(
			com.nbp.tourism.application.form.services.model.
				TourismBonaWaterSportEmployeeInfo
					tourismBonaWaterSportEmployeeInfo) {

		return _tourismBonaWaterSportEmployeeInfoLocalService.
			addTourismBonaWaterSportEmployeeInfo(
				tourismBonaWaterSportEmployeeInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaWaterSportEmployeeInfoLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new tourism bona water sport employee info with the primary key. Does not add the tourism bona water sport employee info to the database.
	 *
	 * @param tourismBonaWSEmplId the primary key for the new tourism bona water sport employee info
	 * @return the new tourism bona water sport employee info
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportEmployeeInfo
			createTourismBonaWaterSportEmployeeInfo(long tourismBonaWSEmplId) {

		return _tourismBonaWaterSportEmployeeInfoLocalService.
			createTourismBonaWaterSportEmployeeInfo(tourismBonaWSEmplId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaWaterSportEmployeeInfoLocalService.
			deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the tourism bona water sport employee info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaWaterSportEmployeeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaWSEmplId the primary key of the tourism bona water sport employee info
	 * @return the tourism bona water sport employee info that was removed
	 * @throws PortalException if a tourism bona water sport employee info with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportEmployeeInfo
				deleteTourismBonaWaterSportEmployeeInfo(
					long tourismBonaWSEmplId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaWaterSportEmployeeInfoLocalService.
			deleteTourismBonaWaterSportEmployeeInfo(tourismBonaWSEmplId);
	}

	/**
	 * Deletes the tourism bona water sport employee info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaWaterSportEmployeeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaWaterSportEmployeeInfo the tourism bona water sport employee info
	 * @return the tourism bona water sport employee info that was removed
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportEmployeeInfo
			deleteTourismBonaWaterSportEmployeeInfo(
				com.nbp.tourism.application.form.services.model.
					TourismBonaWaterSportEmployeeInfo
						tourismBonaWaterSportEmployeeInfo) {

		return _tourismBonaWaterSportEmployeeInfoLocalService.
			deleteTourismBonaWaterSportEmployeeInfo(
				tourismBonaWaterSportEmployeeInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismBonaWaterSportEmployeeInfoLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismBonaWaterSportEmployeeInfoLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismBonaWaterSportEmployeeInfoLocalService.dynamicQuery();
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

		return _tourismBonaWaterSportEmployeeInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaWaterSportEmployeeInfoModelImpl</code>.
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

		return _tourismBonaWaterSportEmployeeInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaWaterSportEmployeeInfoModelImpl</code>.
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

		return _tourismBonaWaterSportEmployeeInfoLocalService.dynamicQuery(
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

		return _tourismBonaWaterSportEmployeeInfoLocalService.dynamicQueryCount(
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

		return _tourismBonaWaterSportEmployeeInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportEmployeeInfo
			fetchTourismBonaWaterSportEmployeeInfo(long tourismBonaWSEmplId) {

		return _tourismBonaWaterSportEmployeeInfoLocalService.
			fetchTourismBonaWaterSportEmployeeInfo(tourismBonaWSEmplId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismBonaWaterSportEmployeeInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismBonaWaterSportEmployeeInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaWaterSportEmployeeInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaWaterSportEmployeeInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the tourism bona water sport employee info with the primary key.
	 *
	 * @param tourismBonaWSEmplId the primary key of the tourism bona water sport employee info
	 * @return the tourism bona water sport employee info
	 * @throws PortalException if a tourism bona water sport employee info with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportEmployeeInfo getTourismBonaWaterSportEmployeeInfo(
				long tourismBonaWSEmplId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaWaterSportEmployeeInfoLocalService.
			getTourismBonaWaterSportEmployeeInfo(tourismBonaWSEmplId);
	}

	/**
	 * Returns a range of all the tourism bona water sport employee infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaWaterSportEmployeeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sport employee infos
	 * @param end the upper bound of the range of tourism bona water sport employee infos (not inclusive)
	 * @return the range of tourism bona water sport employee infos
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismBonaWaterSportEmployeeInfo>
				getTourismBonaWaterSportEmployeeInfos(int start, int end) {

		return _tourismBonaWaterSportEmployeeInfoLocalService.
			getTourismBonaWaterSportEmployeeInfos(start, end);
	}

	/**
	 * Returns the number of tourism bona water sport employee infos.
	 *
	 * @return the number of tourism bona water sport employee infos
	 */
	@Override
	public int getTourismBonaWaterSportEmployeeInfosCount() {
		return _tourismBonaWaterSportEmployeeInfoLocalService.
			getTourismBonaWaterSportEmployeeInfosCount();
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportEmployeeInfo getTourismById(
				long tourismApplicationId)
			throws com.nbp.tourism.application.form.services.exception.
				NoSuchTourismBonaWaterSportEmployeeInfoException {

		return _tourismBonaWaterSportEmployeeInfoLocalService.getTourismById(
			tourismApplicationId);
	}

	/**
	 * Updates the tourism bona water sport employee info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaWaterSportEmployeeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaWaterSportEmployeeInfo the tourism bona water sport employee info
	 * @return the tourism bona water sport employee info that was updated
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportEmployeeInfo
			updateTourismBonaWaterSportEmployeeInfo(
				com.nbp.tourism.application.form.services.model.
					TourismBonaWaterSportEmployeeInfo
						tourismBonaWaterSportEmployeeInfo) {

		return _tourismBonaWaterSportEmployeeInfoLocalService.
			updateTourismBonaWaterSportEmployeeInfo(
				tourismBonaWaterSportEmployeeInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismBonaWaterSportEmployeeInfoLocalService.
			getBasePersistence();
	}

	@Override
	public TourismBonaWaterSportEmployeeInfoLocalService getWrappedService() {
		return _tourismBonaWaterSportEmployeeInfoLocalService;
	}

	@Override
	public void setWrappedService(
		TourismBonaWaterSportEmployeeInfoLocalService
			tourismBonaWaterSportEmployeeInfoLocalService) {

		_tourismBonaWaterSportEmployeeInfoLocalService =
			tourismBonaWaterSportEmployeeInfoLocalService;
	}

	private TourismBonaWaterSportEmployeeInfoLocalService
		_tourismBonaWaterSportEmployeeInfoLocalService;

}