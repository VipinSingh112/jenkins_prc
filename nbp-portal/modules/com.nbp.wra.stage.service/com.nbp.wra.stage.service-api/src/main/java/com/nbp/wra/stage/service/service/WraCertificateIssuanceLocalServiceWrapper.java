/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link WraCertificateIssuanceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see WraCertificateIssuanceLocalService
 * @generated
 */
public class WraCertificateIssuanceLocalServiceWrapper
	implements ServiceWrapper<WraCertificateIssuanceLocalService>,
			   WraCertificateIssuanceLocalService {

	public WraCertificateIssuanceLocalServiceWrapper() {
		this(null);
	}

	public WraCertificateIssuanceLocalServiceWrapper(
		WraCertificateIssuanceLocalService wraCertificateIssuanceLocalService) {

		_wraCertificateIssuanceLocalService =
			wraCertificateIssuanceLocalService;
	}

	/**
	 * Adds the wra certificate issuance to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraCertificateIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraCertificateIssuance the wra certificate issuance
	 * @return the wra certificate issuance that was added
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraCertificateIssuance
		addWraCertificateIssuance(
			com.nbp.wra.stage.service.model.WraCertificateIssuance
				wraCertificateIssuance) {

		return _wraCertificateIssuanceLocalService.addWraCertificateIssuance(
			wraCertificateIssuance);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraCertificateIssuanceLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new wra certificate issuance with the primary key. Does not add the wra certificate issuance to the database.
	 *
	 * @param wraCertificateIssuanceId the primary key for the new wra certificate issuance
	 * @return the new wra certificate issuance
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraCertificateIssuance
		createWraCertificateIssuance(long wraCertificateIssuanceId) {

		return _wraCertificateIssuanceLocalService.createWraCertificateIssuance(
			wraCertificateIssuanceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraCertificateIssuanceLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the wra certificate issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraCertificateIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraCertificateIssuanceId the primary key of the wra certificate issuance
	 * @return the wra certificate issuance that was removed
	 * @throws PortalException if a wra certificate issuance with the primary key could not be found
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraCertificateIssuance
			deleteWraCertificateIssuance(long wraCertificateIssuanceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraCertificateIssuanceLocalService.deleteWraCertificateIssuance(
			wraCertificateIssuanceId);
	}

	/**
	 * Deletes the wra certificate issuance from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraCertificateIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraCertificateIssuance the wra certificate issuance
	 * @return the wra certificate issuance that was removed
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraCertificateIssuance
		deleteWraCertificateIssuance(
			com.nbp.wra.stage.service.model.WraCertificateIssuance
				wraCertificateIssuance) {

		return _wraCertificateIssuanceLocalService.deleteWraCertificateIssuance(
			wraCertificateIssuance);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _wraCertificateIssuanceLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _wraCertificateIssuanceLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _wraCertificateIssuanceLocalService.dynamicQuery();
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

		return _wraCertificateIssuanceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.stage.service.model.impl.WraCertificateIssuanceModelImpl</code>.
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

		return _wraCertificateIssuanceLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.stage.service.model.impl.WraCertificateIssuanceModelImpl</code>.
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

		return _wraCertificateIssuanceLocalService.dynamicQuery(
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

		return _wraCertificateIssuanceLocalService.dynamicQueryCount(
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

		return _wraCertificateIssuanceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.wra.stage.service.model.WraCertificateIssuance
		fetchWraCertificateIssuance(long wraCertificateIssuanceId) {

		return _wraCertificateIssuanceLocalService.fetchWraCertificateIssuance(
			wraCertificateIssuanceId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _wraCertificateIssuanceLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.wra.stage.service.model.WraCertificateIssuance
			getCertificateIssuance(String caseId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraCertificateIssuanceException {

		return _wraCertificateIssuanceLocalService.getCertificateIssuance(
			caseId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _wraCertificateIssuanceLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _wraCertificateIssuanceLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraCertificateIssuanceLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the wra certificate issuance with the primary key.
	 *
	 * @param wraCertificateIssuanceId the primary key of the wra certificate issuance
	 * @return the wra certificate issuance
	 * @throws PortalException if a wra certificate issuance with the primary key could not be found
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraCertificateIssuance
			getWraCertificateIssuance(long wraCertificateIssuanceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraCertificateIssuanceLocalService.getWraCertificateIssuance(
			wraCertificateIssuanceId);
	}

	/**
	 * Returns a range of all the wra certificate issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.stage.service.model.impl.WraCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra certificate issuances
	 * @param end the upper bound of the range of wra certificate issuances (not inclusive)
	 * @return the range of wra certificate issuances
	 */
	@Override
	public java.util.List
		<com.nbp.wra.stage.service.model.WraCertificateIssuance>
			getWraCertificateIssuances(int start, int end) {

		return _wraCertificateIssuanceLocalService.getWraCertificateIssuances(
			start, end);
	}

	/**
	 * Returns the number of wra certificate issuances.
	 *
	 * @return the number of wra certificate issuances
	 */
	@Override
	public int getWraCertificateIssuancesCount() {
		return _wraCertificateIssuanceLocalService.
			getWraCertificateIssuancesCount();
	}

	@Override
	public com.nbp.wra.stage.service.model.WraCertificateIssuance
		updateWraCertificateIssuance(
			String caseId, String status, String issuanceCertificate,
			String Category, java.util.Date dateOfCertificateIssuance,
			java.util.Date dateOfCertificateExpiration,
			long licenceFileEntryId) {

		return _wraCertificateIssuanceLocalService.updateWraCertificateIssuance(
			caseId, status, issuanceCertificate, Category,
			dateOfCertificateIssuance, dateOfCertificateExpiration,
			licenceFileEntryId);
	}

	/**
	 * Updates the wra certificate issuance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraCertificateIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraCertificateIssuance the wra certificate issuance
	 * @return the wra certificate issuance that was updated
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraCertificateIssuance
		updateWraCertificateIssuance(
			com.nbp.wra.stage.service.model.WraCertificateIssuance
				wraCertificateIssuance) {

		return _wraCertificateIssuanceLocalService.updateWraCertificateIssuance(
			wraCertificateIssuance);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _wraCertificateIssuanceLocalService.getBasePersistence();
	}

	@Override
	public WraCertificateIssuanceLocalService getWrappedService() {
		return _wraCertificateIssuanceLocalService;
	}

	@Override
	public void setWrappedService(
		WraCertificateIssuanceLocalService wraCertificateIssuanceLocalService) {

		_wraCertificateIssuanceLocalService =
			wraCertificateIssuanceLocalService;
	}

	private WraCertificateIssuanceLocalService
		_wraCertificateIssuanceLocalService;

}