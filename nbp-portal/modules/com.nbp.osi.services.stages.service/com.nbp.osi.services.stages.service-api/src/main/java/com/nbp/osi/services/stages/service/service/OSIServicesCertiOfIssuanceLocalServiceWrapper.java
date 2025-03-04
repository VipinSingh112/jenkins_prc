/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OSIServicesCertiOfIssuanceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OSIServicesCertiOfIssuanceLocalService
 * @generated
 */
public class OSIServicesCertiOfIssuanceLocalServiceWrapper
	implements OSIServicesCertiOfIssuanceLocalService,
			   ServiceWrapper<OSIServicesCertiOfIssuanceLocalService> {

	public OSIServicesCertiOfIssuanceLocalServiceWrapper() {
		this(null);
	}

	public OSIServicesCertiOfIssuanceLocalServiceWrapper(
		OSIServicesCertiOfIssuanceLocalService
			osiServicesCertiOfIssuanceLocalService) {

		_osiServicesCertiOfIssuanceLocalService =
			osiServicesCertiOfIssuanceLocalService;
	}

	/**
	 * Adds the osi services certi of issuance to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServicesCertiOfIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesCertiOfIssuance the osi services certi of issuance
	 * @return the osi services certi of issuance that was added
	 */
	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesCertiOfIssuance
		addOSIServicesCertiOfIssuance(
			com.nbp.osi.services.stages.service.model.OSIServicesCertiOfIssuance
				osiServicesCertiOfIssuance) {

		return _osiServicesCertiOfIssuanceLocalService.
			addOSIServicesCertiOfIssuance(osiServicesCertiOfIssuance);
	}

	/**
	 * Creates a new osi services certi of issuance with the primary key. Does not add the osi services certi of issuance to the database.
	 *
	 * @param oSIServicesCertiOfIssuanceId the primary key for the new osi services certi of issuance
	 * @return the new osi services certi of issuance
	 */
	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesCertiOfIssuance
		createOSIServicesCertiOfIssuance(long oSIServicesCertiOfIssuanceId) {

		return _osiServicesCertiOfIssuanceLocalService.
			createOSIServicesCertiOfIssuance(oSIServicesCertiOfIssuanceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesCertiOfIssuanceLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the osi services certi of issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServicesCertiOfIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param oSIServicesCertiOfIssuanceId the primary key of the osi services certi of issuance
	 * @return the osi services certi of issuance that was removed
	 * @throws PortalException if a osi services certi of issuance with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesCertiOfIssuance
			deleteOSIServicesCertiOfIssuance(long oSIServicesCertiOfIssuanceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesCertiOfIssuanceLocalService.
			deleteOSIServicesCertiOfIssuance(oSIServicesCertiOfIssuanceId);
	}

	/**
	 * Deletes the osi services certi of issuance from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServicesCertiOfIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesCertiOfIssuance the osi services certi of issuance
	 * @return the osi services certi of issuance that was removed
	 */
	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesCertiOfIssuance
		deleteOSIServicesCertiOfIssuance(
			com.nbp.osi.services.stages.service.model.OSIServicesCertiOfIssuance
				osiServicesCertiOfIssuance) {

		return _osiServicesCertiOfIssuanceLocalService.
			deleteOSIServicesCertiOfIssuance(osiServicesCertiOfIssuance);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesCertiOfIssuanceLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiServicesCertiOfIssuanceLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiServicesCertiOfIssuanceLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiServicesCertiOfIssuanceLocalService.dynamicQuery();
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

		return _osiServicesCertiOfIssuanceLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.stages.service.model.impl.OSIServicesCertiOfIssuanceModelImpl</code>.
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

		return _osiServicesCertiOfIssuanceLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.stages.service.model.impl.OSIServicesCertiOfIssuanceModelImpl</code>.
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

		return _osiServicesCertiOfIssuanceLocalService.dynamicQuery(
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

		return _osiServicesCertiOfIssuanceLocalService.dynamicQueryCount(
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

		return _osiServicesCertiOfIssuanceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesCertiOfIssuance
		fetchOSIServicesCertiOfIssuance(long oSIServicesCertiOfIssuanceId) {

		return _osiServicesCertiOfIssuanceLocalService.
			fetchOSIServicesCertiOfIssuance(oSIServicesCertiOfIssuanceId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiServicesCertiOfIssuanceLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiServicesCertiOfIssuanceLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServicesCertiOfIssuanceLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * Returns the osi services certi of issuance with the primary key.
	 *
	 * @param oSIServicesCertiOfIssuanceId the primary key of the osi services certi of issuance
	 * @return the osi services certi of issuance
	 * @throws PortalException if a osi services certi of issuance with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesCertiOfIssuance
			getOSIServicesCertiOfIssuance(long oSIServicesCertiOfIssuanceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesCertiOfIssuanceLocalService.
			getOSIServicesCertiOfIssuance(oSIServicesCertiOfIssuanceId);
	}

	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesCertiOfIssuance
			getOSIServicesCertiOfIssuanceByCaseId(String caseId)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesCertiOfIssuanceException {

		return _osiServicesCertiOfIssuanceLocalService.
			getOSIServicesCertiOfIssuanceByCaseId(caseId);
	}

	/**
	 * Returns a range of all the osi services certi of issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.stages.service.model.impl.OSIServicesCertiOfIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services certi of issuances
	 * @param end the upper bound of the range of osi services certi of issuances (not inclusive)
	 * @return the range of osi services certi of issuances
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.stages.service.model.OSIServicesCertiOfIssuance>
			getOSIServicesCertiOfIssuances(int start, int end) {

		return _osiServicesCertiOfIssuanceLocalService.
			getOSIServicesCertiOfIssuances(start, end);
	}

	/**
	 * Returns the number of osi services certi of issuances.
	 *
	 * @return the number of osi services certi of issuances
	 */
	@Override
	public int getOSIServicesCertiOfIssuancesCount() {
		return _osiServicesCertiOfIssuanceLocalService.
			getOSIServicesCertiOfIssuancesCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesCertiOfIssuanceLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the osi services certi of issuance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServicesCertiOfIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesCertiOfIssuance the osi services certi of issuance
	 * @return the osi services certi of issuance that was updated
	 */
	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesCertiOfIssuance
		updateOSIServicesCertiOfIssuance(
			com.nbp.osi.services.stages.service.model.OSIServicesCertiOfIssuance
				osiServicesCertiOfIssuance) {

		return _osiServicesCertiOfIssuanceLocalService.
			updateOSIServicesCertiOfIssuance(osiServicesCertiOfIssuance);
	}

	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesCertiOfIssuance
		updateOsiServicesCertiOfIssuance(
			String caseId, String nameOfInsolventPerson,
			java.util.Date dateCertificateIssued,
			java.util.Date dateOfExpiration, String certificateNum,
			String nameOfLicensedTrustee) {

		return _osiServicesCertiOfIssuanceLocalService.
			updateOsiServicesCertiOfIssuance(
				caseId, nameOfInsolventPerson, dateCertificateIssued,
				dateOfExpiration, certificateNum, nameOfLicensedTrustee);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiServicesCertiOfIssuanceLocalService.getBasePersistence();
	}

	@Override
	public OSIServicesCertiOfIssuanceLocalService getWrappedService() {
		return _osiServicesCertiOfIssuanceLocalService;
	}

	@Override
	public void setWrappedService(
		OSIServicesCertiOfIssuanceLocalService
			osiServicesCertiOfIssuanceLocalService) {

		_osiServicesCertiOfIssuanceLocalService =
			osiServicesCertiOfIssuanceLocalService;
	}

	private OSIServicesCertiOfIssuanceLocalService
		_osiServicesCertiOfIssuanceLocalService;

}