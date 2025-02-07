/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismNewAttractionEmployeeInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionEmployeeInfoLocalService
 * @generated
 */
public class TourismNewAttractionEmployeeInfoLocalServiceWrapper
	implements ServiceWrapper<TourismNewAttractionEmployeeInfoLocalService>,
			   TourismNewAttractionEmployeeInfoLocalService {

	public TourismNewAttractionEmployeeInfoLocalServiceWrapper() {
		this(null);
	}

	public TourismNewAttractionEmployeeInfoLocalServiceWrapper(
		TourismNewAttractionEmployeeInfoLocalService
			tourismNewAttractionEmployeeInfoLocalService) {

		_tourismNewAttractionEmployeeInfoLocalService =
			tourismNewAttractionEmployeeInfoLocalService;
	}

	/**
	 * Adds the tourism new attraction employee info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAttractionEmployeeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAttractionEmployeeInfo the tourism new attraction employee info
	 * @return the tourism new attraction employee info that was added
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionEmployeeInfo addTourismNewAttractionEmployeeInfo(
			com.nbp.tourism.application.form.services.model.
				TourismNewAttractionEmployeeInfo
					tourismNewAttractionEmployeeInfo) {

		return _tourismNewAttractionEmployeeInfoLocalService.
			addTourismNewAttractionEmployeeInfo(
				tourismNewAttractionEmployeeInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAttractionEmployeeInfoLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new tourism new attraction employee info with the primary key. Does not add the tourism new attraction employee info to the database.
	 *
	 * @param tourismNewAttractionEmploId the primary key for the new tourism new attraction employee info
	 * @return the new tourism new attraction employee info
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionEmployeeInfo createTourismNewAttractionEmployeeInfo(
			long tourismNewAttractionEmploId) {

		return _tourismNewAttractionEmployeeInfoLocalService.
			createTourismNewAttractionEmployeeInfo(tourismNewAttractionEmploId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAttractionEmployeeInfoLocalService.
			deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the tourism new attraction employee info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAttractionEmployeeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAttractionEmploId the primary key of the tourism new attraction employee info
	 * @return the tourism new attraction employee info that was removed
	 * @throws PortalException if a tourism new attraction employee info with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionEmployeeInfo deleteTourismNewAttractionEmployeeInfo(
				long tourismNewAttractionEmploId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAttractionEmployeeInfoLocalService.
			deleteTourismNewAttractionEmployeeInfo(tourismNewAttractionEmploId);
	}

	/**
	 * Deletes the tourism new attraction employee info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAttractionEmployeeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAttractionEmployeeInfo the tourism new attraction employee info
	 * @return the tourism new attraction employee info that was removed
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionEmployeeInfo deleteTourismNewAttractionEmployeeInfo(
			com.nbp.tourism.application.form.services.model.
				TourismNewAttractionEmployeeInfo
					tourismNewAttractionEmployeeInfo) {

		return _tourismNewAttractionEmployeeInfoLocalService.
			deleteTourismNewAttractionEmployeeInfo(
				tourismNewAttractionEmployeeInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismNewAttractionEmployeeInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismNewAttractionEmployeeInfoLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismNewAttractionEmployeeInfoLocalService.dynamicQuery();
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

		return _tourismNewAttractionEmployeeInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionEmployeeInfoModelImpl</code>.
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

		return _tourismNewAttractionEmployeeInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionEmployeeInfoModelImpl</code>.
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

		return _tourismNewAttractionEmployeeInfoLocalService.dynamicQuery(
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

		return _tourismNewAttractionEmployeeInfoLocalService.dynamicQueryCount(
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

		return _tourismNewAttractionEmployeeInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionEmployeeInfo fetchTourismNewAttractionEmployeeInfo(
			long tourismNewAttractionEmploId) {

		return _tourismNewAttractionEmployeeInfoLocalService.
			fetchTourismNewAttractionEmployeeInfo(tourismNewAttractionEmploId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismNewAttractionEmployeeInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismNewAttractionEmployeeInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismNewAttractionEmployeeInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAttractionEmployeeInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionEmployeeInfo getTourismById(
				long tourismApplicationId)
			throws com.nbp.tourism.application.form.services.exception.
				NoSuchTourismNewAttractionEmployeeInfoException {

		return _tourismNewAttractionEmployeeInfoLocalService.getTourismById(
			tourismApplicationId);
	}

	/**
	 * Returns the tourism new attraction employee info with the primary key.
	 *
	 * @param tourismNewAttractionEmploId the primary key of the tourism new attraction employee info
	 * @return the tourism new attraction employee info
	 * @throws PortalException if a tourism new attraction employee info with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionEmployeeInfo getTourismNewAttractionEmployeeInfo(
				long tourismNewAttractionEmploId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAttractionEmployeeInfoLocalService.
			getTourismNewAttractionEmployeeInfo(tourismNewAttractionEmploId);
	}

	/**
	 * Returns a range of all the tourism new attraction employee infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionEmployeeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction employee infos
	 * @param end the upper bound of the range of tourism new attraction employee infos (not inclusive)
	 * @return the range of tourism new attraction employee infos
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismNewAttractionEmployeeInfo>
				getTourismNewAttractionEmployeeInfos(int start, int end) {

		return _tourismNewAttractionEmployeeInfoLocalService.
			getTourismNewAttractionEmployeeInfos(start, end);
	}

	/**
	 * Returns the number of tourism new attraction employee infos.
	 *
	 * @return the number of tourism new attraction employee infos
	 */
	@Override
	public int getTourismNewAttractionEmployeeInfosCount() {
		return _tourismNewAttractionEmployeeInfoLocalService.
			getTourismNewAttractionEmployeeInfosCount();
	}

	/**
	 * Updates the tourism new attraction employee info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAttractionEmployeeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAttractionEmployeeInfo the tourism new attraction employee info
	 * @return the tourism new attraction employee info that was updated
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionEmployeeInfo updateTourismNewAttractionEmployeeInfo(
			com.nbp.tourism.application.form.services.model.
				TourismNewAttractionEmployeeInfo
					tourismNewAttractionEmployeeInfo) {

		return _tourismNewAttractionEmployeeInfoLocalService.
			updateTourismNewAttractionEmployeeInfo(
				tourismNewAttractionEmployeeInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismNewAttractionEmployeeInfoLocalService.
			getBasePersistence();
	}

	@Override
	public TourismNewAttractionEmployeeInfoLocalService getWrappedService() {
		return _tourismNewAttractionEmployeeInfoLocalService;
	}

	@Override
	public void setWrappedService(
		TourismNewAttractionEmployeeInfoLocalService
			tourismNewAttractionEmployeeInfoLocalService) {

		_tourismNewAttractionEmployeeInfoLocalService =
			tourismNewAttractionEmployeeInfoLocalService;
	}

	private TourismNewAttractionEmployeeInfoLocalService
		_tourismNewAttractionEmployeeInfoLocalService;

}