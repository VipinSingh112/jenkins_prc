/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JanaacPaymentVerificationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JanaacPaymentVerificationLocalService
 * @generated
 */
public class JanaacPaymentVerificationLocalServiceWrapper
	implements JanaacPaymentVerificationLocalService,
			   ServiceWrapper<JanaacPaymentVerificationLocalService> {

	public JanaacPaymentVerificationLocalServiceWrapper() {
		this(null);
	}

	public JanaacPaymentVerificationLocalServiceWrapper(
		JanaacPaymentVerificationLocalService
			janaacPaymentVerificationLocalService) {

		_janaacPaymentVerificationLocalService =
			janaacPaymentVerificationLocalService;
	}

	/**
	 * Adds the janaac payment verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacPaymentVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacPaymentVerification the janaac payment verification
	 * @return the janaac payment verification that was added
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacPaymentVerification
		addJanaacPaymentVerification(
			com.nbp.janaac.stages.services.model.JanaacPaymentVerification
				janaacPaymentVerification) {

		return _janaacPaymentVerificationLocalService.
			addJanaacPaymentVerification(janaacPaymentVerification);
	}

	/**
	 * Creates a new janaac payment verification with the primary key. Does not add the janaac payment verification to the database.
	 *
	 * @param janaacPaymentVerificationId the primary key for the new janaac payment verification
	 * @return the new janaac payment verification
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacPaymentVerification
		createJanaacPaymentVerification(long janaacPaymentVerificationId) {

		return _janaacPaymentVerificationLocalService.
			createJanaacPaymentVerification(janaacPaymentVerificationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacPaymentVerificationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the janaac payment verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacPaymentVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacPaymentVerification the janaac payment verification
	 * @return the janaac payment verification that was removed
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacPaymentVerification
		deleteJanaacPaymentVerification(
			com.nbp.janaac.stages.services.model.JanaacPaymentVerification
				janaacPaymentVerification) {

		return _janaacPaymentVerificationLocalService.
			deleteJanaacPaymentVerification(janaacPaymentVerification);
	}

	/**
	 * Deletes the janaac payment verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacPaymentVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacPaymentVerificationId the primary key of the janaac payment verification
	 * @return the janaac payment verification that was removed
	 * @throws PortalException if a janaac payment verification with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacPaymentVerification
			deleteJanaacPaymentVerification(long janaacPaymentVerificationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacPaymentVerificationLocalService.
			deleteJanaacPaymentVerification(janaacPaymentVerificationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacPaymentVerificationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _janaacPaymentVerificationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _janaacPaymentVerificationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _janaacPaymentVerificationLocalService.dynamicQuery();
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

		return _janaacPaymentVerificationLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.stages.services.model.impl.JanaacPaymentVerificationModelImpl</code>.
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

		return _janaacPaymentVerificationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.stages.services.model.impl.JanaacPaymentVerificationModelImpl</code>.
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

		return _janaacPaymentVerificationLocalService.dynamicQuery(
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

		return _janaacPaymentVerificationLocalService.dynamicQueryCount(
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

		return _janaacPaymentVerificationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.stages.services.model.JanaacPaymentVerification
		fetchJanaacPaymentVerification(long janaacPaymentVerificationId) {

		return _janaacPaymentVerificationLocalService.
			fetchJanaacPaymentVerification(janaacPaymentVerificationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _janaacPaymentVerificationLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _janaacPaymentVerificationLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.stages.services.model.JanaacPaymentVerification>
			getJanaacPayConfBy_CI(String caseId) {

		return _janaacPaymentVerificationLocalService.getJanaacPayConfBy_CI(
			caseId);
	}

	@Override
	public com.nbp.janaac.stages.services.model.JanaacPaymentVerification
			getJanaacPaymentBy_CI(String caseId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacPaymentVerificationException {

		return _janaacPaymentVerificationLocalService.getJanaacPaymentBy_CI(
			caseId);
	}

	/**
	 * Returns the janaac payment verification with the primary key.
	 *
	 * @param janaacPaymentVerificationId the primary key of the janaac payment verification
	 * @return the janaac payment verification
	 * @throws PortalException if a janaac payment verification with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacPaymentVerification
			getJanaacPaymentVerification(long janaacPaymentVerificationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacPaymentVerificationLocalService.
			getJanaacPaymentVerification(janaacPaymentVerificationId);
	}

	/**
	 * Returns a range of all the janaac payment verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.stages.services.model.impl.JanaacPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac payment verifications
	 * @param end the upper bound of the range of janaac payment verifications (not inclusive)
	 * @return the range of janaac payment verifications
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.stages.services.model.JanaacPaymentVerification>
			getJanaacPaymentVerifications(int start, int end) {

		return _janaacPaymentVerificationLocalService.
			getJanaacPaymentVerifications(start, end);
	}

	/**
	 * Returns the number of janaac payment verifications.
	 *
	 * @return the number of janaac payment verifications
	 */
	@Override
	public int getJanaacPaymentVerificationsCount() {
		return _janaacPaymentVerificationLocalService.
			getJanaacPaymentVerificationsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _janaacPaymentVerificationLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacPaymentVerificationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the janaac payment verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacPaymentVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacPaymentVerification the janaac payment verification
	 * @return the janaac payment verification that was updated
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacPaymentVerification
		updateJanaacPaymentVerification(
			com.nbp.janaac.stages.services.model.JanaacPaymentVerification
				janaacPaymentVerification) {

		return _janaacPaymentVerificationLocalService.
			updateJanaacPaymentVerification(janaacPaymentVerification);
	}

	@Override
	public com.nbp.janaac.stages.services.model.JanaacPaymentVerification
		updateJanaacPaymentVerification(
			String caseId, java.util.Date dateReceived, String amountDue,
			String amountReceived, String receiptNumber, String comment,
			String amountOutstanding, java.util.Date dueDate, String status) {

		return _janaacPaymentVerificationLocalService.
			updateJanaacPaymentVerification(
				caseId, dateReceived, amountDue, amountReceived, receiptNumber,
				comment, amountOutstanding, dueDate, status);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _janaacPaymentVerificationLocalService.getBasePersistence();
	}

	@Override
	public JanaacPaymentVerificationLocalService getWrappedService() {
		return _janaacPaymentVerificationLocalService;
	}

	@Override
	public void setWrappedService(
		JanaacPaymentVerificationLocalService
			janaacPaymentVerificationLocalService) {

		_janaacPaymentVerificationLocalService =
			janaacPaymentVerificationLocalService;
	}

	private JanaacPaymentVerificationLocalService
		_janaacPaymentVerificationLocalService;

}