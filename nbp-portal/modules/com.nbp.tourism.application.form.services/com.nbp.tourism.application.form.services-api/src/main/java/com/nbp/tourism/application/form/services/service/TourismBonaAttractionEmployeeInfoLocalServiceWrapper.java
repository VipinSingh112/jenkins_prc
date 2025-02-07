/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismBonaAttractionEmployeeInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionEmployeeInfoLocalService
 * @generated
 */
public class TourismBonaAttractionEmployeeInfoLocalServiceWrapper
	implements ServiceWrapper<TourismBonaAttractionEmployeeInfoLocalService>,
			   TourismBonaAttractionEmployeeInfoLocalService {

	public TourismBonaAttractionEmployeeInfoLocalServiceWrapper() {
		this(null);
	}

	public TourismBonaAttractionEmployeeInfoLocalServiceWrapper(
		TourismBonaAttractionEmployeeInfoLocalService
			tourismBonaAttractionEmployeeInfoLocalService) {

		_tourismBonaAttractionEmployeeInfoLocalService =
			tourismBonaAttractionEmployeeInfoLocalService;
	}

	/**
	 * Adds the tourism bona attraction employee info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAttractionEmployeeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAttractionEmployeeInfo the tourism bona attraction employee info
	 * @return the tourism bona attraction employee info that was added
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionEmployeeInfo addTourismBonaAttractionEmployeeInfo(
			com.nbp.tourism.application.form.services.model.
				TourismBonaAttractionEmployeeInfo
					tourismBonaAttractionEmployeeInfo) {

		return _tourismBonaAttractionEmployeeInfoLocalService.
			addTourismBonaAttractionEmployeeInfo(
				tourismBonaAttractionEmployeeInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAttractionEmployeeInfoLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new tourism bona attraction employee info with the primary key. Does not add the tourism bona attraction employee info to the database.
	 *
	 * @param tourismBonaAttrEmpId the primary key for the new tourism bona attraction employee info
	 * @return the new tourism bona attraction employee info
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionEmployeeInfo
			createTourismBonaAttractionEmployeeInfo(long tourismBonaAttrEmpId) {

		return _tourismBonaAttractionEmployeeInfoLocalService.
			createTourismBonaAttractionEmployeeInfo(tourismBonaAttrEmpId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAttractionEmployeeInfoLocalService.
			deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the tourism bona attraction employee info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAttractionEmployeeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAttrEmpId the primary key of the tourism bona attraction employee info
	 * @return the tourism bona attraction employee info that was removed
	 * @throws PortalException if a tourism bona attraction employee info with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionEmployeeInfo
				deleteTourismBonaAttractionEmployeeInfo(
					long tourismBonaAttrEmpId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAttractionEmployeeInfoLocalService.
			deleteTourismBonaAttractionEmployeeInfo(tourismBonaAttrEmpId);
	}

	/**
	 * Deletes the tourism bona attraction employee info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAttractionEmployeeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAttractionEmployeeInfo the tourism bona attraction employee info
	 * @return the tourism bona attraction employee info that was removed
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionEmployeeInfo
			deleteTourismBonaAttractionEmployeeInfo(
				com.nbp.tourism.application.form.services.model.
					TourismBonaAttractionEmployeeInfo
						tourismBonaAttractionEmployeeInfo) {

		return _tourismBonaAttractionEmployeeInfoLocalService.
			deleteTourismBonaAttractionEmployeeInfo(
				tourismBonaAttractionEmployeeInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismBonaAttractionEmployeeInfoLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismBonaAttractionEmployeeInfoLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismBonaAttractionEmployeeInfoLocalService.dynamicQuery();
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

		return _tourismBonaAttractionEmployeeInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionEmployeeInfoModelImpl</code>.
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

		return _tourismBonaAttractionEmployeeInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionEmployeeInfoModelImpl</code>.
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

		return _tourismBonaAttractionEmployeeInfoLocalService.dynamicQuery(
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

		return _tourismBonaAttractionEmployeeInfoLocalService.dynamicQueryCount(
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

		return _tourismBonaAttractionEmployeeInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionEmployeeInfo
			fetchTourismBonaAttractionEmployeeInfo(long tourismBonaAttrEmpId) {

		return _tourismBonaAttractionEmployeeInfoLocalService.
			fetchTourismBonaAttractionEmployeeInfo(tourismBonaAttrEmpId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismBonaAttractionEmployeeInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismBonaAttractionEmployeeInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaAttractionEmployeeInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAttractionEmployeeInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the tourism bona attraction employee info with the primary key.
	 *
	 * @param tourismBonaAttrEmpId the primary key of the tourism bona attraction employee info
	 * @return the tourism bona attraction employee info
	 * @throws PortalException if a tourism bona attraction employee info with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionEmployeeInfo getTourismBonaAttractionEmployeeInfo(
				long tourismBonaAttrEmpId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAttractionEmployeeInfoLocalService.
			getTourismBonaAttractionEmployeeInfo(tourismBonaAttrEmpId);
	}

	/**
	 * Returns a range of all the tourism bona attraction employee infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionEmployeeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction employee infos
	 * @param end the upper bound of the range of tourism bona attraction employee infos (not inclusive)
	 * @return the range of tourism bona attraction employee infos
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismBonaAttractionEmployeeInfo>
				getTourismBonaAttractionEmployeeInfos(int start, int end) {

		return _tourismBonaAttractionEmployeeInfoLocalService.
			getTourismBonaAttractionEmployeeInfos(start, end);
	}

	/**
	 * Returns the number of tourism bona attraction employee infos.
	 *
	 * @return the number of tourism bona attraction employee infos
	 */
	@Override
	public int getTourismBonaAttractionEmployeeInfosCount() {
		return _tourismBonaAttractionEmployeeInfoLocalService.
			getTourismBonaAttractionEmployeeInfosCount();
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionEmployeeInfo getTourismById(
				long tourismApplicationId)
			throws com.nbp.tourism.application.form.services.exception.
				NoSuchTourismBonaAttractionEmployeeInfoException {

		return _tourismBonaAttractionEmployeeInfoLocalService.getTourismById(
			tourismApplicationId);
	}

	/**
	 * Updates the tourism bona attraction employee info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAttractionEmployeeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAttractionEmployeeInfo the tourism bona attraction employee info
	 * @return the tourism bona attraction employee info that was updated
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionEmployeeInfo
			updateTourismBonaAttractionEmployeeInfo(
				com.nbp.tourism.application.form.services.model.
					TourismBonaAttractionEmployeeInfo
						tourismBonaAttractionEmployeeInfo) {

		return _tourismBonaAttractionEmployeeInfoLocalService.
			updateTourismBonaAttractionEmployeeInfo(
				tourismBonaAttractionEmployeeInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismBonaAttractionEmployeeInfoLocalService.
			getBasePersistence();
	}

	@Override
	public TourismBonaAttractionEmployeeInfoLocalService getWrappedService() {
		return _tourismBonaAttractionEmployeeInfoLocalService;
	}

	@Override
	public void setWrappedService(
		TourismBonaAttractionEmployeeInfoLocalService
			tourismBonaAttractionEmployeeInfoLocalService) {

		_tourismBonaAttractionEmployeeInfoLocalService =
			tourismBonaAttractionEmployeeInfoLocalService;
	}

	private TourismBonaAttractionEmployeeInfoLocalService
		_tourismBonaAttractionEmployeeInfoLocalService;

}