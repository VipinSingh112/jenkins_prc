/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AcquireDeskVerificationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireDeskVerificationLocalService
 * @generated
 */
public class AcquireDeskVerificationLocalServiceWrapper
	implements AcquireDeskVerificationLocalService,
			   ServiceWrapper<AcquireDeskVerificationLocalService> {

	public AcquireDeskVerificationLocalServiceWrapper() {
		this(null);
	}

	public AcquireDeskVerificationLocalServiceWrapper(
		AcquireDeskVerificationLocalService
			acquireDeskVerificationLocalService) {

		_acquireDeskVerificationLocalService =
			acquireDeskVerificationLocalService;
	}

	/**
	 * Adds the acquire desk verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireDeskVerification the acquire desk verification
	 * @return the acquire desk verification that was added
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireDeskVerification
		addAcquireDeskVerification(
			com.nbp.acquire.stages.service.model.AcquireDeskVerification
				acquireDeskVerification) {

		return _acquireDeskVerificationLocalService.addAcquireDeskVerification(
			acquireDeskVerification);
	}

	/**
	 * Creates a new acquire desk verification with the primary key. Does not add the acquire desk verification to the database.
	 *
	 * @param acquireDeskVerificationId the primary key for the new acquire desk verification
	 * @return the new acquire desk verification
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireDeskVerification
		createAcquireDeskVerification(long acquireDeskVerificationId) {

		return _acquireDeskVerificationLocalService.
			createAcquireDeskVerification(acquireDeskVerificationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireDeskVerificationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acquire desk verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireDeskVerification the acquire desk verification
	 * @return the acquire desk verification that was removed
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireDeskVerification
		deleteAcquireDeskVerification(
			com.nbp.acquire.stages.service.model.AcquireDeskVerification
				acquireDeskVerification) {

		return _acquireDeskVerificationLocalService.
			deleteAcquireDeskVerification(acquireDeskVerification);
	}

	/**
	 * Deletes the acquire desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireDeskVerificationId the primary key of the acquire desk verification
	 * @return the acquire desk verification that was removed
	 * @throws PortalException if a acquire desk verification with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireDeskVerification
			deleteAcquireDeskVerification(long acquireDeskVerificationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireDeskVerificationLocalService.
			deleteAcquireDeskVerification(acquireDeskVerificationId);
	}

	@Override
	public void deleteAcquireDeskVerificationId(long acquireApplicationId) {
		_acquireDeskVerificationLocalService.deleteAcquireDeskVerificationId(
			acquireApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireDeskVerificationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _acquireDeskVerificationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _acquireDeskVerificationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _acquireDeskVerificationLocalService.dynamicQuery();
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

		return _acquireDeskVerificationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireDeskVerificationModelImpl</code>.
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

		return _acquireDeskVerificationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireDeskVerificationModelImpl</code>.
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

		return _acquireDeskVerificationLocalService.dynamicQuery(
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

		return _acquireDeskVerificationLocalService.dynamicQueryCount(
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

		return _acquireDeskVerificationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireDeskVerification
		fetchAcquireDeskVerification(long acquireDeskVerificationId) {

		return _acquireDeskVerificationLocalService.
			fetchAcquireDeskVerification(acquireDeskVerificationId);
	}

	/**
	 * Returns the acquire desk verification with the primary key.
	 *
	 * @param acquireDeskVerificationId the primary key of the acquire desk verification
	 * @return the acquire desk verification
	 * @throws PortalException if a acquire desk verification with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireDeskVerification
			getAcquireDeskVerification(long acquireDeskVerificationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireDeskVerificationLocalService.getAcquireDeskVerification(
			acquireDeskVerificationId);
	}

	/**
	 * Returns a range of all the acquire desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire desk verifications
	 * @param end the upper bound of the range of acquire desk verifications (not inclusive)
	 * @return the range of acquire desk verifications
	 */
	@Override
	public java.util.List
		<com.nbp.acquire.stages.service.model.AcquireDeskVerification>
			getAcquireDeskVerifications(int start, int end) {

		return _acquireDeskVerificationLocalService.getAcquireDeskVerifications(
			start, end);
	}

	/**
	 * Returns the number of acquire desk verifications.
	 *
	 * @return the number of acquire desk verifications
	 */
	@Override
	public int getAcquireDeskVerificationsCount() {
		return _acquireDeskVerificationLocalService.
			getAcquireDeskVerificationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _acquireDeskVerificationLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.acquire.stages.service.model.AcquireDeskVerification>
			getDeskVerificationAcquireById(long acquireApplicationId) {

		return _acquireDeskVerificationLocalService.
			getDeskVerificationAcquireById(acquireApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _acquireDeskVerificationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireDeskVerificationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireDeskVerificationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acquire desk verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireDeskVerification the acquire desk verification
	 * @return the acquire desk verification that was updated
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireDeskVerification
		updateAcquireDeskVerification(
			com.nbp.acquire.stages.service.model.AcquireDeskVerification
				acquireDeskVerification) {

		return _acquireDeskVerificationLocalService.
			updateAcquireDeskVerification(acquireDeskVerification);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _acquireDeskVerificationLocalService.getBasePersistence();
	}

	@Override
	public AcquireDeskVerificationLocalService getWrappedService() {
		return _acquireDeskVerificationLocalService;
	}

	@Override
	public void setWrappedService(
		AcquireDeskVerificationLocalService
			acquireDeskVerificationLocalService) {

		_acquireDeskVerificationLocalService =
			acquireDeskVerificationLocalService;
	}

	private AcquireDeskVerificationLocalService
		_acquireDeskVerificationLocalService;

}