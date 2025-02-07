/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CannabisApplicationPaymentConfirmationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationPaymentConfirmationLocalService
 * @generated
 */
public class CannabisApplicationPaymentConfirmationLocalServiceWrapper
	implements CannabisApplicationPaymentConfirmationLocalService,
			   ServiceWrapper
				   <CannabisApplicationPaymentConfirmationLocalService> {

	public CannabisApplicationPaymentConfirmationLocalServiceWrapper() {
		this(null);
	}

	public CannabisApplicationPaymentConfirmationLocalServiceWrapper(
		CannabisApplicationPaymentConfirmationLocalService
			cannabisApplicationPaymentConfirmationLocalService) {

		_cannabisApplicationPaymentConfirmationLocalService =
			cannabisApplicationPaymentConfirmationLocalService;
	}

	/**
	 * Adds the cannabis application payment confirmation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationPaymentConfirmation the cannabis application payment confirmation
	 * @return the cannabis application payment confirmation that was added
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisApplicationPaymentConfirmation
			addCannabisApplicationPaymentConfirmation(
				com.npm.cannabis.application.stages.services.model.
					CannabisApplicationPaymentConfirmation
						cannabisApplicationPaymentConfirmation) {

		return _cannabisApplicationPaymentConfirmationLocalService.
			addCannabisApplicationPaymentConfirmation(
				cannabisApplicationPaymentConfirmation);
	}

	/**
	 * Creates a new cannabis application payment confirmation with the primary key. Does not add the cannabis application payment confirmation to the database.
	 *
	 * @param cannabisAppliPaymentConfirId the primary key for the new cannabis application payment confirmation
	 * @return the new cannabis application payment confirmation
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisApplicationPaymentConfirmation
			createCannabisApplicationPaymentConfirmation(
				long cannabisAppliPaymentConfirId) {

		return _cannabisApplicationPaymentConfirmationLocalService.
			createCannabisApplicationPaymentConfirmation(
				cannabisAppliPaymentConfirId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationPaymentConfirmationLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the cannabis application payment confirmation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationPaymentConfirmation the cannabis application payment confirmation
	 * @return the cannabis application payment confirmation that was removed
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisApplicationPaymentConfirmation
			deleteCannabisApplicationPaymentConfirmation(
				com.npm.cannabis.application.stages.services.model.
					CannabisApplicationPaymentConfirmation
						cannabisApplicationPaymentConfirmation) {

		return _cannabisApplicationPaymentConfirmationLocalService.
			deleteCannabisApplicationPaymentConfirmation(
				cannabisApplicationPaymentConfirmation);
	}

	/**
	 * Deletes the cannabis application payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisAppliPaymentConfirId the primary key of the cannabis application payment confirmation
	 * @return the cannabis application payment confirmation that was removed
	 * @throws PortalException if a cannabis application payment confirmation with the primary key could not be found
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisApplicationPaymentConfirmation
				deleteCannabisApplicationPaymentConfirmation(
					long cannabisAppliPaymentConfirId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationPaymentConfirmationLocalService.
			deleteCannabisApplicationPaymentConfirmation(
				cannabisAppliPaymentConfirId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationPaymentConfirmationLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _cannabisApplicationPaymentConfirmationLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _cannabisApplicationPaymentConfirmationLocalService.
			dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cannabisApplicationPaymentConfirmationLocalService.
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

		return _cannabisApplicationPaymentConfirmationLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationPaymentConfirmationModelImpl</code>.
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

		return _cannabisApplicationPaymentConfirmationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationPaymentConfirmationModelImpl</code>.
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

		return _cannabisApplicationPaymentConfirmationLocalService.dynamicQuery(
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

		return _cannabisApplicationPaymentConfirmationLocalService.
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

		return _cannabisApplicationPaymentConfirmationLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisApplicationPaymentConfirmation
			fetchCannabisApplicationPaymentConfirmation(
				long cannabisAppliPaymentConfirId) {

		return _cannabisApplicationPaymentConfirmationLocalService.
			fetchCannabisApplicationPaymentConfirmation(
				cannabisAppliPaymentConfirId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cannabisApplicationPaymentConfirmationLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.npm.cannabis.application.stages.services.model.
			CannabisApplicationPaymentConfirmation> getCA_PC_By_CI(
				String caseId) {

		return _cannabisApplicationPaymentConfirmationLocalService.
			getCA_PC_By_CI(caseId);
	}

	/**
	 * Returns the cannabis application payment confirmation with the primary key.
	 *
	 * @param cannabisAppliPaymentConfirId the primary key of the cannabis application payment confirmation
	 * @return the cannabis application payment confirmation
	 * @throws PortalException if a cannabis application payment confirmation with the primary key could not be found
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisApplicationPaymentConfirmation
				getCannabisApplicationPaymentConfirmation(
					long cannabisAppliPaymentConfirId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationPaymentConfirmationLocalService.
			getCannabisApplicationPaymentConfirmation(
				cannabisAppliPaymentConfirId);
	}

	/**
	 * Returns a range of all the cannabis application payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application payment confirmations
	 * @param end the upper bound of the range of cannabis application payment confirmations (not inclusive)
	 * @return the range of cannabis application payment confirmations
	 */
	@Override
	public java.util.List
		<com.npm.cannabis.application.stages.services.model.
			CannabisApplicationPaymentConfirmation>
				getCannabisApplicationPaymentConfirmations(int start, int end) {

		return _cannabisApplicationPaymentConfirmationLocalService.
			getCannabisApplicationPaymentConfirmations(start, end);
	}

	/**
	 * Returns the number of cannabis application payment confirmations.
	 *
	 * @return the number of cannabis application payment confirmations
	 */
	@Override
	public int getCannabisApplicationPaymentConfirmationsCount() {
		return _cannabisApplicationPaymentConfirmationLocalService.
			getCannabisApplicationPaymentConfirmationsCount();
	}

	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisApplicationPaymentConfirmation getCannabisPaymentByCaseId(
			String caseId) {

		return _cannabisApplicationPaymentConfirmationLocalService.
			getCannabisPaymentByCaseId(caseId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cannabisApplicationPaymentConfirmationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisApplicationPaymentConfirmationLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationPaymentConfirmationLocalService.
			getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the cannabis application payment confirmation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationPaymentConfirmation the cannabis application payment confirmation
	 * @return the cannabis application payment confirmation that was updated
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisApplicationPaymentConfirmation
			updateCannabisApplicationPaymentConfirmation(
				com.npm.cannabis.application.stages.services.model.
					CannabisApplicationPaymentConfirmation
						cannabisApplicationPaymentConfirmation) {

		return _cannabisApplicationPaymentConfirmationLocalService.
			updateCannabisApplicationPaymentConfirmation(
				cannabisApplicationPaymentConfirmation);
	}

	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisApplicationPaymentConfirmation
			updateCannabisPaymentConfirmation(
				String caseId, java.util.Date dateReceived, String amountDue,
				String amountReceived, String receiptNumber, String comment,
				String amountOutstanding, java.util.Date dueDate,
				String status) {

		return _cannabisApplicationPaymentConfirmationLocalService.
			updateCannabisPaymentConfirmation(
				caseId, dateReceived, amountDue, amountReceived, receiptNumber,
				comment, amountOutstanding, dueDate, status);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _cannabisApplicationPaymentConfirmationLocalService.
			getBasePersistence();
	}

	@Override
	public CannabisApplicationPaymentConfirmationLocalService
		getWrappedService() {

		return _cannabisApplicationPaymentConfirmationLocalService;
	}

	@Override
	public void setWrappedService(
		CannabisApplicationPaymentConfirmationLocalService
			cannabisApplicationPaymentConfirmationLocalService) {

		_cannabisApplicationPaymentConfirmationLocalService =
			cannabisApplicationPaymentConfirmationLocalService;
	}

	private CannabisApplicationPaymentConfirmationLocalService
		_cannabisApplicationPaymentConfirmationLocalService;

}