/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismBonaAccoGenralInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccoGenralInfoLocalService
 * @generated
 */
public class TourismBonaAccoGenralInfoLocalServiceWrapper
	implements ServiceWrapper<TourismBonaAccoGenralInfoLocalService>,
			   TourismBonaAccoGenralInfoLocalService {

	public TourismBonaAccoGenralInfoLocalServiceWrapper() {
		this(null);
	}

	public TourismBonaAccoGenralInfoLocalServiceWrapper(
		TourismBonaAccoGenralInfoLocalService
			tourismBonaAccoGenralInfoLocalService) {

		_tourismBonaAccoGenralInfoLocalService =
			tourismBonaAccoGenralInfoLocalService;
	}

	/**
	 * Adds the tourism bona acco genral info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAccoGenralInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAccoGenralInfo the tourism bona acco genral info
	 * @return the tourism bona acco genral info that was added
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaAccoGenralInfo addTourismBonaAccoGenralInfo(
				com.nbp.tourism.application.form.services.model.
					TourismBonaAccoGenralInfo tourismBonaAccoGenralInfo) {

		return _tourismBonaAccoGenralInfoLocalService.
			addTourismBonaAccoGenralInfo(tourismBonaAccoGenralInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAccoGenralInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism bona acco genral info with the primary key. Does not add the tourism bona acco genral info to the database.
	 *
	 * @param tourismBonaAccoGenralInfoId the primary key for the new tourism bona acco genral info
	 * @return the new tourism bona acco genral info
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaAccoGenralInfo createTourismBonaAccoGenralInfo(
				long tourismBonaAccoGenralInfoId) {

		return _tourismBonaAccoGenralInfoLocalService.
			createTourismBonaAccoGenralInfo(tourismBonaAccoGenralInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAccoGenralInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the tourism bona acco genral info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAccoGenralInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAccoGenralInfoId the primary key of the tourism bona acco genral info
	 * @return the tourism bona acco genral info that was removed
	 * @throws PortalException if a tourism bona acco genral info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaAccoGenralInfo deleteTourismBonaAccoGenralInfo(
					long tourismBonaAccoGenralInfoId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAccoGenralInfoLocalService.
			deleteTourismBonaAccoGenralInfo(tourismBonaAccoGenralInfoId);
	}

	/**
	 * Deletes the tourism bona acco genral info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAccoGenralInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAccoGenralInfo the tourism bona acco genral info
	 * @return the tourism bona acco genral info that was removed
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaAccoGenralInfo deleteTourismBonaAccoGenralInfo(
				com.nbp.tourism.application.form.services.model.
					TourismBonaAccoGenralInfo tourismBonaAccoGenralInfo) {

		return _tourismBonaAccoGenralInfoLocalService.
			deleteTourismBonaAccoGenralInfo(tourismBonaAccoGenralInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismBonaAccoGenralInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismBonaAccoGenralInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismBonaAccoGenralInfoLocalService.dynamicQuery();
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

		return _tourismBonaAccoGenralInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAccoGenralInfoModelImpl</code>.
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

		return _tourismBonaAccoGenralInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAccoGenralInfoModelImpl</code>.
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

		return _tourismBonaAccoGenralInfoLocalService.dynamicQuery(
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

		return _tourismBonaAccoGenralInfoLocalService.dynamicQueryCount(
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

		return _tourismBonaAccoGenralInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaAccoGenralInfo fetchTourismBonaAccoGenralInfo(
				long tourismBonaAccoGenralInfoId) {

		return _tourismBonaAccoGenralInfoLocalService.
			fetchTourismBonaAccoGenralInfo(tourismBonaAccoGenralInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismBonaAccoGenralInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismBonaAccoGenralInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaAccoGenralInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAccoGenralInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the tourism bona acco genral info with the primary key.
	 *
	 * @param tourismBonaAccoGenralInfoId the primary key of the tourism bona acco genral info
	 * @return the tourism bona acco genral info
	 * @throws PortalException if a tourism bona acco genral info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaAccoGenralInfo getTourismBonaAccoGenralInfo(
					long tourismBonaAccoGenralInfoId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAccoGenralInfoLocalService.
			getTourismBonaAccoGenralInfo(tourismBonaAccoGenralInfoId);
	}

	/**
	 * Returns a range of all the tourism bona acco genral infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAccoGenralInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona acco genral infos
	 * @param end the upper bound of the range of tourism bona acco genral infos (not inclusive)
	 * @return the range of tourism bona acco genral infos
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismBonaAccoGenralInfo> getTourismBonaAccoGenralInfos(
				int start, int end) {

		return _tourismBonaAccoGenralInfoLocalService.
			getTourismBonaAccoGenralInfos(start, end);
	}

	/**
	 * Returns the number of tourism bona acco genral infos.
	 *
	 * @return the number of tourism bona acco genral infos
	 */
	@Override
	public int getTourismBonaAccoGenralInfosCount() {
		return _tourismBonaAccoGenralInfoLocalService.
			getTourismBonaAccoGenralInfosCount();
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaAccoGenralInfo getTourismById(long tourismApplicationId)
				throws com.nbp.tourism.application.form.services.exception.
					NoSuchTourismBonaAccoGenralInfoException {

		return _tourismBonaAccoGenralInfoLocalService.getTourismById(
			tourismApplicationId);
	}

	/**
	 * Updates the tourism bona acco genral info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAccoGenralInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAccoGenralInfo the tourism bona acco genral info
	 * @return the tourism bona acco genral info that was updated
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaAccoGenralInfo updateTourismBonaAccoGenralInfo(
				com.nbp.tourism.application.form.services.model.
					TourismBonaAccoGenralInfo tourismBonaAccoGenralInfo) {

		return _tourismBonaAccoGenralInfoLocalService.
			updateTourismBonaAccoGenralInfo(tourismBonaAccoGenralInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismBonaAccoGenralInfoLocalService.getBasePersistence();
	}

	@Override
	public TourismBonaAccoGenralInfoLocalService getWrappedService() {
		return _tourismBonaAccoGenralInfoLocalService;
	}

	@Override
	public void setWrappedService(
		TourismBonaAccoGenralInfoLocalService
			tourismBonaAccoGenralInfoLocalService) {

		_tourismBonaAccoGenralInfoLocalService =
			tourismBonaAccoGenralInfoLocalService;
	}

	private TourismBonaAccoGenralInfoLocalService
		_tourismBonaAccoGenralInfoLocalService;

}