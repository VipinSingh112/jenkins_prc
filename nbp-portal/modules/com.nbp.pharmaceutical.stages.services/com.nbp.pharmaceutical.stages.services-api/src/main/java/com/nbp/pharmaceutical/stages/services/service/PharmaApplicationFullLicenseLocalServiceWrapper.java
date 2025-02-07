/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link PharmaApplicationFullLicenseLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationFullLicenseLocalService
 * @generated
 */
public class PharmaApplicationFullLicenseLocalServiceWrapper
	implements PharmaApplicationFullLicenseLocalService,
			   ServiceWrapper<PharmaApplicationFullLicenseLocalService> {

	public PharmaApplicationFullLicenseLocalServiceWrapper() {
		this(null);
	}

	public PharmaApplicationFullLicenseLocalServiceWrapper(
		PharmaApplicationFullLicenseLocalService
			pharmaApplicationFullLicenseLocalService) {

		_pharmaApplicationFullLicenseLocalService =
			pharmaApplicationFullLicenseLocalService;
	}

	/**
	 * Adds the pharma application full license to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationFullLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationFullLicense the pharma application full license
	 * @return the pharma application full license that was added
	 */
	@Override
	public
		com.nbp.pharmaceutical.stages.services.model.
			PharmaApplicationFullLicense addPharmaApplicationFullLicense(
				com.nbp.pharmaceutical.stages.services.model.
					PharmaApplicationFullLicense pharmaApplicationFullLicense) {

		return _pharmaApplicationFullLicenseLocalService.
			addPharmaApplicationFullLicense(pharmaApplicationFullLicense);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaApplicationFullLicenseLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new pharma application full license with the primary key. Does not add the pharma application full license to the database.
	 *
	 * @param pharmaFullLicenseId the primary key for the new pharma application full license
	 * @return the new pharma application full license
	 */
	@Override
	public
		com.nbp.pharmaceutical.stages.services.model.
			PharmaApplicationFullLicense createPharmaApplicationFullLicense(
				long pharmaFullLicenseId) {

		return _pharmaApplicationFullLicenseLocalService.
			createPharmaApplicationFullLicense(pharmaFullLicenseId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaApplicationFullLicenseLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the pharma application full license with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationFullLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaFullLicenseId the primary key of the pharma application full license
	 * @return the pharma application full license that was removed
	 * @throws PortalException if a pharma application full license with the primary key could not be found
	 */
	@Override
	public
		com.nbp.pharmaceutical.stages.services.model.
			PharmaApplicationFullLicense deletePharmaApplicationFullLicense(
					long pharmaFullLicenseId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaApplicationFullLicenseLocalService.
			deletePharmaApplicationFullLicense(pharmaFullLicenseId);
	}

	/**
	 * Deletes the pharma application full license from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationFullLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationFullLicense the pharma application full license
	 * @return the pharma application full license that was removed
	 */
	@Override
	public
		com.nbp.pharmaceutical.stages.services.model.
			PharmaApplicationFullLicense deletePharmaApplicationFullLicense(
				com.nbp.pharmaceutical.stages.services.model.
					PharmaApplicationFullLicense pharmaApplicationFullLicense) {

		return _pharmaApplicationFullLicenseLocalService.
			deletePharmaApplicationFullLicense(pharmaApplicationFullLicense);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _pharmaApplicationFullLicenseLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _pharmaApplicationFullLicenseLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pharmaApplicationFullLicenseLocalService.dynamicQuery();
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

		return _pharmaApplicationFullLicenseLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationFullLicenseModelImpl</code>.
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

		return _pharmaApplicationFullLicenseLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationFullLicenseModelImpl</code>.
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

		return _pharmaApplicationFullLicenseLocalService.dynamicQuery(
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

		return _pharmaApplicationFullLicenseLocalService.dynamicQueryCount(
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

		return _pharmaApplicationFullLicenseLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.pharmaceutical.stages.services.model.
			PharmaApplicationFullLicense fetchPharmaApplicationFullLicense(
				long pharmaFullLicenseId) {

		return _pharmaApplicationFullLicenseLocalService.
			fetchPharmaApplicationFullLicense(pharmaFullLicenseId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _pharmaApplicationFullLicenseLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _pharmaApplicationFullLicenseLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pharmaApplicationFullLicenseLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaApplicationFullLicenseLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the pharma application full license with the primary key.
	 *
	 * @param pharmaFullLicenseId the primary key of the pharma application full license
	 * @return the pharma application full license
	 * @throws PortalException if a pharma application full license with the primary key could not be found
	 */
	@Override
	public
		com.nbp.pharmaceutical.stages.services.model.
			PharmaApplicationFullLicense getPharmaApplicationFullLicense(
					long pharmaFullLicenseId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaApplicationFullLicenseLocalService.
			getPharmaApplicationFullLicense(pharmaFullLicenseId);
	}

	/**
	 * Returns a range of all the pharma application full licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationFullLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application full licenses
	 * @param end the upper bound of the range of pharma application full licenses (not inclusive)
	 * @return the range of pharma application full licenses
	 */
	@Override
	public java.util.List
		<com.nbp.pharmaceutical.stages.services.model.
			PharmaApplicationFullLicense> getPharmaApplicationFullLicenses(
				int start, int end) {

		return _pharmaApplicationFullLicenseLocalService.
			getPharmaApplicationFullLicenses(start, end);
	}

	/**
	 * Returns the number of pharma application full licenses.
	 *
	 * @return the number of pharma application full licenses
	 */
	@Override
	public int getPharmaApplicationFullLicensesCount() {
		return _pharmaApplicationFullLicenseLocalService.
			getPharmaApplicationFullLicensesCount();
	}

	@Override
	public java.util.List<String> getPharmaDistinctCaseIdList() {
		return _pharmaApplicationFullLicenseLocalService.
			getPharmaDistinctCaseIdList();
	}

	@Override
	public
		com.nbp.pharmaceutical.stages.services.model.
			PharmaApplicationFullLicense getPharmaFullLIcense(String caseId)
				throws com.nbp.pharmaceutical.stages.services.exception.
					NoSuchPharmaApplicationFullLicenseException {

		return _pharmaApplicationFullLicenseLocalService.getPharmaFullLIcense(
			caseId);
	}

	@Override
	public
		com.nbp.pharmaceutical.stages.services.model.
			PharmaApplicationFullLicense getPharmaFullLIcenseBY_LN(
					String licenseNumber)
				throws com.nbp.pharmaceutical.stages.services.exception.
					NoSuchPharmaApplicationFullLicenseException {

		return _pharmaApplicationFullLicenseLocalService.
			getPharmaFullLIcenseBY_LN(licenseNumber);
	}

	@Override
	public java.util.List
		<com.nbp.pharmaceutical.stages.services.model.
			PharmaApplicationFullLicense> getPharmaFullLIcenseByCI(
					String caseId)
				throws com.nbp.pharmaceutical.stages.services.exception.
					NoSuchPharmaApplicationFullLicenseException {

		return _pharmaApplicationFullLicenseLocalService.
			getPharmaFullLIcenseByCI(caseId);
	}

	/**
	 * Updates the pharma application full license in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationFullLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationFullLicense the pharma application full license
	 * @return the pharma application full license that was updated
	 */
	@Override
	public
		com.nbp.pharmaceutical.stages.services.model.
			PharmaApplicationFullLicense updatePharmaApplicationFullLicense(
				com.nbp.pharmaceutical.stages.services.model.
					PharmaApplicationFullLicense pharmaApplicationFullLicense) {

		return _pharmaApplicationFullLicenseLocalService.
			updatePharmaApplicationFullLicense(pharmaApplicationFullLicense);
	}

	@Override
	public
		com.nbp.pharmaceutical.stages.services.model.
			PharmaApplicationFullLicense updatePharmaApplicationFullLicense(
				String caseId, String licenseNumber, java.util.Date dateOfIssue,
				String feePaid, String receiptNumber, java.util.Date dueDate,
				String leadTime) {

		return _pharmaApplicationFullLicenseLocalService.
			updatePharmaApplicationFullLicense(
				caseId, licenseNumber, dateOfIssue, feePaid, receiptNumber,
				dueDate, leadTime);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _pharmaApplicationFullLicenseLocalService.getBasePersistence();
	}

	@Override
	public PharmaApplicationFullLicenseLocalService getWrappedService() {
		return _pharmaApplicationFullLicenseLocalService;
	}

	@Override
	public void setWrappedService(
		PharmaApplicationFullLicenseLocalService
			pharmaApplicationFullLicenseLocalService) {

		_pharmaApplicationFullLicenseLocalService =
			pharmaApplicationFullLicenseLocalService;
	}

	private PharmaApplicationFullLicenseLocalService
		_pharmaApplicationFullLicenseLocalService;

}