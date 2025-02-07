/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiInsolveDeskVerificationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolveDeskVerificationLocalService
 * @generated
 */
public class OsiInsolveDeskVerificationLocalServiceWrapper
	implements OsiInsolveDeskVerificationLocalService,
			   ServiceWrapper<OsiInsolveDeskVerificationLocalService> {

	public OsiInsolveDeskVerificationLocalServiceWrapper() {
		this(null);
	}

	public OsiInsolveDeskVerificationLocalServiceWrapper(
		OsiInsolveDeskVerificationLocalService
			osiInsolveDeskVerificationLocalService) {

		_osiInsolveDeskVerificationLocalService =
			osiInsolveDeskVerificationLocalService;
	}

	/**
	 * Adds the osi insolve desk verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolveDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolveDeskVerification the osi insolve desk verification
	 * @return the osi insolve desk verification that was added
	 */
	@Override
	public
		com.nbp.osi.insolvency.stage.services.model.OsiInsolveDeskVerification
			addOsiInsolveDeskVerification(
				com.nbp.osi.insolvency.stage.services.model.
					OsiInsolveDeskVerification osiInsolveDeskVerification) {

		return _osiInsolveDeskVerificationLocalService.
			addOsiInsolveDeskVerification(osiInsolveDeskVerification);
	}

	/**
	 * Creates a new osi insolve desk verification with the primary key. Does not add the osi insolve desk verification to the database.
	 *
	 * @param OsiInsolveDeskVerificationId the primary key for the new osi insolve desk verification
	 * @return the new osi insolve desk verification
	 */
	@Override
	public
		com.nbp.osi.insolvency.stage.services.model.OsiInsolveDeskVerification
			createOsiInsolveDeskVerification(
				long OsiInsolveDeskVerificationId) {

		return _osiInsolveDeskVerificationLocalService.
			createOsiInsolveDeskVerification(OsiInsolveDeskVerificationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolveDeskVerificationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the osi insolve desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolveDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param OsiInsolveDeskVerificationId the primary key of the osi insolve desk verification
	 * @return the osi insolve desk verification that was removed
	 * @throws PortalException if a osi insolve desk verification with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.stage.services.model.OsiInsolveDeskVerification
				deleteOsiInsolveDeskVerification(
					long OsiInsolveDeskVerificationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolveDeskVerificationLocalService.
			deleteOsiInsolveDeskVerification(OsiInsolveDeskVerificationId);
	}

	/**
	 * Deletes the osi insolve desk verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolveDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolveDeskVerification the osi insolve desk verification
	 * @return the osi insolve desk verification that was removed
	 */
	@Override
	public
		com.nbp.osi.insolvency.stage.services.model.OsiInsolveDeskVerification
			deleteOsiInsolveDeskVerification(
				com.nbp.osi.insolvency.stage.services.model.
					OsiInsolveDeskVerification osiInsolveDeskVerification) {

		return _osiInsolveDeskVerificationLocalService.
			deleteOsiInsolveDeskVerification(osiInsolveDeskVerification);
	}

	@Override
	public void deleteOsiInsolvencyDeskVerificationId(long osiInsolvencyId) {
		_osiInsolveDeskVerificationLocalService.
			deleteOsiInsolvencyDeskVerificationId(osiInsolvencyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolveDeskVerificationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiInsolveDeskVerificationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiInsolveDeskVerificationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiInsolveDeskVerificationLocalService.dynamicQuery();
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

		return _osiInsolveDeskVerificationLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolveDeskVerificationModelImpl</code>.
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

		return _osiInsolveDeskVerificationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolveDeskVerificationModelImpl</code>.
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

		return _osiInsolveDeskVerificationLocalService.dynamicQuery(
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

		return _osiInsolveDeskVerificationLocalService.dynamicQueryCount(
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

		return _osiInsolveDeskVerificationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.osi.insolvency.stage.services.model.OsiInsolveDeskVerification
			fetchOsiInsolveDeskVerification(long OsiInsolveDeskVerificationId) {

		return _osiInsolveDeskVerificationLocalService.
			fetchOsiInsolveDeskVerification(OsiInsolveDeskVerificationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiInsolveDeskVerificationLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.osi.insolvency.stage.services.model.OsiInsolveDeskVerification>
			getDeskVerificationOsiInsolvencyById(long osiInsolvencyId) {

		return _osiInsolveDeskVerificationLocalService.
			getDeskVerificationOsiInsolvencyById(osiInsolvencyId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiInsolveDeskVerificationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiInsolveDeskVerificationLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * Returns the osi insolve desk verification with the primary key.
	 *
	 * @param OsiInsolveDeskVerificationId the primary key of the osi insolve desk verification
	 * @return the osi insolve desk verification
	 * @throws PortalException if a osi insolve desk verification with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.stage.services.model.OsiInsolveDeskVerification
				getOsiInsolveDeskVerification(long OsiInsolveDeskVerificationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolveDeskVerificationLocalService.
			getOsiInsolveDeskVerification(OsiInsolveDeskVerificationId);
	}

	/**
	 * Returns a range of all the osi insolve desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolveDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolve desk verifications
	 * @param end the upper bound of the range of osi insolve desk verifications (not inclusive)
	 * @return the range of osi insolve desk verifications
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.stage.services.model.OsiInsolveDeskVerification>
			getOsiInsolveDeskVerifications(int start, int end) {

		return _osiInsolveDeskVerificationLocalService.
			getOsiInsolveDeskVerifications(start, end);
	}

	/**
	 * Returns the number of osi insolve desk verifications.
	 *
	 * @return the number of osi insolve desk verifications
	 */
	@Override
	public int getOsiInsolveDeskVerificationsCount() {
		return _osiInsolveDeskVerificationLocalService.
			getOsiInsolveDeskVerificationsCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolveDeskVerificationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the osi insolve desk verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolveDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolveDeskVerification the osi insolve desk verification
	 * @return the osi insolve desk verification that was updated
	 */
	@Override
	public
		com.nbp.osi.insolvency.stage.services.model.OsiInsolveDeskVerification
			updateOsiInsolveDeskVerification(
				com.nbp.osi.insolvency.stage.services.model.
					OsiInsolveDeskVerification osiInsolveDeskVerification) {

		return _osiInsolveDeskVerificationLocalService.
			updateOsiInsolveDeskVerification(osiInsolveDeskVerification);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiInsolveDeskVerificationLocalService.getBasePersistence();
	}

	@Override
	public OsiInsolveDeskVerificationLocalService getWrappedService() {
		return _osiInsolveDeskVerificationLocalService;
	}

	@Override
	public void setWrappedService(
		OsiInsolveDeskVerificationLocalService
			osiInsolveDeskVerificationLocalService) {

		_osiInsolveDeskVerificationLocalService =
			osiInsolveDeskVerificationLocalService;
	}

	private OsiInsolveDeskVerificationLocalService
		_osiInsolveDeskVerificationLocalService;

}