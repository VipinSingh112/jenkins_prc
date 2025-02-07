/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiInsolvencyPaymentConfirmationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyPaymentConfirmationLocalService
 * @generated
 */
public class OsiInsolvencyPaymentConfirmationLocalServiceWrapper
	implements OsiInsolvencyPaymentConfirmationLocalService,
			   ServiceWrapper<OsiInsolvencyPaymentConfirmationLocalService> {

	public OsiInsolvencyPaymentConfirmationLocalServiceWrapper() {
		this(null);
	}

	public OsiInsolvencyPaymentConfirmationLocalServiceWrapper(
		OsiInsolvencyPaymentConfirmationLocalService
			osiInsolvencyPaymentConfirmationLocalService) {

		_osiInsolvencyPaymentConfirmationLocalService =
			osiInsolvencyPaymentConfirmationLocalService;
	}

	/**
	 * Adds the osi insolvency payment confirmation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyPaymentConfirmation the osi insolvency payment confirmation
	 * @return the osi insolvency payment confirmation that was added
	 */
	@Override
	public
		com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyPaymentConfirmation
				addOsiInsolvencyPaymentConfirmation(
					com.nbp.osi.insolvency.stage.services.model.
						OsiInsolvencyPaymentConfirmation
							osiInsolvencyPaymentConfirmation) {

		return _osiInsolvencyPaymentConfirmationLocalService.
			addOsiInsolvencyPaymentConfirmation(
				osiInsolvencyPaymentConfirmation);
	}

	/**
	 * Creates a new osi insolvency payment confirmation with the primary key. Does not add the osi insolvency payment confirmation to the database.
	 *
	 * @param osiIRPaymentId the primary key for the new osi insolvency payment confirmation
	 * @return the new osi insolvency payment confirmation
	 */
	@Override
	public
		com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyPaymentConfirmation
				createOsiInsolvencyPaymentConfirmation(long osiIRPaymentId) {

		return _osiInsolvencyPaymentConfirmationLocalService.
			createOsiInsolvencyPaymentConfirmation(osiIRPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolvencyPaymentConfirmationLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the osi insolvency payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiIRPaymentId the primary key of the osi insolvency payment confirmation
	 * @return the osi insolvency payment confirmation that was removed
	 * @throws PortalException if a osi insolvency payment confirmation with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyPaymentConfirmation
					deleteOsiInsolvencyPaymentConfirmation(long osiIRPaymentId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolvencyPaymentConfirmationLocalService.
			deleteOsiInsolvencyPaymentConfirmation(osiIRPaymentId);
	}

	/**
	 * Deletes the osi insolvency payment confirmation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyPaymentConfirmation the osi insolvency payment confirmation
	 * @return the osi insolvency payment confirmation that was removed
	 */
	@Override
	public
		com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyPaymentConfirmation
				deleteOsiInsolvencyPaymentConfirmation(
					com.nbp.osi.insolvency.stage.services.model.
						OsiInsolvencyPaymentConfirmation
							osiInsolvencyPaymentConfirmation) {

		return _osiInsolvencyPaymentConfirmationLocalService.
			deleteOsiInsolvencyPaymentConfirmation(
				osiInsolvencyPaymentConfirmation);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolvencyPaymentConfirmationLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiInsolvencyPaymentConfirmationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiInsolvencyPaymentConfirmationLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiInsolvencyPaymentConfirmationLocalService.dynamicQuery();
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

		return _osiInsolvencyPaymentConfirmationLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolvencyPaymentConfirmationModelImpl</code>.
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

		return _osiInsolvencyPaymentConfirmationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolvencyPaymentConfirmationModelImpl</code>.
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

		return _osiInsolvencyPaymentConfirmationLocalService.dynamicQuery(
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

		return _osiInsolvencyPaymentConfirmationLocalService.dynamicQueryCount(
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

		return _osiInsolvencyPaymentConfirmationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyPaymentConfirmation
				fetchOsiInsolvencyPaymentConfirmation(long osiIRPaymentId) {

		return _osiInsolvencyPaymentConfirmationLocalService.
			fetchOsiInsolvencyPaymentConfirmation(osiIRPaymentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiInsolvencyPaymentConfirmationLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiInsolvencyPaymentConfirmationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiInsolvencyPaymentConfirmationLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * Returns the osi insolvency payment confirmation with the primary key.
	 *
	 * @param osiIRPaymentId the primary key of the osi insolvency payment confirmation
	 * @return the osi insolvency payment confirmation
	 * @throws PortalException if a osi insolvency payment confirmation with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyPaymentConfirmation
					getOsiInsolvencyPaymentConfirmation(long osiIRPaymentId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolvencyPaymentConfirmationLocalService.
			getOsiInsolvencyPaymentConfirmation(osiIRPaymentId);
	}

	/**
	 * Returns a range of all the osi insolvency payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolvencyPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency payment confirmations
	 * @param end the upper bound of the range of osi insolvency payment confirmations (not inclusive)
	 * @return the range of osi insolvency payment confirmations
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyPaymentConfirmation>
				getOsiInsolvencyPaymentConfirmations(int start, int end) {

		return _osiInsolvencyPaymentConfirmationLocalService.
			getOsiInsolvencyPaymentConfirmations(start, end);
	}

	/**
	 * Returns the number of osi insolvency payment confirmations.
	 *
	 * @return the number of osi insolvency payment confirmations
	 */
	@Override
	public int getOsiInsolvencyPaymentConfirmationsCount() {
		return _osiInsolvencyPaymentConfirmationLocalService.
			getOsiInsolvencyPaymentConfirmationsCount();
	}

	@Override
	public
		com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyPaymentConfirmation getPaymentConfirmationBy_CI(
					String caseId)
				throws com.nbp.osi.insolvency.stage.services.exception.
					NoSuchOsiInsolvencyPaymentConfirmationException {

		return _osiInsolvencyPaymentConfirmationLocalService.
			getPaymentConfirmationBy_CI(caseId);
	}

	@Override
	public java.util.List
		<com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyPaymentConfirmation> getPaymentConfirmations_By_CI(
				String caseId) {

		return _osiInsolvencyPaymentConfirmationLocalService.
			getPaymentConfirmations_By_CI(caseId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolvencyPaymentConfirmationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public
		com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyPaymentConfirmation updateFilmPaymentConfirmation(
				String caseId, java.util.Date dateReceived, String amountDue,
				String amountReceived, String receiptNumber, String comment,
				String amountOutstanding, java.util.Date dueDate,
				String status) {

		return _osiInsolvencyPaymentConfirmationLocalService.
			updateFilmPaymentConfirmation(
				caseId, dateReceived, amountDue, amountReceived, receiptNumber,
				comment, amountOutstanding, dueDate, status);
	}

	/**
	 * Updates the osi insolvency payment confirmation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyPaymentConfirmation the osi insolvency payment confirmation
	 * @return the osi insolvency payment confirmation that was updated
	 */
	@Override
	public
		com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyPaymentConfirmation
				updateOsiInsolvencyPaymentConfirmation(
					com.nbp.osi.insolvency.stage.services.model.
						OsiInsolvencyPaymentConfirmation
							osiInsolvencyPaymentConfirmation) {

		return _osiInsolvencyPaymentConfirmationLocalService.
			updateOsiInsolvencyPaymentConfirmation(
				osiInsolvencyPaymentConfirmation);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiInsolvencyPaymentConfirmationLocalService.
			getBasePersistence();
	}

	@Override
	public OsiInsolvencyPaymentConfirmationLocalService getWrappedService() {
		return _osiInsolvencyPaymentConfirmationLocalService;
	}

	@Override
	public void setWrappedService(
		OsiInsolvencyPaymentConfirmationLocalService
			osiInsolvencyPaymentConfirmationLocalService) {

		_osiInsolvencyPaymentConfirmationLocalService =
			osiInsolvencyPaymentConfirmationLocalService;
	}

	private OsiInsolvencyPaymentConfirmationLocalService
		_osiInsolvencyPaymentConfirmationLocalService;

}