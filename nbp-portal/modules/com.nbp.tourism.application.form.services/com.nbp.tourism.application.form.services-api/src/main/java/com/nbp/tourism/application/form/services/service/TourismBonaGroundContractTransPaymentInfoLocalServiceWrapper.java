/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismBonaGroundContractTransPaymentInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundContractTransPaymentInfoLocalService
 * @generated
 */
public class TourismBonaGroundContractTransPaymentInfoLocalServiceWrapper
	implements ServiceWrapper
		<TourismBonaGroundContractTransPaymentInfoLocalService>,
			   TourismBonaGroundContractTransPaymentInfoLocalService {

	public TourismBonaGroundContractTransPaymentInfoLocalServiceWrapper() {
		this(null);
	}

	public TourismBonaGroundContractTransPaymentInfoLocalServiceWrapper(
		TourismBonaGroundContractTransPaymentInfoLocalService
			tourismBonaGroundContractTransPaymentInfoLocalService) {

		_tourismBonaGroundContractTransPaymentInfoLocalService =
			tourismBonaGroundContractTransPaymentInfoLocalService;
	}

	/**
	 * Adds the tourism bona ground contract trans payment info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundContractTransPaymentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundContractTransPaymentInfo the tourism bona ground contract trans payment info
	 * @return the tourism bona ground contract trans payment info that was added
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundContractTransPaymentInfo
			addTourismBonaGroundContractTransPaymentInfo(
				com.nbp.tourism.application.form.services.model.
					TourismBonaGroundContractTransPaymentInfo
						tourismBonaGroundContractTransPaymentInfo) {

		return _tourismBonaGroundContractTransPaymentInfoLocalService.
			addTourismBonaGroundContractTransPaymentInfo(
				tourismBonaGroundContractTransPaymentInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundContractTransPaymentInfoLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new tourism bona ground contract trans payment info with the primary key. Does not add the tourism bona ground contract trans payment info to the database.
	 *
	 * @param tourismBonaGroTransPayId the primary key for the new tourism bona ground contract trans payment info
	 * @return the new tourism bona ground contract trans payment info
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundContractTransPaymentInfo
			createTourismBonaGroundContractTransPaymentInfo(
				long tourismBonaGroTransPayId) {

		return _tourismBonaGroundContractTransPaymentInfoLocalService.
			createTourismBonaGroundContractTransPaymentInfo(
				tourismBonaGroTransPayId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundContractTransPaymentInfoLocalService.
			deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the tourism bona ground contract trans payment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundContractTransPaymentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroTransPayId the primary key of the tourism bona ground contract trans payment info
	 * @return the tourism bona ground contract trans payment info that was removed
	 * @throws PortalException if a tourism bona ground contract trans payment info with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundContractTransPaymentInfo
				deleteTourismBonaGroundContractTransPaymentInfo(
					long tourismBonaGroTransPayId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundContractTransPaymentInfoLocalService.
			deleteTourismBonaGroundContractTransPaymentInfo(
				tourismBonaGroTransPayId);
	}

	/**
	 * Deletes the tourism bona ground contract trans payment info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundContractTransPaymentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundContractTransPaymentInfo the tourism bona ground contract trans payment info
	 * @return the tourism bona ground contract trans payment info that was removed
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundContractTransPaymentInfo
			deleteTourismBonaGroundContractTransPaymentInfo(
				com.nbp.tourism.application.form.services.model.
					TourismBonaGroundContractTransPaymentInfo
						tourismBonaGroundContractTransPaymentInfo) {

		return _tourismBonaGroundContractTransPaymentInfoLocalService.
			deleteTourismBonaGroundContractTransPaymentInfo(
				tourismBonaGroundContractTransPaymentInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismBonaGroundContractTransPaymentInfoLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismBonaGroundContractTransPaymentInfoLocalService.
			dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismBonaGroundContractTransPaymentInfoLocalService.
			dynamicQuery();
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

		return _tourismBonaGroundContractTransPaymentInfoLocalService.
			dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundContractTransPaymentInfoModelImpl</code>.
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

		return _tourismBonaGroundContractTransPaymentInfoLocalService.
			dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundContractTransPaymentInfoModelImpl</code>.
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

		return _tourismBonaGroundContractTransPaymentInfoLocalService.
			dynamicQuery(dynamicQuery, start, end, orderByComparator);
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

		return _tourismBonaGroundContractTransPaymentInfoLocalService.
			dynamicQueryCount(dynamicQuery);
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

		return _tourismBonaGroundContractTransPaymentInfoLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundContractTransPaymentInfo
			fetchTourismBonaGroundContractTransPaymentInfo(
				long tourismBonaGroTransPayId) {

		return _tourismBonaGroundContractTransPaymentInfoLocalService.
			fetchTourismBonaGroundContractTransPaymentInfo(
				tourismBonaGroTransPayId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismBonaGroundContractTransPaymentInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismBonaGroundContractTransPaymentInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaGroundContractTransPaymentInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundContractTransPaymentInfoLocalService.
			getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the tourism bona ground contract trans payment info with the primary key.
	 *
	 * @param tourismBonaGroTransPayId the primary key of the tourism bona ground contract trans payment info
	 * @return the tourism bona ground contract trans payment info
	 * @throws PortalException if a tourism bona ground contract trans payment info with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundContractTransPaymentInfo
				getTourismBonaGroundContractTransPaymentInfo(
					long tourismBonaGroTransPayId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundContractTransPaymentInfoLocalService.
			getTourismBonaGroundContractTransPaymentInfo(
				tourismBonaGroTransPayId);
	}

	/**
	 * Returns a range of all the tourism bona ground contract trans payment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundContractTransPaymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground contract trans payment infos
	 * @param end the upper bound of the range of tourism bona ground contract trans payment infos (not inclusive)
	 * @return the range of tourism bona ground contract trans payment infos
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismBonaGroundContractTransPaymentInfo>
				getTourismBonaGroundContractTransPaymentInfos(
					int start, int end) {

		return _tourismBonaGroundContractTransPaymentInfoLocalService.
			getTourismBonaGroundContractTransPaymentInfos(start, end);
	}

	/**
	 * Returns the number of tourism bona ground contract trans payment infos.
	 *
	 * @return the number of tourism bona ground contract trans payment infos
	 */
	@Override
	public int getTourismBonaGroundContractTransPaymentInfosCount() {
		return _tourismBonaGroundContractTransPaymentInfoLocalService.
			getTourismBonaGroundContractTransPaymentInfosCount();
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundContractTransPaymentInfo getTourismById(
				long tourismApplicationId)
			throws com.nbp.tourism.application.form.services.exception.
				NoSuchTourismBonaGroundContractTransPaymentInfoException {

		return _tourismBonaGroundContractTransPaymentInfoLocalService.
			getTourismById(tourismApplicationId);
	}

	/**
	 * Updates the tourism bona ground contract trans payment info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundContractTransPaymentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundContractTransPaymentInfo the tourism bona ground contract trans payment info
	 * @return the tourism bona ground contract trans payment info that was updated
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundContractTransPaymentInfo
			updateTourismBonaGroundContractTransPaymentInfo(
				com.nbp.tourism.application.form.services.model.
					TourismBonaGroundContractTransPaymentInfo
						tourismBonaGroundContractTransPaymentInfo) {

		return _tourismBonaGroundContractTransPaymentInfoLocalService.
			updateTourismBonaGroundContractTransPaymentInfo(
				tourismBonaGroundContractTransPaymentInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismBonaGroundContractTransPaymentInfoLocalService.
			getBasePersistence();
	}

	@Override
	public TourismBonaGroundContractTransPaymentInfoLocalService
		getWrappedService() {

		return _tourismBonaGroundContractTransPaymentInfoLocalService;
	}

	@Override
	public void setWrappedService(
		TourismBonaGroundContractTransPaymentInfoLocalService
			tourismBonaGroundContractTransPaymentInfoLocalService) {

		_tourismBonaGroundContractTransPaymentInfoLocalService =
			tourismBonaGroundContractTransPaymentInfoLocalService;
	}

	private TourismBonaGroundContractTransPaymentInfoLocalService
		_tourismBonaGroundContractTransPaymentInfoLocalService;

}