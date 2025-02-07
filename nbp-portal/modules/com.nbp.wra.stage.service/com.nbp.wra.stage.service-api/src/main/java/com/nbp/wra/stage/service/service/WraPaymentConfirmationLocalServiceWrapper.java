/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link WraPaymentConfirmationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see WraPaymentConfirmationLocalService
 * @generated
 */
public class WraPaymentConfirmationLocalServiceWrapper
	implements ServiceWrapper<WraPaymentConfirmationLocalService>,
			   WraPaymentConfirmationLocalService {

	public WraPaymentConfirmationLocalServiceWrapper() {
		this(null);
	}

	public WraPaymentConfirmationLocalServiceWrapper(
		WraPaymentConfirmationLocalService wraPaymentConfirmationLocalService) {

		_wraPaymentConfirmationLocalService =
			wraPaymentConfirmationLocalService;
	}

	/**
	 * Adds the wra payment confirmation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraPaymentConfirmation the wra payment confirmation
	 * @return the wra payment confirmation that was added
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraPaymentConfirmation
		addWraPaymentConfirmation(
			com.nbp.wra.stage.service.model.WraPaymentConfirmation
				wraPaymentConfirmation) {

		return _wraPaymentConfirmationLocalService.addWraPaymentConfirmation(
			wraPaymentConfirmation);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraPaymentConfirmationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new wra payment confirmation with the primary key. Does not add the wra payment confirmation to the database.
	 *
	 * @param wraPaymentConfirmationId the primary key for the new wra payment confirmation
	 * @return the new wra payment confirmation
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraPaymentConfirmation
		createWraPaymentConfirmation(long wraPaymentConfirmationId) {

		return _wraPaymentConfirmationLocalService.createWraPaymentConfirmation(
			wraPaymentConfirmationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraPaymentConfirmationLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the wra payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraPaymentConfirmationId the primary key of the wra payment confirmation
	 * @return the wra payment confirmation that was removed
	 * @throws PortalException if a wra payment confirmation with the primary key could not be found
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraPaymentConfirmation
			deleteWraPaymentConfirmation(long wraPaymentConfirmationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraPaymentConfirmationLocalService.deleteWraPaymentConfirmation(
			wraPaymentConfirmationId);
	}

	/**
	 * Deletes the wra payment confirmation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraPaymentConfirmation the wra payment confirmation
	 * @return the wra payment confirmation that was removed
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraPaymentConfirmation
		deleteWraPaymentConfirmation(
			com.nbp.wra.stage.service.model.WraPaymentConfirmation
				wraPaymentConfirmation) {

		return _wraPaymentConfirmationLocalService.deleteWraPaymentConfirmation(
			wraPaymentConfirmation);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _wraPaymentConfirmationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _wraPaymentConfirmationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _wraPaymentConfirmationLocalService.dynamicQuery();
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

		return _wraPaymentConfirmationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.stage.service.model.impl.WraPaymentConfirmationModelImpl</code>.
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

		return _wraPaymentConfirmationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.stage.service.model.impl.WraPaymentConfirmationModelImpl</code>.
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

		return _wraPaymentConfirmationLocalService.dynamicQuery(
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

		return _wraPaymentConfirmationLocalService.dynamicQueryCount(
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

		return _wraPaymentConfirmationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.wra.stage.service.model.WraPaymentConfirmation
		fetchWraPaymentConfirmation(long wraPaymentConfirmationId) {

		return _wraPaymentConfirmationLocalService.fetchWraPaymentConfirmation(
			wraPaymentConfirmationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _wraPaymentConfirmationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _wraPaymentConfirmationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _wraPaymentConfirmationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraPaymentConfirmationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.wra.stage.service.model.WraPaymentConfirmation>
			getWraPayConfBy_CI(String caseId) {

		return _wraPaymentConfirmationLocalService.getWraPayConfBy_CI(caseId);
	}

	@Override
	public com.nbp.wra.stage.service.model.WraPaymentConfirmation
			getWraPaymentConfBy_CI(String caseId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraPaymentConfirmationException {

		return _wraPaymentConfirmationLocalService.getWraPaymentConfBy_CI(
			caseId);
	}

	/**
	 * Returns the wra payment confirmation with the primary key.
	 *
	 * @param wraPaymentConfirmationId the primary key of the wra payment confirmation
	 * @return the wra payment confirmation
	 * @throws PortalException if a wra payment confirmation with the primary key could not be found
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraPaymentConfirmation
			getWraPaymentConfirmation(long wraPaymentConfirmationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraPaymentConfirmationLocalService.getWraPaymentConfirmation(
			wraPaymentConfirmationId);
	}

	/**
	 * Returns a range of all the wra payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.stage.service.model.impl.WraPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra payment confirmations
	 * @param end the upper bound of the range of wra payment confirmations (not inclusive)
	 * @return the range of wra payment confirmations
	 */
	@Override
	public java.util.List
		<com.nbp.wra.stage.service.model.WraPaymentConfirmation>
			getWraPaymentConfirmations(int start, int end) {

		return _wraPaymentConfirmationLocalService.getWraPaymentConfirmations(
			start, end);
	}

	/**
	 * Returns the number of wra payment confirmations.
	 *
	 * @return the number of wra payment confirmations
	 */
	@Override
	public int getWraPaymentConfirmationsCount() {
		return _wraPaymentConfirmationLocalService.
			getWraPaymentConfirmationsCount();
	}

	@Override
	public com.nbp.wra.stage.service.model.WraPaymentConfirmation
		updateWraPaymentConfirmation(
			String caseId, java.util.Date dateReceived, String amountDue,
			String amountReceived, String receiptNumber, String comment,
			String amountOutstanding, java.util.Date dueDate, String status) {

		return _wraPaymentConfirmationLocalService.updateWraPaymentConfirmation(
			caseId, dateReceived, amountDue, amountReceived, receiptNumber,
			comment, amountOutstanding, dueDate, status);
	}

	/**
	 * Updates the wra payment confirmation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraPaymentConfirmation the wra payment confirmation
	 * @return the wra payment confirmation that was updated
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraPaymentConfirmation
		updateWraPaymentConfirmation(
			com.nbp.wra.stage.service.model.WraPaymentConfirmation
				wraPaymentConfirmation) {

		return _wraPaymentConfirmationLocalService.updateWraPaymentConfirmation(
			wraPaymentConfirmation);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _wraPaymentConfirmationLocalService.getBasePersistence();
	}

	@Override
	public WraPaymentConfirmationLocalService getWrappedService() {
		return _wraPaymentConfirmationLocalService;
	}

	@Override
	public void setWrappedService(
		WraPaymentConfirmationLocalService wraPaymentConfirmationLocalService) {

		_wraPaymentConfirmationLocalService =
			wraPaymentConfirmationLocalService;
	}

	private WraPaymentConfirmationLocalService
		_wraPaymentConfirmationLocalService;

}