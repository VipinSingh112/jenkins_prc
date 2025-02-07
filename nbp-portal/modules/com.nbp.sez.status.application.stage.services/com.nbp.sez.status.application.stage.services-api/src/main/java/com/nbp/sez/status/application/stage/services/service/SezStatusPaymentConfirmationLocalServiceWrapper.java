/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezStatusPaymentConfirmationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusPaymentConfirmationLocalService
 * @generated
 */
public class SezStatusPaymentConfirmationLocalServiceWrapper
	implements ServiceWrapper<SezStatusPaymentConfirmationLocalService>,
			   SezStatusPaymentConfirmationLocalService {

	public SezStatusPaymentConfirmationLocalServiceWrapper() {
		this(null);
	}

	public SezStatusPaymentConfirmationLocalServiceWrapper(
		SezStatusPaymentConfirmationLocalService
			sezStatusPaymentConfirmationLocalService) {

		_sezStatusPaymentConfirmationLocalService =
			sezStatusPaymentConfirmationLocalService;
	}

	/**
	 * Adds the sez status payment confirmation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusPaymentConfirmation the sez status payment confirmation
	 * @return the sez status payment confirmation that was added
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusPaymentConfirmation addSezStatusPaymentConfirmation(
			com.nbp.sez.status.application.stage.services.model.
				SezStatusPaymentConfirmation sezStatusPaymentConfirmation) {

		return _sezStatusPaymentConfirmationLocalService.
			addSezStatusPaymentConfirmation(sezStatusPaymentConfirmation);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusPaymentConfirmationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez status payment confirmation with the primary key. Does not add the sez status payment confirmation to the database.
	 *
	 * @param sezPaymentId the primary key for the new sez status payment confirmation
	 * @return the new sez status payment confirmation
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusPaymentConfirmation createSezStatusPaymentConfirmation(
			long sezPaymentId) {

		return _sezStatusPaymentConfirmationLocalService.
			createSezStatusPaymentConfirmation(sezPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusPaymentConfirmationLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez status payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezPaymentId the primary key of the sez status payment confirmation
	 * @return the sez status payment confirmation that was removed
	 * @throws PortalException if a sez status payment confirmation with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusPaymentConfirmation deleteSezStatusPaymentConfirmation(
				long sezPaymentId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusPaymentConfirmationLocalService.
			deleteSezStatusPaymentConfirmation(sezPaymentId);
	}

	/**
	 * Deletes the sez status payment confirmation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusPaymentConfirmation the sez status payment confirmation
	 * @return the sez status payment confirmation that was removed
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusPaymentConfirmation deleteSezStatusPaymentConfirmation(
			com.nbp.sez.status.application.stage.services.model.
				SezStatusPaymentConfirmation sezStatusPaymentConfirmation) {

		return _sezStatusPaymentConfirmationLocalService.
			deleteSezStatusPaymentConfirmation(sezStatusPaymentConfirmation);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezStatusPaymentConfirmationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezStatusPaymentConfirmationLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezStatusPaymentConfirmationLocalService.dynamicQuery();
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

		return _sezStatusPaymentConfirmationLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusPaymentConfirmationModelImpl</code>.
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

		return _sezStatusPaymentConfirmationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusPaymentConfirmationModelImpl</code>.
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

		return _sezStatusPaymentConfirmationLocalService.dynamicQuery(
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

		return _sezStatusPaymentConfirmationLocalService.dynamicQueryCount(
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

		return _sezStatusPaymentConfirmationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusPaymentConfirmation fetchSezStatusPaymentConfirmation(
			long sezPaymentId) {

		return _sezStatusPaymentConfirmationLocalService.
			fetchSezStatusPaymentConfirmation(sezPaymentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezStatusPaymentConfirmationLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezStatusPaymentConfirmationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezStatusPaymentConfirmationLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusPaymentConfirmationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the sez status payment confirmation with the primary key.
	 *
	 * @param sezPaymentId the primary key of the sez status payment confirmation
	 * @return the sez status payment confirmation
	 * @throws PortalException if a sez status payment confirmation with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusPaymentConfirmation getSezStatusPaymentConfirmation(
				long sezPaymentId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusPaymentConfirmationLocalService.
			getSezStatusPaymentConfirmation(sezPaymentId);
	}

	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusPaymentConfirmation getSezStatusPaymentConfirmationBy_CI(
				String caseId)
			throws com.nbp.sez.status.application.stage.services.exception.
				NoSuchSezStatusPaymentConfirmationException {

		return _sezStatusPaymentConfirmationLocalService.
			getSezStatusPaymentConfirmationBy_CI(caseId);
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.stage.services.model.
			SezStatusPaymentConfirmation>
				getSezStatusPaymentConfirmationListBy_CI(String caseId) {

		return _sezStatusPaymentConfirmationLocalService.
			getSezStatusPaymentConfirmationListBy_CI(caseId);
	}

	/**
	 * Returns a range of all the sez status payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status payment confirmations
	 * @param end the upper bound of the range of sez status payment confirmations (not inclusive)
	 * @return the range of sez status payment confirmations
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.stage.services.model.
			SezStatusPaymentConfirmation> getSezStatusPaymentConfirmations(
				int start, int end) {

		return _sezStatusPaymentConfirmationLocalService.
			getSezStatusPaymentConfirmations(start, end);
	}

	/**
	 * Returns the number of sez status payment confirmations.
	 *
	 * @return the number of sez status payment confirmations
	 */
	@Override
	public int getSezStatusPaymentConfirmationsCount() {
		return _sezStatusPaymentConfirmationLocalService.
			getSezStatusPaymentConfirmationsCount();
	}

	/**
	 * Updates the sez status payment confirmation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusPaymentConfirmation the sez status payment confirmation
	 * @return the sez status payment confirmation that was updated
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusPaymentConfirmation updateSezStatusPaymentConfirmation(
			com.nbp.sez.status.application.stage.services.model.
				SezStatusPaymentConfirmation sezStatusPaymentConfirmation) {

		return _sezStatusPaymentConfirmationLocalService.
			updateSezStatusPaymentConfirmation(sezStatusPaymentConfirmation);
	}

	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusPaymentConfirmation updateSezStatusPaymentConfirmation(
			String caseId, java.util.Date dateReceived, String amountDue,
			String amountreceived, String receiptNumber, String comments,
			String amountOutstanding, java.util.Date dueDate, String status) {

		return _sezStatusPaymentConfirmationLocalService.
			updateSezStatusPaymentConfirmation(
				caseId, dateReceived, amountDue, amountreceived, receiptNumber,
				comments, amountOutstanding, dueDate, status);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezStatusPaymentConfirmationLocalService.getBasePersistence();
	}

	@Override
	public SezStatusPaymentConfirmationLocalService getWrappedService() {
		return _sezStatusPaymentConfirmationLocalService;
	}

	@Override
	public void setWrappedService(
		SezStatusPaymentConfirmationLocalService
			sezStatusPaymentConfirmationLocalService) {

		_sezStatusPaymentConfirmationLocalService =
			sezStatusPaymentConfirmationLocalService;
	}

	private SezStatusPaymentConfirmationLocalService
		_sezStatusPaymentConfirmationLocalService;

}