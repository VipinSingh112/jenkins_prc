/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FactoryPaymentVerificationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FactoryPaymentVerificationLocalService
 * @generated
 */
public class FactoryPaymentVerificationLocalServiceWrapper
	implements FactoryPaymentVerificationLocalService,
			   ServiceWrapper<FactoryPaymentVerificationLocalService> {

	public FactoryPaymentVerificationLocalServiceWrapper() {
		this(null);
	}

	public FactoryPaymentVerificationLocalServiceWrapper(
		FactoryPaymentVerificationLocalService
			factoryPaymentVerificationLocalService) {

		_factoryPaymentVerificationLocalService =
			factoryPaymentVerificationLocalService;
	}

	/**
	 * Adds the factory payment verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoryPaymentVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoryPaymentVerification the factory payment verification
	 * @return the factory payment verification that was added
	 */
	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoryPaymentVerification addFactoryPaymentVerification(
			com.nbp.factories.registration.stage.services.model.
				FactoryPaymentVerification factoryPaymentVerification) {

		return _factoryPaymentVerificationLocalService.
			addFactoryPaymentVerification(factoryPaymentVerification);
	}

	/**
	 * Creates a new factory payment verification with the primary key. Does not add the factory payment verification to the database.
	 *
	 * @param factoryPaymentVerificationId the primary key for the new factory payment verification
	 * @return the new factory payment verification
	 */
	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoryPaymentVerification createFactoryPaymentVerification(
			long factoryPaymentVerificationId) {

		return _factoryPaymentVerificationLocalService.
			createFactoryPaymentVerification(factoryPaymentVerificationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _factoryPaymentVerificationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the factory payment verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoryPaymentVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoryPaymentVerification the factory payment verification
	 * @return the factory payment verification that was removed
	 */
	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoryPaymentVerification deleteFactoryPaymentVerification(
			com.nbp.factories.registration.stage.services.model.
				FactoryPaymentVerification factoryPaymentVerification) {

		return _factoryPaymentVerificationLocalService.
			deleteFactoryPaymentVerification(factoryPaymentVerification);
	}

	/**
	 * Deletes the factory payment verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoryPaymentVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoryPaymentVerificationId the primary key of the factory payment verification
	 * @return the factory payment verification that was removed
	 * @throws PortalException if a factory payment verification with the primary key could not be found
	 */
	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoryPaymentVerification deleteFactoryPaymentVerification(
				long factoryPaymentVerificationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _factoryPaymentVerificationLocalService.
			deleteFactoryPaymentVerification(factoryPaymentVerificationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _factoryPaymentVerificationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _factoryPaymentVerificationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _factoryPaymentVerificationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _factoryPaymentVerificationLocalService.dynamicQuery();
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

		return _factoryPaymentVerificationLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.stage.services.model.impl.FactoryPaymentVerificationModelImpl</code>.
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

		return _factoryPaymentVerificationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.stage.services.model.impl.FactoryPaymentVerificationModelImpl</code>.
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

		return _factoryPaymentVerificationLocalService.dynamicQuery(
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

		return _factoryPaymentVerificationLocalService.dynamicQueryCount(
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

		return _factoryPaymentVerificationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoryPaymentVerification fetchFactoryPaymentVerification(
			long factoryPaymentVerificationId) {

		return _factoryPaymentVerificationLocalService.
			fetchFactoryPaymentVerification(factoryPaymentVerificationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _factoryPaymentVerificationLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.factories.registration.stage.services.model.
			FactoryPaymentVerification> getFactoryPayConfBy_CI(String caseId) {

		return _factoryPaymentVerificationLocalService.getFactoryPayConfBy_CI(
			caseId);
	}

	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoryPaymentVerification getFactoryPaymentConfBy_CI(String caseId)
			throws com.nbp.factories.registration.stage.services.exception.
				NoSuchFactoryPaymentVerificationException {

		return _factoryPaymentVerificationLocalService.
			getFactoryPaymentConfBy_CI(caseId);
	}

	/**
	 * Returns the factory payment verification with the primary key.
	 *
	 * @param factoryPaymentVerificationId the primary key of the factory payment verification
	 * @return the factory payment verification
	 * @throws PortalException if a factory payment verification with the primary key could not be found
	 */
	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoryPaymentVerification getFactoryPaymentVerification(
				long factoryPaymentVerificationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _factoryPaymentVerificationLocalService.
			getFactoryPaymentVerification(factoryPaymentVerificationId);
	}

	/**
	 * Returns a range of all the factory payment verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.stage.services.model.impl.FactoryPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factory payment verifications
	 * @param end the upper bound of the range of factory payment verifications (not inclusive)
	 * @return the range of factory payment verifications
	 */
	@Override
	public java.util.List
		<com.nbp.factories.registration.stage.services.model.
			FactoryPaymentVerification> getFactoryPaymentVerifications(
				int start, int end) {

		return _factoryPaymentVerificationLocalService.
			getFactoryPaymentVerifications(start, end);
	}

	/**
	 * Returns the number of factory payment verifications.
	 *
	 * @return the number of factory payment verifications
	 */
	@Override
	public int getFactoryPaymentVerificationsCount() {
		return _factoryPaymentVerificationLocalService.
			getFactoryPaymentVerificationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _factoryPaymentVerificationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _factoryPaymentVerificationLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _factoryPaymentVerificationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the factory payment verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoryPaymentVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoryPaymentVerification the factory payment verification
	 * @return the factory payment verification that was updated
	 */
	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoryPaymentVerification updateFactoryPaymentVerification(
			com.nbp.factories.registration.stage.services.model.
				FactoryPaymentVerification factoryPaymentVerification) {

		return _factoryPaymentVerificationLocalService.
			updateFactoryPaymentVerification(factoryPaymentVerification);
	}

	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoryPaymentVerification updateFactoryPaymentVerification(
			String caseId, java.util.Date dateReceived, String amountDue,
			String amountReceived, String receiptNumber, String comment,
			String amountOutstanding, java.util.Date dueDate, String status) {

		return _factoryPaymentVerificationLocalService.
			updateFactoryPaymentVerification(
				caseId, dateReceived, amountDue, amountReceived, receiptNumber,
				comment, amountOutstanding, dueDate, status);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _factoryPaymentVerificationLocalService.getBasePersistence();
	}

	@Override
	public FactoryPaymentVerificationLocalService getWrappedService() {
		return _factoryPaymentVerificationLocalService;
	}

	@Override
	public void setWrappedService(
		FactoryPaymentVerificationLocalService
			factoryPaymentVerificationLocalService) {

		_factoryPaymentVerificationLocalService =
			factoryPaymentVerificationLocalService;
	}

	private FactoryPaymentVerificationLocalService
		_factoryPaymentVerificationLocalService;

}