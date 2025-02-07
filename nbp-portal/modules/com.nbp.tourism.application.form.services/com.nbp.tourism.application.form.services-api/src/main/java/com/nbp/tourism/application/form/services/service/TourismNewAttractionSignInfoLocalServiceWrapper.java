/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismNewAttractionSignInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionSignInfoLocalService
 * @generated
 */
public class TourismNewAttractionSignInfoLocalServiceWrapper
	implements ServiceWrapper<TourismNewAttractionSignInfoLocalService>,
			   TourismNewAttractionSignInfoLocalService {

	public TourismNewAttractionSignInfoLocalServiceWrapper() {
		this(null);
	}

	public TourismNewAttractionSignInfoLocalServiceWrapper(
		TourismNewAttractionSignInfoLocalService
			tourismNewAttractionSignInfoLocalService) {

		_tourismNewAttractionSignInfoLocalService =
			tourismNewAttractionSignInfoLocalService;
	}

	/**
	 * Adds the tourism new attraction sign info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAttractionSignInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAttractionSignInfo the tourism new attraction sign info
	 * @return the tourism new attraction sign info that was added
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewAttractionSignInfo addTourismNewAttractionSignInfo(
				com.nbp.tourism.application.form.services.model.
					TourismNewAttractionSignInfo tourismNewAttractionSignInfo) {

		return _tourismNewAttractionSignInfoLocalService.
			addTourismNewAttractionSignInfo(tourismNewAttractionSignInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAttractionSignInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism new attraction sign info with the primary key. Does not add the tourism new attraction sign info to the database.
	 *
	 * @param tourismNewAttraSignInfoId the primary key for the new tourism new attraction sign info
	 * @return the new tourism new attraction sign info
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewAttractionSignInfo createTourismNewAttractionSignInfo(
				long tourismNewAttraSignInfoId) {

		return _tourismNewAttractionSignInfoLocalService.
			createTourismNewAttractionSignInfo(tourismNewAttraSignInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAttractionSignInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the tourism new attraction sign info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAttractionSignInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAttraSignInfoId the primary key of the tourism new attraction sign info
	 * @return the tourism new attraction sign info that was removed
	 * @throws PortalException if a tourism new attraction sign info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewAttractionSignInfo deleteTourismNewAttractionSignInfo(
					long tourismNewAttraSignInfoId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAttractionSignInfoLocalService.
			deleteTourismNewAttractionSignInfo(tourismNewAttraSignInfoId);
	}

	/**
	 * Deletes the tourism new attraction sign info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAttractionSignInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAttractionSignInfo the tourism new attraction sign info
	 * @return the tourism new attraction sign info that was removed
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewAttractionSignInfo deleteTourismNewAttractionSignInfo(
				com.nbp.tourism.application.form.services.model.
					TourismNewAttractionSignInfo tourismNewAttractionSignInfo) {

		return _tourismNewAttractionSignInfoLocalService.
			deleteTourismNewAttractionSignInfo(tourismNewAttractionSignInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismNewAttractionSignInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismNewAttractionSignInfoLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismNewAttractionSignInfoLocalService.dynamicQuery();
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

		return _tourismNewAttractionSignInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionSignInfoModelImpl</code>.
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

		return _tourismNewAttractionSignInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionSignInfoModelImpl</code>.
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

		return _tourismNewAttractionSignInfoLocalService.dynamicQuery(
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

		return _tourismNewAttractionSignInfoLocalService.dynamicQueryCount(
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

		return _tourismNewAttractionSignInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewAttractionSignInfo fetchTourismNewAttractionSignInfo(
				long tourismNewAttraSignInfoId) {

		return _tourismNewAttractionSignInfoLocalService.
			fetchTourismNewAttractionSignInfo(tourismNewAttraSignInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismNewAttractionSignInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismNewAttractionSignInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismNewAttractionSignInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAttractionSignInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewAttractionSignInfo getTourismById(
					long tourismApplicationId)
				throws com.nbp.tourism.application.form.services.exception.
					NoSuchTourismNewAttractionSignInfoException {

		return _tourismNewAttractionSignInfoLocalService.getTourismById(
			tourismApplicationId);
	}

	/**
	 * Returns the tourism new attraction sign info with the primary key.
	 *
	 * @param tourismNewAttraSignInfoId the primary key of the tourism new attraction sign info
	 * @return the tourism new attraction sign info
	 * @throws PortalException if a tourism new attraction sign info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewAttractionSignInfo getTourismNewAttractionSignInfo(
					long tourismNewAttraSignInfoId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAttractionSignInfoLocalService.
			getTourismNewAttractionSignInfo(tourismNewAttraSignInfoId);
	}

	/**
	 * Returns a range of all the tourism new attraction sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction sign infos
	 * @param end the upper bound of the range of tourism new attraction sign infos (not inclusive)
	 * @return the range of tourism new attraction sign infos
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismNewAttractionSignInfo> getTourismNewAttractionSignInfos(
				int start, int end) {

		return _tourismNewAttractionSignInfoLocalService.
			getTourismNewAttractionSignInfos(start, end);
	}

	/**
	 * Returns the number of tourism new attraction sign infos.
	 *
	 * @return the number of tourism new attraction sign infos
	 */
	@Override
	public int getTourismNewAttractionSignInfosCount() {
		return _tourismNewAttractionSignInfoLocalService.
			getTourismNewAttractionSignInfosCount();
	}

	/**
	 * Updates the tourism new attraction sign info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAttractionSignInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAttractionSignInfo the tourism new attraction sign info
	 * @return the tourism new attraction sign info that was updated
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewAttractionSignInfo updateTourismNewAttractionSignInfo(
				com.nbp.tourism.application.form.services.model.
					TourismNewAttractionSignInfo tourismNewAttractionSignInfo) {

		return _tourismNewAttractionSignInfoLocalService.
			updateTourismNewAttractionSignInfo(tourismNewAttractionSignInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismNewAttractionSignInfoLocalService.getBasePersistence();
	}

	@Override
	public TourismNewAttractionSignInfoLocalService getWrappedService() {
		return _tourismNewAttractionSignInfoLocalService;
	}

	@Override
	public void setWrappedService(
		TourismNewAttractionSignInfoLocalService
			tourismNewAttractionSignInfoLocalService) {

		_tourismNewAttractionSignInfoLocalService =
			tourismNewAttractionSignInfoLocalService;
	}

	private TourismNewAttractionSignInfoLocalService
		_tourismNewAttractionSignInfoLocalService;

}