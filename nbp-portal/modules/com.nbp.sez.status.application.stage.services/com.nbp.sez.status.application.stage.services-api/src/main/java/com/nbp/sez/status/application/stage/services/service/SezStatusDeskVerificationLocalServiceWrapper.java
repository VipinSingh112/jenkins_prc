/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezStatusDeskVerificationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusDeskVerificationLocalService
 * @generated
 */
public class SezStatusDeskVerificationLocalServiceWrapper
	implements ServiceWrapper<SezStatusDeskVerificationLocalService>,
			   SezStatusDeskVerificationLocalService {

	public SezStatusDeskVerificationLocalServiceWrapper() {
		this(null);
	}

	public SezStatusDeskVerificationLocalServiceWrapper(
		SezStatusDeskVerificationLocalService
			sezStatusDeskVerificationLocalService) {

		_sezStatusDeskVerificationLocalService =
			sezStatusDeskVerificationLocalService;
	}

	/**
	 * Adds the sez status desk verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusDeskVerification the sez status desk verification
	 * @return the sez status desk verification that was added
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusDeskVerification addSezStatusDeskVerification(
			com.nbp.sez.status.application.stage.services.model.
				SezStatusDeskVerification sezStatusDeskVerification) {

		return _sezStatusDeskVerificationLocalService.
			addSezStatusDeskVerification(sezStatusDeskVerification);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusDeskVerificationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez status desk verification with the primary key. Does not add the sez status desk verification to the database.
	 *
	 * @param SezDeskVerificationId the primary key for the new sez status desk verification
	 * @return the new sez status desk verification
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusDeskVerification createSezStatusDeskVerification(
			long SezDeskVerificationId) {

		return _sezStatusDeskVerificationLocalService.
			createSezStatusDeskVerification(SezDeskVerificationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusDeskVerificationLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez status desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param SezDeskVerificationId the primary key of the sez status desk verification
	 * @return the sez status desk verification that was removed
	 * @throws PortalException if a sez status desk verification with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusDeskVerification deleteSezStatusDeskVerification(
				long SezDeskVerificationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusDeskVerificationLocalService.
			deleteSezStatusDeskVerification(SezDeskVerificationId);
	}

	/**
	 * Deletes the sez status desk verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusDeskVerification the sez status desk verification
	 * @return the sez status desk verification that was removed
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusDeskVerification deleteSezStatusDeskVerification(
			com.nbp.sez.status.application.stage.services.model.
				SezStatusDeskVerification sezStatusDeskVerification) {

		return _sezStatusDeskVerificationLocalService.
			deleteSezStatusDeskVerification(sezStatusDeskVerification);
	}

	@Override
	public void deleteSezStatusDeskVerificationById(
		long sezStatusApplicatioId) {

		_sezStatusDeskVerificationLocalService.
			deleteSezStatusDeskVerificationById(sezStatusApplicatioId);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezStatusDeskVerificationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezStatusDeskVerificationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezStatusDeskVerificationLocalService.dynamicQuery();
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

		return _sezStatusDeskVerificationLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusDeskVerificationModelImpl</code>.
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

		return _sezStatusDeskVerificationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusDeskVerificationModelImpl</code>.
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

		return _sezStatusDeskVerificationLocalService.dynamicQuery(
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

		return _sezStatusDeskVerificationLocalService.dynamicQueryCount(
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

		return _sezStatusDeskVerificationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusDeskVerification fetchSezStatusDeskVerification(
			long SezDeskVerificationId) {

		return _sezStatusDeskVerificationLocalService.
			fetchSezStatusDeskVerification(SezDeskVerificationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezStatusDeskVerificationLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.stage.services.model.
			SezStatusDeskVerification> getDeskVerificationById(
				long applicationId) {

		return _sezStatusDeskVerificationLocalService.getDeskVerificationById(
			applicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezStatusDeskVerificationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezStatusDeskVerificationLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusDeskVerificationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the sez status desk verification with the primary key.
	 *
	 * @param SezDeskVerificationId the primary key of the sez status desk verification
	 * @return the sez status desk verification
	 * @throws PortalException if a sez status desk verification with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusDeskVerification getSezStatusDeskVerification(
				long SezDeskVerificationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusDeskVerificationLocalService.
			getSezStatusDeskVerification(SezDeskVerificationId);
	}

	/**
	 * Returns a range of all the sez status desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status desk verifications
	 * @param end the upper bound of the range of sez status desk verifications (not inclusive)
	 * @return the range of sez status desk verifications
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.stage.services.model.
			SezStatusDeskVerification> getSezStatusDeskVerifications(
				int start, int end) {

		return _sezStatusDeskVerificationLocalService.
			getSezStatusDeskVerifications(start, end);
	}

	/**
	 * Returns the number of sez status desk verifications.
	 *
	 * @return the number of sez status desk verifications
	 */
	@Override
	public int getSezStatusDeskVerificationsCount() {
		return _sezStatusDeskVerificationLocalService.
			getSezStatusDeskVerificationsCount();
	}

	/**
	 * Updates the sez status desk verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusDeskVerification the sez status desk verification
	 * @return the sez status desk verification that was updated
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusDeskVerification updateSezStatusDeskVerification(
			com.nbp.sez.status.application.stage.services.model.
				SezStatusDeskVerification sezStatusDeskVerification) {

		return _sezStatusDeskVerificationLocalService.
			updateSezStatusDeskVerification(sezStatusDeskVerification);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezStatusDeskVerificationLocalService.getBasePersistence();
	}

	@Override
	public SezStatusDeskVerificationLocalService getWrappedService() {
		return _sezStatusDeskVerificationLocalService;
	}

	@Override
	public void setWrappedService(
		SezStatusDeskVerificationLocalService
			sezStatusDeskVerificationLocalService) {

		_sezStatusDeskVerificationLocalService =
			sezStatusDeskVerificationLocalService;
	}

	private SezStatusDeskVerificationLocalService
		_sezStatusDeskVerificationLocalService;

}