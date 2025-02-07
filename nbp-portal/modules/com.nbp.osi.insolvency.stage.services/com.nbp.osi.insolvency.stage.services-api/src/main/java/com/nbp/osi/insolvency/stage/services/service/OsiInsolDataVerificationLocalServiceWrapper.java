/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiInsolDataVerificationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolDataVerificationLocalService
 * @generated
 */
public class OsiInsolDataVerificationLocalServiceWrapper
	implements OsiInsolDataVerificationLocalService,
			   ServiceWrapper<OsiInsolDataVerificationLocalService> {

	public OsiInsolDataVerificationLocalServiceWrapper() {
		this(null);
	}

	public OsiInsolDataVerificationLocalServiceWrapper(
		OsiInsolDataVerificationLocalService
			osiInsolDataVerificationLocalService) {

		_osiInsolDataVerificationLocalService =
			osiInsolDataVerificationLocalService;
	}

	/**
	 * Adds the osi insol data verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolDataVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolDataVerification the osi insol data verification
	 * @return the osi insol data verification that was added
	 */
	@Override
	public com.nbp.osi.insolvency.stage.services.model.OsiInsolDataVerification
		addOsiInsolDataVerification(
			com.nbp.osi.insolvency.stage.services.model.OsiInsolDataVerification
				osiInsolDataVerification) {

		return _osiInsolDataVerificationLocalService.
			addOsiInsolDataVerification(osiInsolDataVerification);
	}

	/**
	 * Creates a new osi insol data verification with the primary key. Does not add the osi insol data verification to the database.
	 *
	 * @param osiInsolDataVerificationId the primary key for the new osi insol data verification
	 * @return the new osi insol data verification
	 */
	@Override
	public com.nbp.osi.insolvency.stage.services.model.OsiInsolDataVerification
		createOsiInsolDataVerification(long osiInsolDataVerificationId) {

		return _osiInsolDataVerificationLocalService.
			createOsiInsolDataVerification(osiInsolDataVerificationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolDataVerificationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the osi insol data verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolDataVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolDataVerificationId the primary key of the osi insol data verification
	 * @return the osi insol data verification that was removed
	 * @throws PortalException if a osi insol data verification with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.stage.services.model.OsiInsolDataVerification
			deleteOsiInsolDataVerification(long osiInsolDataVerificationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolDataVerificationLocalService.
			deleteOsiInsolDataVerification(osiInsolDataVerificationId);
	}

	/**
	 * Deletes the osi insol data verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolDataVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolDataVerification the osi insol data verification
	 * @return the osi insol data verification that was removed
	 */
	@Override
	public com.nbp.osi.insolvency.stage.services.model.OsiInsolDataVerification
		deleteOsiInsolDataVerification(
			com.nbp.osi.insolvency.stage.services.model.OsiInsolDataVerification
				osiInsolDataVerification) {

		return _osiInsolDataVerificationLocalService.
			deleteOsiInsolDataVerification(osiInsolDataVerification);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolDataVerificationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiInsolDataVerificationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiInsolDataVerificationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiInsolDataVerificationLocalService.dynamicQuery();
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

		return _osiInsolDataVerificationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolDataVerificationModelImpl</code>.
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

		return _osiInsolDataVerificationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolDataVerificationModelImpl</code>.
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

		return _osiInsolDataVerificationLocalService.dynamicQuery(
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

		return _osiInsolDataVerificationLocalService.dynamicQueryCount(
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

		return _osiInsolDataVerificationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.insolvency.stage.services.model.OsiInsolDataVerification
		fetchOsiInsolDataVerification(long osiInsolDataVerificationId) {

		return _osiInsolDataVerificationLocalService.
			fetchOsiInsolDataVerification(osiInsolDataVerificationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiInsolDataVerificationLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiInsolDataVerificationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiInsolDataVerificationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * Returns the osi insol data verification with the primary key.
	 *
	 * @param osiInsolDataVerificationId the primary key of the osi insol data verification
	 * @return the osi insol data verification
	 * @throws PortalException if a osi insol data verification with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.stage.services.model.OsiInsolDataVerification
			getOsiInsolDataVerification(long osiInsolDataVerificationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolDataVerificationLocalService.
			getOsiInsolDataVerification(osiInsolDataVerificationId);
	}

	/**
	 * Returns a range of all the osi insol data verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolDataVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insol data verifications
	 * @param end the upper bound of the range of osi insol data verifications (not inclusive)
	 * @return the range of osi insol data verifications
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.stage.services.model.OsiInsolDataVerification>
			getOsiInsolDataVerifications(int start, int end) {

		return _osiInsolDataVerificationLocalService.
			getOsiInsolDataVerifications(start, end);
	}

	/**
	 * Returns the number of osi insol data verifications.
	 *
	 * @return the number of osi insol data verifications
	 */
	@Override
	public int getOsiInsolDataVerificationsCount() {
		return _osiInsolDataVerificationLocalService.
			getOsiInsolDataVerificationsCount();
	}

	@Override
	public com.nbp.osi.insolvency.stage.services.model.OsiInsolDataVerification
			getOSIIRIssuanceOfReportBy_CI(String caseId)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolDataVerificationException {

		return _osiInsolDataVerificationLocalService.
			getOSIIRIssuanceOfReportBy_CI(caseId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolDataVerificationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public com.nbp.osi.insolvency.stage.services.model.OsiInsolDataVerification
		updateDataVerification(String caseId, String status) {

		return _osiInsolDataVerificationLocalService.updateDataVerification(
			caseId, status);
	}

	/**
	 * Updates the osi insol data verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolDataVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolDataVerification the osi insol data verification
	 * @return the osi insol data verification that was updated
	 */
	@Override
	public com.nbp.osi.insolvency.stage.services.model.OsiInsolDataVerification
		updateOsiInsolDataVerification(
			com.nbp.osi.insolvency.stage.services.model.OsiInsolDataVerification
				osiInsolDataVerification) {

		return _osiInsolDataVerificationLocalService.
			updateOsiInsolDataVerification(osiInsolDataVerification);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiInsolDataVerificationLocalService.getBasePersistence();
	}

	@Override
	public OsiInsolDataVerificationLocalService getWrappedService() {
		return _osiInsolDataVerificationLocalService;
	}

	@Override
	public void setWrappedService(
		OsiInsolDataVerificationLocalService
			osiInsolDataVerificationLocalService) {

		_osiInsolDataVerificationLocalService =
			osiInsolDataVerificationLocalService;
	}

	private OsiInsolDataVerificationLocalService
		_osiInsolDataVerificationLocalService;

}