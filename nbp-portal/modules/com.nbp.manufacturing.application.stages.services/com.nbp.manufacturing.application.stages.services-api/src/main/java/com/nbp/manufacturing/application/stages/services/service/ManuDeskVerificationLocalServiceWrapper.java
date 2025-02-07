/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ManuDeskVerificationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ManuDeskVerificationLocalService
 * @generated
 */
public class ManuDeskVerificationLocalServiceWrapper
	implements ManuDeskVerificationLocalService,
			   ServiceWrapper<ManuDeskVerificationLocalService> {

	public ManuDeskVerificationLocalServiceWrapper() {
		this(null);
	}

	public ManuDeskVerificationLocalServiceWrapper(
		ManuDeskVerificationLocalService manuDeskVerificationLocalService) {

		_manuDeskVerificationLocalService = manuDeskVerificationLocalService;
	}

	/**
	 * Adds the manu desk verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuDeskVerification the manu desk verification
	 * @return the manu desk verification that was added
	 */
	@Override
	public
		com.nbp.manufacturing.application.stages.services.model.
			ManuDeskVerification addManuDeskVerification(
				com.nbp.manufacturing.application.stages.services.model.
					ManuDeskVerification manuDeskVerification) {

		return _manuDeskVerificationLocalService.addManuDeskVerification(
			manuDeskVerification);
	}

	/**
	 * Creates a new manu desk verification with the primary key. Does not add the manu desk verification to the database.
	 *
	 * @param manuDeskVerificationId the primary key for the new manu desk verification
	 * @return the new manu desk verification
	 */
	@Override
	public
		com.nbp.manufacturing.application.stages.services.model.
			ManuDeskVerification createManuDeskVerification(
				long manuDeskVerificationId) {

		return _manuDeskVerificationLocalService.createManuDeskVerification(
			manuDeskVerificationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuDeskVerificationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the manu desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuDeskVerificationId the primary key of the manu desk verification
	 * @return the manu desk verification that was removed
	 * @throws PortalException if a manu desk verification with the primary key could not be found
	 */
	@Override
	public
		com.nbp.manufacturing.application.stages.services.model.
			ManuDeskVerification deleteManuDeskVerification(
					long manuDeskVerificationId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _manuDeskVerificationLocalService.deleteManuDeskVerification(
			manuDeskVerificationId);
	}

	/**
	 * Deletes the manu desk verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuDeskVerification the manu desk verification
	 * @return the manu desk verification that was removed
	 */
	@Override
	public
		com.nbp.manufacturing.application.stages.services.model.
			ManuDeskVerification deleteManuDeskVerification(
				com.nbp.manufacturing.application.stages.services.model.
					ManuDeskVerification manuDeskVerification) {

		return _manuDeskVerificationLocalService.deleteManuDeskVerification(
			manuDeskVerification);
	}

	@Override
	public void deleteManufacturingDV_ById(long manufacturingApplicationId) {
		_manuDeskVerificationLocalService.deleteManufacturingDV_ById(
			manufacturingApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuDeskVerificationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _manuDeskVerificationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _manuDeskVerificationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _manuDeskVerificationLocalService.dynamicQuery();
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

		return _manuDeskVerificationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManuDeskVerificationModelImpl</code>.
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

		return _manuDeskVerificationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManuDeskVerificationModelImpl</code>.
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

		return _manuDeskVerificationLocalService.dynamicQuery(
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

		return _manuDeskVerificationLocalService.dynamicQueryCount(
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

		return _manuDeskVerificationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.manufacturing.application.stages.services.model.
			ManuDeskVerification fetchManuDeskVerification(
				long manuDeskVerificationId) {

		return _manuDeskVerificationLocalService.fetchManuDeskVerification(
			manuDeskVerificationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _manuDeskVerificationLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.manufacturing.application.stages.services.model.
			ManuDeskVerification> getDeskVerificationManufactuirngById(
				long manufacturingApplicationId) {

		return _manuDeskVerificationLocalService.
			getDeskVerificationManufactuirngById(manufacturingApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _manuDeskVerificationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the manu desk verification with the primary key.
	 *
	 * @param manuDeskVerificationId the primary key of the manu desk verification
	 * @return the manu desk verification
	 * @throws PortalException if a manu desk verification with the primary key could not be found
	 */
	@Override
	public
		com.nbp.manufacturing.application.stages.services.model.
			ManuDeskVerification getManuDeskVerification(
					long manuDeskVerificationId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _manuDeskVerificationLocalService.getManuDeskVerification(
			manuDeskVerificationId);
	}

	@Override
	public java.util.List
		<com.nbp.manufacturing.application.stages.services.model.
			ManuDeskVerification> getManuDeskVerificationByStatus_ApplicationId(
				String status, long manufacturingApplicationId) {

		return _manuDeskVerificationLocalService.
			getManuDeskVerificationByStatus_ApplicationId(
				status, manufacturingApplicationId);
	}

	/**
	 * Returns a range of all the manu desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManuDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu desk verifications
	 * @param end the upper bound of the range of manu desk verifications (not inclusive)
	 * @return the range of manu desk verifications
	 */
	@Override
	public java.util.List
		<com.nbp.manufacturing.application.stages.services.model.
			ManuDeskVerification> getManuDeskVerifications(int start, int end) {

		return _manuDeskVerificationLocalService.getManuDeskVerifications(
			start, end);
	}

	/**
	 * Returns the number of manu desk verifications.
	 *
	 * @return the number of manu desk verifications
	 */
	@Override
	public int getManuDeskVerificationsCount() {
		return _manuDeskVerificationLocalService.
			getManuDeskVerificationsCount();
	}

	@Override
	public
		com.nbp.manufacturing.application.stages.services.model.
			ManuDeskVerification getManufactuirngById(
					long manufacturingApplicationId)
				throws com.nbp.manufacturing.application.stages.services.
					exception.NoSuchManuDeskVerificationException {

		return _manuDeskVerificationLocalService.getManufactuirngById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _manuDeskVerificationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuDeskVerificationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the manu desk verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuDeskVerification the manu desk verification
	 * @return the manu desk verification that was updated
	 */
	@Override
	public
		com.nbp.manufacturing.application.stages.services.model.
			ManuDeskVerification updateManuDeskVerification(
				com.nbp.manufacturing.application.stages.services.model.
					ManuDeskVerification manuDeskVerification) {

		return _manuDeskVerificationLocalService.updateManuDeskVerification(
			manuDeskVerification);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _manuDeskVerificationLocalService.getBasePersistence();
	}

	@Override
	public ManuDeskVerificationLocalService getWrappedService() {
		return _manuDeskVerificationLocalService;
	}

	@Override
	public void setWrappedService(
		ManuDeskVerificationLocalService manuDeskVerificationLocalService) {

		_manuDeskVerificationLocalService = manuDeskVerificationLocalService;
	}

	private ManuDeskVerificationLocalService _manuDeskVerificationLocalService;

}