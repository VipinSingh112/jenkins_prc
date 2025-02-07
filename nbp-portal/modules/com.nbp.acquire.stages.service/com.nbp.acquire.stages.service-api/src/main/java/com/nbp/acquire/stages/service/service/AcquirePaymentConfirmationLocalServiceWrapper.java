/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AcquirePaymentConfirmationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquirePaymentConfirmationLocalService
 * @generated
 */
public class AcquirePaymentConfirmationLocalServiceWrapper
	implements AcquirePaymentConfirmationLocalService,
			   ServiceWrapper<AcquirePaymentConfirmationLocalService> {

	public AcquirePaymentConfirmationLocalServiceWrapper() {
		this(null);
	}

	public AcquirePaymentConfirmationLocalServiceWrapper(
		AcquirePaymentConfirmationLocalService
			acquirePaymentConfirmationLocalService) {

		_acquirePaymentConfirmationLocalService =
			acquirePaymentConfirmationLocalService;
	}

	/**
	 * Adds the acquire payment confirmation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquirePaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquirePaymentConfirmation the acquire payment confirmation
	 * @return the acquire payment confirmation that was added
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquirePaymentConfirmation
		addAcquirePaymentConfirmation(
			com.nbp.acquire.stages.service.model.AcquirePaymentConfirmation
				acquirePaymentConfirmation) {

		return _acquirePaymentConfirmationLocalService.
			addAcquirePaymentConfirmation(acquirePaymentConfirmation);
	}

	/**
	 * Creates a new acquire payment confirmation with the primary key. Does not add the acquire payment confirmation to the database.
	 *
	 * @param acquirePaymentId the primary key for the new acquire payment confirmation
	 * @return the new acquire payment confirmation
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquirePaymentConfirmation
		createAcquirePaymentConfirmation(long acquirePaymentId) {

		return _acquirePaymentConfirmationLocalService.
			createAcquirePaymentConfirmation(acquirePaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquirePaymentConfirmationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acquire payment confirmation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquirePaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquirePaymentConfirmation the acquire payment confirmation
	 * @return the acquire payment confirmation that was removed
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquirePaymentConfirmation
		deleteAcquirePaymentConfirmation(
			com.nbp.acquire.stages.service.model.AcquirePaymentConfirmation
				acquirePaymentConfirmation) {

		return _acquirePaymentConfirmationLocalService.
			deleteAcquirePaymentConfirmation(acquirePaymentConfirmation);
	}

	/**
	 * Deletes the acquire payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquirePaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquirePaymentId the primary key of the acquire payment confirmation
	 * @return the acquire payment confirmation that was removed
	 * @throws PortalException if a acquire payment confirmation with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquirePaymentConfirmation
			deleteAcquirePaymentConfirmation(long acquirePaymentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquirePaymentConfirmationLocalService.
			deleteAcquirePaymentConfirmation(acquirePaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquirePaymentConfirmationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _acquirePaymentConfirmationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _acquirePaymentConfirmationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _acquirePaymentConfirmationLocalService.dynamicQuery();
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

		return _acquirePaymentConfirmationLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquirePaymentConfirmationModelImpl</code>.
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

		return _acquirePaymentConfirmationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquirePaymentConfirmationModelImpl</code>.
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

		return _acquirePaymentConfirmationLocalService.dynamicQuery(
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

		return _acquirePaymentConfirmationLocalService.dynamicQueryCount(
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

		return _acquirePaymentConfirmationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquirePaymentConfirmation
		fetchAcquirePaymentConfirmation(long acquirePaymentId) {

		return _acquirePaymentConfirmationLocalService.
			fetchAcquirePaymentConfirmation(acquirePaymentId);
	}

	/**
	 * Returns the acquire payment confirmation with the primary key.
	 *
	 * @param acquirePaymentId the primary key of the acquire payment confirmation
	 * @return the acquire payment confirmation
	 * @throws PortalException if a acquire payment confirmation with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquirePaymentConfirmation
			getAcquirePaymentConfirmation(long acquirePaymentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquirePaymentConfirmationLocalService.
			getAcquirePaymentConfirmation(acquirePaymentId);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquirePaymentConfirmation
		getAcquirePaymentConfirmationById(String caseId) {

		return _acquirePaymentConfirmationLocalService.
			getAcquirePaymentConfirmationById(caseId);
	}

	/**
	 * Returns a range of all the acquire payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquirePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire payment confirmations
	 * @param end the upper bound of the range of acquire payment confirmations (not inclusive)
	 * @return the range of acquire payment confirmations
	 */
	@Override
	public java.util.List
		<com.nbp.acquire.stages.service.model.AcquirePaymentConfirmation>
			getAcquirePaymentConfirmations(int start, int end) {

		return _acquirePaymentConfirmationLocalService.
			getAcquirePaymentConfirmations(start, end);
	}

	@Override
	public java.util.List
		<com.nbp.acquire.stages.service.model.AcquirePaymentConfirmation>
			getAcquirePaymentConfirmations_By_CI(String caseId) {

		return _acquirePaymentConfirmationLocalService.
			getAcquirePaymentConfirmations_By_CI(caseId);
	}

	/**
	 * Returns the number of acquire payment confirmations.
	 *
	 * @return the number of acquire payment confirmations
	 */
	@Override
	public int getAcquirePaymentConfirmationsCount() {
		return _acquirePaymentConfirmationLocalService.
			getAcquirePaymentConfirmationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _acquirePaymentConfirmationLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _acquirePaymentConfirmationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquirePaymentConfirmationLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquirePaymentConfirmationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acquire payment confirmation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquirePaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquirePaymentConfirmation the acquire payment confirmation
	 * @return the acquire payment confirmation that was updated
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquirePaymentConfirmation
		updateAcquirePaymentConfirmation(
			com.nbp.acquire.stages.service.model.AcquirePaymentConfirmation
				acquirePaymentConfirmation) {

		return _acquirePaymentConfirmationLocalService.
			updateAcquirePaymentConfirmation(acquirePaymentConfirmation);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquirePaymentConfirmation
		updateAcquirePaymentConfirmation(
			String caseId, java.util.Date dateReceived, String amountDue,
			String amountReceived, String receiptNumber, String comment,
			String amountOutstanding, java.util.Date dueDate, String status) {

		return _acquirePaymentConfirmationLocalService.
			updateAcquirePaymentConfirmation(
				caseId, dateReceived, amountDue, amountReceived, receiptNumber,
				comment, amountOutstanding, dueDate, status);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _acquirePaymentConfirmationLocalService.getBasePersistence();
	}

	@Override
	public AcquirePaymentConfirmationLocalService getWrappedService() {
		return _acquirePaymentConfirmationLocalService;
	}

	@Override
	public void setWrappedService(
		AcquirePaymentConfirmationLocalService
			acquirePaymentConfirmationLocalService) {

		_acquirePaymentConfirmationLocalService =
			acquirePaymentConfirmationLocalService;
	}

	private AcquirePaymentConfirmationLocalService
		_acquirePaymentConfirmationLocalService;

}