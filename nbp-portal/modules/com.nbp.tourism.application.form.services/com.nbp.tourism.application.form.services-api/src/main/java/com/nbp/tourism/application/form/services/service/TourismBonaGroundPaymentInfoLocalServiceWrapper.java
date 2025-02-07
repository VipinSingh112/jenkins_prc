/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismBonaGroundPaymentInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundPaymentInfoLocalService
 * @generated
 */
public class TourismBonaGroundPaymentInfoLocalServiceWrapper
	implements ServiceWrapper<TourismBonaGroundPaymentInfoLocalService>,
			   TourismBonaGroundPaymentInfoLocalService {

	public TourismBonaGroundPaymentInfoLocalServiceWrapper() {
		this(null);
	}

	public TourismBonaGroundPaymentInfoLocalServiceWrapper(
		TourismBonaGroundPaymentInfoLocalService
			tourismBonaGroundPaymentInfoLocalService) {

		_tourismBonaGroundPaymentInfoLocalService =
			tourismBonaGroundPaymentInfoLocalService;
	}

	/**
	 * Adds the tourism bona ground payment info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundPaymentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundPaymentInfo the tourism bona ground payment info
	 * @return the tourism bona ground payment info that was added
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaGroundPaymentInfo addTourismBonaGroundPaymentInfo(
				com.nbp.tourism.application.form.services.model.
					TourismBonaGroundPaymentInfo tourismBonaGroundPaymentInfo) {

		return _tourismBonaGroundPaymentInfoLocalService.
			addTourismBonaGroundPaymentInfo(tourismBonaGroundPaymentInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundPaymentInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism bona ground payment info with the primary key. Does not add the tourism bona ground payment info to the database.
	 *
	 * @param tourismBonaGroundPayId the primary key for the new tourism bona ground payment info
	 * @return the new tourism bona ground payment info
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaGroundPaymentInfo createTourismBonaGroundPaymentInfo(
				long tourismBonaGroundPayId) {

		return _tourismBonaGroundPaymentInfoLocalService.
			createTourismBonaGroundPaymentInfo(tourismBonaGroundPayId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundPaymentInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the tourism bona ground payment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundPaymentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundPayId the primary key of the tourism bona ground payment info
	 * @return the tourism bona ground payment info that was removed
	 * @throws PortalException if a tourism bona ground payment info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaGroundPaymentInfo deleteTourismBonaGroundPaymentInfo(
					long tourismBonaGroundPayId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundPaymentInfoLocalService.
			deleteTourismBonaGroundPaymentInfo(tourismBonaGroundPayId);
	}

	/**
	 * Deletes the tourism bona ground payment info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundPaymentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundPaymentInfo the tourism bona ground payment info
	 * @return the tourism bona ground payment info that was removed
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaGroundPaymentInfo deleteTourismBonaGroundPaymentInfo(
				com.nbp.tourism.application.form.services.model.
					TourismBonaGroundPaymentInfo tourismBonaGroundPaymentInfo) {

		return _tourismBonaGroundPaymentInfoLocalService.
			deleteTourismBonaGroundPaymentInfo(tourismBonaGroundPaymentInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismBonaGroundPaymentInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismBonaGroundPaymentInfoLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismBonaGroundPaymentInfoLocalService.dynamicQuery();
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

		return _tourismBonaGroundPaymentInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundPaymentInfoModelImpl</code>.
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

		return _tourismBonaGroundPaymentInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundPaymentInfoModelImpl</code>.
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

		return _tourismBonaGroundPaymentInfoLocalService.dynamicQuery(
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

		return _tourismBonaGroundPaymentInfoLocalService.dynamicQueryCount(
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

		return _tourismBonaGroundPaymentInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaGroundPaymentInfo fetchTourismBonaGroundPaymentInfo(
				long tourismBonaGroundPayId) {

		return _tourismBonaGroundPaymentInfoLocalService.
			fetchTourismBonaGroundPaymentInfo(tourismBonaGroundPayId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismBonaGroundPaymentInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismBonaGroundPaymentInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaGroundPaymentInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundPaymentInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the tourism bona ground payment info with the primary key.
	 *
	 * @param tourismBonaGroundPayId the primary key of the tourism bona ground payment info
	 * @return the tourism bona ground payment info
	 * @throws PortalException if a tourism bona ground payment info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaGroundPaymentInfo getTourismBonaGroundPaymentInfo(
					long tourismBonaGroundPayId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundPaymentInfoLocalService.
			getTourismBonaGroundPaymentInfo(tourismBonaGroundPayId);
	}

	/**
	 * Returns a range of all the tourism bona ground payment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundPaymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground payment infos
	 * @param end the upper bound of the range of tourism bona ground payment infos (not inclusive)
	 * @return the range of tourism bona ground payment infos
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismBonaGroundPaymentInfo> getTourismBonaGroundPaymentInfos(
				int start, int end) {

		return _tourismBonaGroundPaymentInfoLocalService.
			getTourismBonaGroundPaymentInfos(start, end);
	}

	/**
	 * Returns the number of tourism bona ground payment infos.
	 *
	 * @return the number of tourism bona ground payment infos
	 */
	@Override
	public int getTourismBonaGroundPaymentInfosCount() {
		return _tourismBonaGroundPaymentInfoLocalService.
			getTourismBonaGroundPaymentInfosCount();
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaGroundPaymentInfo getTourismById(
					long tourismApplicationId)
				throws com.nbp.tourism.application.form.services.exception.
					NoSuchTourismBonaGroundPaymentInfoException {

		return _tourismBonaGroundPaymentInfoLocalService.getTourismById(
			tourismApplicationId);
	}

	/**
	 * Updates the tourism bona ground payment info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundPaymentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundPaymentInfo the tourism bona ground payment info
	 * @return the tourism bona ground payment info that was updated
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaGroundPaymentInfo updateTourismBonaGroundPaymentInfo(
				com.nbp.tourism.application.form.services.model.
					TourismBonaGroundPaymentInfo tourismBonaGroundPaymentInfo) {

		return _tourismBonaGroundPaymentInfoLocalService.
			updateTourismBonaGroundPaymentInfo(tourismBonaGroundPaymentInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismBonaGroundPaymentInfoLocalService.getBasePersistence();
	}

	@Override
	public TourismBonaGroundPaymentInfoLocalService getWrappedService() {
		return _tourismBonaGroundPaymentInfoLocalService;
	}

	@Override
	public void setWrappedService(
		TourismBonaGroundPaymentInfoLocalService
			tourismBonaGroundPaymentInfoLocalService) {

		_tourismBonaGroundPaymentInfoLocalService =
			tourismBonaGroundPaymentInfoLocalService;
	}

	private TourismBonaGroundPaymentInfoLocalService
		_tourismBonaGroundPaymentInfoLocalService;

}