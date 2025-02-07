/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ExplosiveReviewAndVerificationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveReviewAndVerificationLocalService
 * @generated
 */
public class ExplosiveReviewAndVerificationLocalServiceWrapper
	implements ExplosiveReviewAndVerificationLocalService,
			   ServiceWrapper<ExplosiveReviewAndVerificationLocalService> {

	public ExplosiveReviewAndVerificationLocalServiceWrapper() {
		this(null);
	}

	public ExplosiveReviewAndVerificationLocalServiceWrapper(
		ExplosiveReviewAndVerificationLocalService
			explosiveReviewAndVerificationLocalService) {

		_explosiveReviewAndVerificationLocalService =
			explosiveReviewAndVerificationLocalService;
	}

	/**
	 * Adds the explosive review and verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveReviewAndVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveReviewAndVerification the explosive review and verification
	 * @return the explosive review and verification that was added
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveReviewAndVerification addExplosiveReviewAndVerification(
			com.nbp.explosives.competency.stages.service.model.
				ExplosiveReviewAndVerification explosiveReviewAndVerification) {

		return _explosiveReviewAndVerificationLocalService.
			addExplosiveReviewAndVerification(explosiveReviewAndVerification);
	}

	/**
	 * Creates a new explosive review and verification with the primary key. Does not add the explosive review and verification to the database.
	 *
	 * @param issuanceId the primary key for the new explosive review and verification
	 * @return the new explosive review and verification
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveReviewAndVerification createExplosiveReviewAndVerification(
			long issuanceId) {

		return _explosiveReviewAndVerificationLocalService.
			createExplosiveReviewAndVerification(issuanceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _explosiveReviewAndVerificationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the explosive review and verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveReviewAndVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveReviewAndVerification the explosive review and verification
	 * @return the explosive review and verification that was removed
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveReviewAndVerification deleteExplosiveReviewAndVerification(
			com.nbp.explosives.competency.stages.service.model.
				ExplosiveReviewAndVerification explosiveReviewAndVerification) {

		return _explosiveReviewAndVerificationLocalService.
			deleteExplosiveReviewAndVerification(
				explosiveReviewAndVerification);
	}

	/**
	 * Deletes the explosive review and verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveReviewAndVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param issuanceId the primary key of the explosive review and verification
	 * @return the explosive review and verification that was removed
	 * @throws PortalException if a explosive review and verification with the primary key could not be found
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveReviewAndVerification deleteExplosiveReviewAndVerification(
				long issuanceId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _explosiveReviewAndVerificationLocalService.
			deleteExplosiveReviewAndVerification(issuanceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _explosiveReviewAndVerificationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _explosiveReviewAndVerificationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _explosiveReviewAndVerificationLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _explosiveReviewAndVerificationLocalService.dynamicQuery();
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

		return _explosiveReviewAndVerificationLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveReviewAndVerificationModelImpl</code>.
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

		return _explosiveReviewAndVerificationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveReviewAndVerificationModelImpl</code>.
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

		return _explosiveReviewAndVerificationLocalService.dynamicQuery(
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

		return _explosiveReviewAndVerificationLocalService.dynamicQueryCount(
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

		return _explosiveReviewAndVerificationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveReviewAndVerification fetchExplosiveReviewAndVerification(
			long issuanceId) {

		return _explosiveReviewAndVerificationLocalService.
			fetchExplosiveReviewAndVerification(issuanceId);
	}

	/**
	 * Returns the explosive review and verification matching the UUID and group.
	 *
	 * @param uuid the explosive review and verification's UUID
	 * @param groupId the primary key of the group
	 * @return the matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveReviewAndVerification
			fetchExplosiveReviewAndVerificationByUuidAndGroupId(
				String uuid, long groupId) {

		return _explosiveReviewAndVerificationLocalService.
			fetchExplosiveReviewAndVerificationByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _explosiveReviewAndVerificationLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the explosive review and verification with the primary key.
	 *
	 * @param issuanceId the primary key of the explosive review and verification
	 * @return the explosive review and verification
	 * @throws PortalException if a explosive review and verification with the primary key could not be found
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveReviewAndVerification getExplosiveReviewAndVerification(
				long issuanceId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _explosiveReviewAndVerificationLocalService.
			getExplosiveReviewAndVerification(issuanceId);
	}

	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveReviewAndVerification getExplosiveReviewAndVerificationByCI(
				String caseId)
			throws com.nbp.explosives.competency.stages.service.exception.
				NoSuchExplosiveReviewAndVerificationException {

		return _explosiveReviewAndVerificationLocalService.
			getExplosiveReviewAndVerificationByCI(caseId);
	}

	/**
	 * Returns the explosive review and verification matching the UUID and group.
	 *
	 * @param uuid the explosive review and verification's UUID
	 * @param groupId the primary key of the group
	 * @return the matching explosive review and verification
	 * @throws PortalException if a matching explosive review and verification could not be found
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveReviewAndVerification
				getExplosiveReviewAndVerificationByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _explosiveReviewAndVerificationLocalService.
			getExplosiveReviewAndVerificationByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public java.util.List
		<com.nbp.explosives.competency.stages.service.model.
			ExplosiveReviewAndVerification>
					getExplosiveReviewAndVerificationListByCI(String caseId)
				throws com.nbp.explosives.competency.stages.service.exception.
					NoSuchExplosiveReviewAndVerificationException {

		return _explosiveReviewAndVerificationLocalService.
			getExplosiveReviewAndVerificationListByCI(caseId);
	}

	/**
	 * Returns a range of all the explosive review and verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @return the range of explosive review and verifications
	 */
	@Override
	public java.util.List
		<com.nbp.explosives.competency.stages.service.model.
			ExplosiveReviewAndVerification> getExplosiveReviewAndVerifications(
				int start, int end) {

		return _explosiveReviewAndVerificationLocalService.
			getExplosiveReviewAndVerifications(start, end);
	}

	/**
	 * Returns all the explosive review and verifications matching the UUID and company.
	 *
	 * @param uuid the UUID of the explosive review and verifications
	 * @param companyId the primary key of the company
	 * @return the matching explosive review and verifications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.explosives.competency.stages.service.model.
			ExplosiveReviewAndVerification>
				getExplosiveReviewAndVerificationsByUuidAndCompanyId(
					String uuid, long companyId) {

		return _explosiveReviewAndVerificationLocalService.
			getExplosiveReviewAndVerificationsByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of explosive review and verifications matching the UUID and company.
	 *
	 * @param uuid the UUID of the explosive review and verifications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching explosive review and verifications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.explosives.competency.stages.service.model.
			ExplosiveReviewAndVerification>
				getExplosiveReviewAndVerificationsByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.explosives.competency.stages.service.model.
							ExplosiveReviewAndVerification> orderByComparator) {

		return _explosiveReviewAndVerificationLocalService.
			getExplosiveReviewAndVerificationsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of explosive review and verifications.
	 *
	 * @return the number of explosive review and verifications
	 */
	@Override
	public int getExplosiveReviewAndVerificationsCount() {
		return _explosiveReviewAndVerificationLocalService.
			getExplosiveReviewAndVerificationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _explosiveReviewAndVerificationLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _explosiveReviewAndVerificationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _explosiveReviewAndVerificationLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _explosiveReviewAndVerificationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the explosive review and verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveReviewAndVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveReviewAndVerification the explosive review and verification
	 * @return the explosive review and verification that was updated
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveReviewAndVerification updateExplosiveReviewAndVerification(
			com.nbp.explosives.competency.stages.service.model.
				ExplosiveReviewAndVerification explosiveReviewAndVerification) {

		return _explosiveReviewAndVerificationLocalService.
			updateExplosiveReviewAndVerification(
				explosiveReviewAndVerification);
	}

	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveReviewAndVerification updateExplosiveReviewAndVerificationData(
			String caseId, java.util.Date dateReceived, String amountDue,
			String amountreceived, String receiptNumber, String comments,
			String amountOutstanding, java.util.Date dueDate, String status) {

		return _explosiveReviewAndVerificationLocalService.
			updateExplosiveReviewAndVerificationData(
				caseId, dateReceived, amountDue, amountreceived, receiptNumber,
				comments, amountOutstanding, dueDate, status);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _explosiveReviewAndVerificationLocalService.getBasePersistence();
	}

	@Override
	public ExplosiveReviewAndVerificationLocalService getWrappedService() {
		return _explosiveReviewAndVerificationLocalService;
	}

	@Override
	public void setWrappedService(
		ExplosiveReviewAndVerificationLocalService
			explosiveReviewAndVerificationLocalService) {

		_explosiveReviewAndVerificationLocalService =
			explosiveReviewAndVerificationLocalService;
	}

	private ExplosiveReviewAndVerificationLocalService
		_explosiveReviewAndVerificationLocalService;

}