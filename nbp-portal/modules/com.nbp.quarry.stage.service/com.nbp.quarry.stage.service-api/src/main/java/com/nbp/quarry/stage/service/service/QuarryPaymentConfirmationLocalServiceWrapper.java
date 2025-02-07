/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link QuarryPaymentConfirmationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryPaymentConfirmationLocalService
 * @generated
 */
public class QuarryPaymentConfirmationLocalServiceWrapper
	implements QuarryPaymentConfirmationLocalService,
			   ServiceWrapper<QuarryPaymentConfirmationLocalService> {

	public QuarryPaymentConfirmationLocalServiceWrapper() {
		this(null);
	}

	public QuarryPaymentConfirmationLocalServiceWrapper(
		QuarryPaymentConfirmationLocalService
			quarryPaymentConfirmationLocalService) {

		_quarryPaymentConfirmationLocalService =
			quarryPaymentConfirmationLocalService;
	}

	/**
	 * Adds the quarry payment confirmation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryPaymentConfirmation the quarry payment confirmation
	 * @return the quarry payment confirmation that was added
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QuarryPaymentConfirmation
		addQuarryPaymentConfirmation(
			com.nbp.quarry.stage.service.model.QuarryPaymentConfirmation
				quarryPaymentConfirmation) {

		return _quarryPaymentConfirmationLocalService.
			addQuarryPaymentConfirmation(quarryPaymentConfirmation);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryPaymentConfirmationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new quarry payment confirmation with the primary key. Does not add the quarry payment confirmation to the database.
	 *
	 * @param quarryPaymentConfirmationId the primary key for the new quarry payment confirmation
	 * @return the new quarry payment confirmation
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QuarryPaymentConfirmation
		createQuarryPaymentConfirmation(long quarryPaymentConfirmationId) {

		return _quarryPaymentConfirmationLocalService.
			createQuarryPaymentConfirmation(quarryPaymentConfirmationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryPaymentConfirmationLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the quarry payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryPaymentConfirmationId the primary key of the quarry payment confirmation
	 * @return the quarry payment confirmation that was removed
	 * @throws PortalException if a quarry payment confirmation with the primary key could not be found
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QuarryPaymentConfirmation
			deleteQuarryPaymentConfirmation(long quarryPaymentConfirmationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryPaymentConfirmationLocalService.
			deleteQuarryPaymentConfirmation(quarryPaymentConfirmationId);
	}

	/**
	 * Deletes the quarry payment confirmation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryPaymentConfirmation the quarry payment confirmation
	 * @return the quarry payment confirmation that was removed
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QuarryPaymentConfirmation
		deleteQuarryPaymentConfirmation(
			com.nbp.quarry.stage.service.model.QuarryPaymentConfirmation
				quarryPaymentConfirmation) {

		return _quarryPaymentConfirmationLocalService.
			deleteQuarryPaymentConfirmation(quarryPaymentConfirmation);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _quarryPaymentConfirmationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _quarryPaymentConfirmationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _quarryPaymentConfirmationLocalService.dynamicQuery();
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

		return _quarryPaymentConfirmationLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryPaymentConfirmationModelImpl</code>.
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

		return _quarryPaymentConfirmationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryPaymentConfirmationModelImpl</code>.
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

		return _quarryPaymentConfirmationLocalService.dynamicQuery(
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

		return _quarryPaymentConfirmationLocalService.dynamicQueryCount(
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

		return _quarryPaymentConfirmationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.quarry.stage.service.model.QuarryPaymentConfirmation
		fetchQuarryPaymentConfirmation(long quarryPaymentConfirmationId) {

		return _quarryPaymentConfirmationLocalService.
			fetchQuarryPaymentConfirmation(quarryPaymentConfirmationId);
	}

	@Override
	public java.util.List
		<com.nbp.quarry.stage.service.model.QuarryPaymentConfirmation>
			findBygetQuarryPayConfBy_CI(String caseId) {

		return _quarryPaymentConfirmationLocalService.
			findBygetQuarryPayConfBy_CI(caseId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _quarryPaymentConfirmationLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _quarryPaymentConfirmationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _quarryPaymentConfirmationLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryPaymentConfirmationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public com.nbp.quarry.stage.service.model.QuarryPaymentConfirmation
			getQuarryPaymentConfBy_CI(String caseId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryPaymentConfirmationException {

		return _quarryPaymentConfirmationLocalService.getQuarryPaymentConfBy_CI(
			caseId);
	}

	/**
	 * Returns the quarry payment confirmation with the primary key.
	 *
	 * @param quarryPaymentConfirmationId the primary key of the quarry payment confirmation
	 * @return the quarry payment confirmation
	 * @throws PortalException if a quarry payment confirmation with the primary key could not be found
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QuarryPaymentConfirmation
			getQuarryPaymentConfirmation(long quarryPaymentConfirmationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryPaymentConfirmationLocalService.
			getQuarryPaymentConfirmation(quarryPaymentConfirmationId);
	}

	/**
	 * Returns a range of all the quarry payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry payment confirmations
	 * @param end the upper bound of the range of quarry payment confirmations (not inclusive)
	 * @return the range of quarry payment confirmations
	 */
	@Override
	public java.util.List
		<com.nbp.quarry.stage.service.model.QuarryPaymentConfirmation>
			getQuarryPaymentConfirmations(int start, int end) {

		return _quarryPaymentConfirmationLocalService.
			getQuarryPaymentConfirmations(start, end);
	}

	/**
	 * Returns the number of quarry payment confirmations.
	 *
	 * @return the number of quarry payment confirmations
	 */
	@Override
	public int getQuarryPaymentConfirmationsCount() {
		return _quarryPaymentConfirmationLocalService.
			getQuarryPaymentConfirmationsCount();
	}

	/**
	 * Updates the quarry payment confirmation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryPaymentConfirmation the quarry payment confirmation
	 * @return the quarry payment confirmation that was updated
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QuarryPaymentConfirmation
		updateQuarryPaymentConfirmation(
			com.nbp.quarry.stage.service.model.QuarryPaymentConfirmation
				quarryPaymentConfirmation) {

		return _quarryPaymentConfirmationLocalService.
			updateQuarryPaymentConfirmation(quarryPaymentConfirmation);
	}

	@Override
	public com.nbp.quarry.stage.service.model.QuarryPaymentConfirmation
		updateQuarryPaymentConfirmation(
			String caseId, java.util.Date dateReceived, String amountDue,
			String amountReceived, String receiptNumber, String comment,
			String amountOutstanding, java.util.Date dueDate, String status) {

		return _quarryPaymentConfirmationLocalService.
			updateQuarryPaymentConfirmation(
				caseId, dateReceived, amountDue, amountReceived, receiptNumber,
				comment, amountOutstanding, dueDate, status);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _quarryPaymentConfirmationLocalService.getBasePersistence();
	}

	@Override
	public QuarryPaymentConfirmationLocalService getWrappedService() {
		return _quarryPaymentConfirmationLocalService;
	}

	@Override
	public void setWrappedService(
		QuarryPaymentConfirmationLocalService
			quarryPaymentConfirmationLocalService) {

		_quarryPaymentConfirmationLocalService =
			quarryPaymentConfirmationLocalService;
	}

	private QuarryPaymentConfirmationLocalService
		_quarryPaymentConfirmationLocalService;

}