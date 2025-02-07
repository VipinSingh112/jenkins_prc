/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismBonaAccoSignInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccoSignInfoLocalService
 * @generated
 */
public class TourismBonaAccoSignInfoLocalServiceWrapper
	implements ServiceWrapper<TourismBonaAccoSignInfoLocalService>,
			   TourismBonaAccoSignInfoLocalService {

	public TourismBonaAccoSignInfoLocalServiceWrapper() {
		this(null);
	}

	public TourismBonaAccoSignInfoLocalServiceWrapper(
		TourismBonaAccoSignInfoLocalService
			tourismBonaAccoSignInfoLocalService) {

		_tourismBonaAccoSignInfoLocalService =
			tourismBonaAccoSignInfoLocalService;
	}

	/**
	 * Adds the tourism bona acco sign info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAccoSignInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAccoSignInfo the tourism bona acco sign info
	 * @return the tourism bona acco sign info that was added
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaAccoSignInfo
			addTourismBonaAccoSignInfo(
				com.nbp.tourism.application.form.services.model.
					TourismBonaAccoSignInfo tourismBonaAccoSignInfo) {

		return _tourismBonaAccoSignInfoLocalService.addTourismBonaAccoSignInfo(
			tourismBonaAccoSignInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAccoSignInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism bona acco sign info with the primary key. Does not add the tourism bona acco sign info to the database.
	 *
	 * @param tourismBonaAccoSignId the primary key for the new tourism bona acco sign info
	 * @return the new tourism bona acco sign info
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaAccoSignInfo
			createTourismBonaAccoSignInfo(long tourismBonaAccoSignId) {

		return _tourismBonaAccoSignInfoLocalService.
			createTourismBonaAccoSignInfo(tourismBonaAccoSignId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAccoSignInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the tourism bona acco sign info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAccoSignInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAccoSignId the primary key of the tourism bona acco sign info
	 * @return the tourism bona acco sign info that was removed
	 * @throws PortalException if a tourism bona acco sign info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaAccoSignInfo
				deleteTourismBonaAccoSignInfo(long tourismBonaAccoSignId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAccoSignInfoLocalService.
			deleteTourismBonaAccoSignInfo(tourismBonaAccoSignId);
	}

	/**
	 * Deletes the tourism bona acco sign info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAccoSignInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAccoSignInfo the tourism bona acco sign info
	 * @return the tourism bona acco sign info that was removed
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaAccoSignInfo
			deleteTourismBonaAccoSignInfo(
				com.nbp.tourism.application.form.services.model.
					TourismBonaAccoSignInfo tourismBonaAccoSignInfo) {

		return _tourismBonaAccoSignInfoLocalService.
			deleteTourismBonaAccoSignInfo(tourismBonaAccoSignInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismBonaAccoSignInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismBonaAccoSignInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismBonaAccoSignInfoLocalService.dynamicQuery();
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

		return _tourismBonaAccoSignInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAccoSignInfoModelImpl</code>.
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

		return _tourismBonaAccoSignInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAccoSignInfoModelImpl</code>.
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

		return _tourismBonaAccoSignInfoLocalService.dynamicQuery(
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

		return _tourismBonaAccoSignInfoLocalService.dynamicQueryCount(
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

		return _tourismBonaAccoSignInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaAccoSignInfo
			fetchTourismBonaAccoSignInfo(long tourismBonaAccoSignId) {

		return _tourismBonaAccoSignInfoLocalService.
			fetchTourismBonaAccoSignInfo(tourismBonaAccoSignId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismBonaAccoSignInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismBonaAccoSignInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaAccoSignInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAccoSignInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the tourism bona acco sign info with the primary key.
	 *
	 * @param tourismBonaAccoSignId the primary key of the tourism bona acco sign info
	 * @return the tourism bona acco sign info
	 * @throws PortalException if a tourism bona acco sign info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaAccoSignInfo
				getTourismBonaAccoSignInfo(long tourismBonaAccoSignId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAccoSignInfoLocalService.getTourismBonaAccoSignInfo(
			tourismBonaAccoSignId);
	}

	/**
	 * Returns a range of all the tourism bona acco sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAccoSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona acco sign infos
	 * @param end the upper bound of the range of tourism bona acco sign infos (not inclusive)
	 * @return the range of tourism bona acco sign infos
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismBonaAccoSignInfo> getTourismBonaAccoSignInfos(
				int start, int end) {

		return _tourismBonaAccoSignInfoLocalService.getTourismBonaAccoSignInfos(
			start, end);
	}

	/**
	 * Returns the number of tourism bona acco sign infos.
	 *
	 * @return the number of tourism bona acco sign infos
	 */
	@Override
	public int getTourismBonaAccoSignInfosCount() {
		return _tourismBonaAccoSignInfoLocalService.
			getTourismBonaAccoSignInfosCount();
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaAccoSignInfo
				getTourismById(long tourismApplicationId)
			throws com.nbp.tourism.application.form.services.exception.
				NoSuchTourismBonaAccoSignInfoException {

		return _tourismBonaAccoSignInfoLocalService.getTourismById(
			tourismApplicationId);
	}

	/**
	 * Updates the tourism bona acco sign info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAccoSignInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAccoSignInfo the tourism bona acco sign info
	 * @return the tourism bona acco sign info that was updated
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaAccoSignInfo
			updateTourismBonaAccoSignInfo(
				com.nbp.tourism.application.form.services.model.
					TourismBonaAccoSignInfo tourismBonaAccoSignInfo) {

		return _tourismBonaAccoSignInfoLocalService.
			updateTourismBonaAccoSignInfo(tourismBonaAccoSignInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismBonaAccoSignInfoLocalService.getBasePersistence();
	}

	@Override
	public TourismBonaAccoSignInfoLocalService getWrappedService() {
		return _tourismBonaAccoSignInfoLocalService;
	}

	@Override
	public void setWrappedService(
		TourismBonaAccoSignInfoLocalService
			tourismBonaAccoSignInfoLocalService) {

		_tourismBonaAccoSignInfoLocalService =
			tourismBonaAccoSignInfoLocalService;
	}

	private TourismBonaAccoSignInfoLocalService
		_tourismBonaAccoSignInfoLocalService;

}