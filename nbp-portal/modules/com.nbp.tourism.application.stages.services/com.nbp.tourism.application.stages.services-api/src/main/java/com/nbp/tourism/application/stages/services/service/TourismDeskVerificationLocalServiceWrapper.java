/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismDeskVerificationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismDeskVerificationLocalService
 * @generated
 */
public class TourismDeskVerificationLocalServiceWrapper
	implements ServiceWrapper<TourismDeskVerificationLocalService>,
			   TourismDeskVerificationLocalService {

	public TourismDeskVerificationLocalServiceWrapper() {
		this(null);
	}

	public TourismDeskVerificationLocalServiceWrapper(
		TourismDeskVerificationLocalService
			tourismDeskVerificationLocalService) {

		_tourismDeskVerificationLocalService =
			tourismDeskVerificationLocalService;
	}

	/**
	 * Adds the tourism desk verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismDeskVerification the tourism desk verification
	 * @return the tourism desk verification that was added
	 */
	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismDeskVerification addTourismDeskVerification(
				com.nbp.tourism.application.stages.services.model.
					TourismDeskVerification tourismDeskVerification) {

		return _tourismDeskVerificationLocalService.addTourismDeskVerification(
			tourismDeskVerification);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismDeskVerificationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism desk verification with the primary key. Does not add the tourism desk verification to the database.
	 *
	 * @param tourismDeskVeriId the primary key for the new tourism desk verification
	 * @return the new tourism desk verification
	 */
	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismDeskVerification createTourismDeskVerification(
				long tourismDeskVeriId) {

		return _tourismDeskVerificationLocalService.
			createTourismDeskVerification(tourismDeskVeriId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismDeskVerificationLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the tourism desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismDeskVeriId the primary key of the tourism desk verification
	 * @return the tourism desk verification that was removed
	 * @throws PortalException if a tourism desk verification with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismDeskVerification deleteTourismDeskVerification(
					long tourismDeskVeriId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismDeskVerificationLocalService.
			deleteTourismDeskVerification(tourismDeskVeriId);
	}

	/**
	 * Deletes the tourism desk verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismDeskVerification the tourism desk verification
	 * @return the tourism desk verification that was removed
	 */
	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismDeskVerification deleteTourismDeskVerification(
				com.nbp.tourism.application.stages.services.model.
					TourismDeskVerification tourismDeskVerification) {

		return _tourismDeskVerificationLocalService.
			deleteTourismDeskVerification(tourismDeskVerification);
	}

	@Override
	public void deleteTourismDV_ById(long tourismApplicationId) {
		_tourismDeskVerificationLocalService.deleteTourismDV_ById(
			tourismApplicationId);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismDeskVerificationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismDeskVerificationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismDeskVerificationLocalService.dynamicQuery();
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

		return _tourismDeskVerificationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.stages.services.model.impl.TourismDeskVerificationModelImpl</code>.
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

		return _tourismDeskVerificationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.stages.services.model.impl.TourismDeskVerificationModelImpl</code>.
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

		return _tourismDeskVerificationLocalService.dynamicQuery(
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

		return _tourismDeskVerificationLocalService.dynamicQueryCount(
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

		return _tourismDeskVerificationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismDeskVerification fetchTourismDeskVerification(
				long tourismDeskVeriId) {

		return _tourismDeskVerificationLocalService.
			fetchTourismDeskVerification(tourismDeskVeriId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismDeskVerificationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismDeskVerificationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismDeskVerificationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismDeskVerificationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the tourism desk verification with the primary key.
	 *
	 * @param tourismDeskVeriId the primary key of the tourism desk verification
	 * @return the tourism desk verification
	 * @throws PortalException if a tourism desk verification with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismDeskVerification getTourismDeskVerification(
					long tourismDeskVeriId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismDeskVerificationLocalService.getTourismDeskVerification(
			tourismDeskVeriId);
	}

	/**
	 * Returns a range of all the tourism desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.stages.services.model.impl.TourismDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism desk verifications
	 * @param end the upper bound of the range of tourism desk verifications (not inclusive)
	 * @return the range of tourism desk verifications
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.stages.services.model.
			TourismDeskVerification> getTourismDeskVerifications(
				int start, int end) {

		return _tourismDeskVerificationLocalService.getTourismDeskVerifications(
			start, end);
	}

	@Override
	public java.util.List
		<com.nbp.tourism.application.stages.services.model.
			TourismDeskVerification> getTourismDeskVerifications(
				long tourismApplicationId) {

		return _tourismDeskVerificationLocalService.getTourismDeskVerifications(
			tourismApplicationId);
	}

	/**
	 * Returns the number of tourism desk verifications.
	 *
	 * @return the number of tourism desk verifications
	 */
	@Override
	public int getTourismDeskVerificationsCount() {
		return _tourismDeskVerificationLocalService.
			getTourismDeskVerificationsCount();
	}

	/**
	 * Updates the tourism desk verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismDeskVerification the tourism desk verification
	 * @return the tourism desk verification that was updated
	 */
	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismDeskVerification updateTourismDeskVerification(
				com.nbp.tourism.application.stages.services.model.
					TourismDeskVerification tourismDeskVerification) {

		return _tourismDeskVerificationLocalService.
			updateTourismDeskVerification(tourismDeskVerification);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismDeskVerificationLocalService.getBasePersistence();
	}

	@Override
	public TourismDeskVerificationLocalService getWrappedService() {
		return _tourismDeskVerificationLocalService;
	}

	@Override
	public void setWrappedService(
		TourismDeskVerificationLocalService
			tourismDeskVerificationLocalService) {

		_tourismDeskVerificationLocalService =
			tourismDeskVerificationLocalService;
	}

	private TourismDeskVerificationLocalService
		_tourismDeskVerificationLocalService;

}