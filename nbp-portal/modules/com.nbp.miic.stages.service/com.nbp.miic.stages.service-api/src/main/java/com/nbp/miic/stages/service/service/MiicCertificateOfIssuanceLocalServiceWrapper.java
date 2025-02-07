/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MiicCertificateOfIssuanceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiicCertificateOfIssuanceLocalService
 * @generated
 */
public class MiicCertificateOfIssuanceLocalServiceWrapper
	implements MiicCertificateOfIssuanceLocalService,
			   ServiceWrapper<MiicCertificateOfIssuanceLocalService> {

	public MiicCertificateOfIssuanceLocalServiceWrapper() {
		this(null);
	}

	public MiicCertificateOfIssuanceLocalServiceWrapper(
		MiicCertificateOfIssuanceLocalService
			miicCertificateOfIssuanceLocalService) {

		_miicCertificateOfIssuanceLocalService =
			miicCertificateOfIssuanceLocalService;
	}

	/**
	 * Adds the miic certificate of issuance to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicCertificateOfIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicCertificateOfIssuance the miic certificate of issuance
	 * @return the miic certificate of issuance that was added
	 */
	@Override
	public com.nbp.miic.stages.service.model.MiicCertificateOfIssuance
		addMiicCertificateOfIssuance(
			com.nbp.miic.stages.service.model.MiicCertificateOfIssuance
				miicCertificateOfIssuance) {

		return _miicCertificateOfIssuanceLocalService.
			addMiicCertificateOfIssuance(miicCertificateOfIssuance);
	}

	/**
	 * Creates a new miic certificate of issuance with the primary key. Does not add the miic certificate of issuance to the database.
	 *
	 * @param miicCertificateOfIssuanceId the primary key for the new miic certificate of issuance
	 * @return the new miic certificate of issuance
	 */
	@Override
	public com.nbp.miic.stages.service.model.MiicCertificateOfIssuance
		createMiicCertificateOfIssuance(long miicCertificateOfIssuanceId) {

		return _miicCertificateOfIssuanceLocalService.
			createMiicCertificateOfIssuance(miicCertificateOfIssuanceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicCertificateOfIssuanceLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the miic certificate of issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicCertificateOfIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicCertificateOfIssuanceId the primary key of the miic certificate of issuance
	 * @return the miic certificate of issuance that was removed
	 * @throws PortalException if a miic certificate of issuance with the primary key could not be found
	 */
	@Override
	public com.nbp.miic.stages.service.model.MiicCertificateOfIssuance
			deleteMiicCertificateOfIssuance(long miicCertificateOfIssuanceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicCertificateOfIssuanceLocalService.
			deleteMiicCertificateOfIssuance(miicCertificateOfIssuanceId);
	}

	/**
	 * Deletes the miic certificate of issuance from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicCertificateOfIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicCertificateOfIssuance the miic certificate of issuance
	 * @return the miic certificate of issuance that was removed
	 */
	@Override
	public com.nbp.miic.stages.service.model.MiicCertificateOfIssuance
		deleteMiicCertificateOfIssuance(
			com.nbp.miic.stages.service.model.MiicCertificateOfIssuance
				miicCertificateOfIssuance) {

		return _miicCertificateOfIssuanceLocalService.
			deleteMiicCertificateOfIssuance(miicCertificateOfIssuance);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicCertificateOfIssuanceLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _miicCertificateOfIssuanceLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _miicCertificateOfIssuanceLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _miicCertificateOfIssuanceLocalService.dynamicQuery();
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

		return _miicCertificateOfIssuanceLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.stages.service.model.impl.MiicCertificateOfIssuanceModelImpl</code>.
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

		return _miicCertificateOfIssuanceLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.stages.service.model.impl.MiicCertificateOfIssuanceModelImpl</code>.
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

		return _miicCertificateOfIssuanceLocalService.dynamicQuery(
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

		return _miicCertificateOfIssuanceLocalService.dynamicQueryCount(
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

		return _miicCertificateOfIssuanceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.miic.stages.service.model.MiicCertificateOfIssuance
		fetchMiicCertificateOfIssuance(long miicCertificateOfIssuanceId) {

		return _miicCertificateOfIssuanceLocalService.
			fetchMiicCertificateOfIssuance(miicCertificateOfIssuanceId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _miicCertificateOfIssuanceLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _miicCertificateOfIssuanceLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.miic.stages.service.model.MiicCertificateOfIssuance
			getMiic_RD_by_CI(String caseId)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicCertificateOfIssuanceException {

		return _miicCertificateOfIssuanceLocalService.getMiic_RD_by_CI(caseId);
	}

	/**
	 * Returns the miic certificate of issuance with the primary key.
	 *
	 * @param miicCertificateOfIssuanceId the primary key of the miic certificate of issuance
	 * @return the miic certificate of issuance
	 * @throws PortalException if a miic certificate of issuance with the primary key could not be found
	 */
	@Override
	public com.nbp.miic.stages.service.model.MiicCertificateOfIssuance
			getMiicCertificateOfIssuance(long miicCertificateOfIssuanceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicCertificateOfIssuanceLocalService.
			getMiicCertificateOfIssuance(miicCertificateOfIssuanceId);
	}

	/**
	 * Returns a range of all the miic certificate of issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.stages.service.model.impl.MiicCertificateOfIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic certificate of issuances
	 * @param end the upper bound of the range of miic certificate of issuances (not inclusive)
	 * @return the range of miic certificate of issuances
	 */
	@Override
	public java.util.List
		<com.nbp.miic.stages.service.model.MiicCertificateOfIssuance>
			getMiicCertificateOfIssuances(int start, int end) {

		return _miicCertificateOfIssuanceLocalService.
			getMiicCertificateOfIssuances(start, end);
	}

	/**
	 * Returns the number of miic certificate of issuances.
	 *
	 * @return the number of miic certificate of issuances
	 */
	@Override
	public int getMiicCertificateOfIssuancesCount() {
		return _miicCertificateOfIssuanceLocalService.
			getMiicCertificateOfIssuancesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miicCertificateOfIssuanceLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicCertificateOfIssuanceLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the miic certificate of issuance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicCertificateOfIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicCertificateOfIssuance the miic certificate of issuance
	 * @return the miic certificate of issuance that was updated
	 */
	@Override
	public com.nbp.miic.stages.service.model.MiicCertificateOfIssuance
		updateMiicCertificateOfIssuance(
			com.nbp.miic.stages.service.model.MiicCertificateOfIssuance
				miicCertificateOfIssuance) {

		return _miicCertificateOfIssuanceLocalService.
			updateMiicCertificateOfIssuance(miicCertificateOfIssuance);
	}

	@Override
	public com.nbp.miic.stages.service.model.MiicCertificateOfIssuance
		updateMiicCertificateOfIssuance(
			String caseId, String certificateNumber,
			java.util.Date dateCertificateIssued,
			java.util.Date dateOfExpiration) {

		return _miicCertificateOfIssuanceLocalService.
			updateMiicCertificateOfIssuance(
				caseId, certificateNumber, dateCertificateIssued,
				dateOfExpiration);
	}

	@Override
	public com.nbp.miic.stages.service.model.MiicCertificateOfIssuance
		updateMiicCertificateOfIssuanceData(
			String caseId, String certificateNumber,
			java.util.Date dateCertificateIssued,
			java.util.Date dateOfExpiration, String nameOfLicensedTrustee) {

		return _miicCertificateOfIssuanceLocalService.
			updateMiicCertificateOfIssuanceData(
				caseId, certificateNumber, dateCertificateIssued,
				dateOfExpiration, nameOfLicensedTrustee);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _miicCertificateOfIssuanceLocalService.getBasePersistence();
	}

	@Override
	public MiicCertificateOfIssuanceLocalService getWrappedService() {
		return _miicCertificateOfIssuanceLocalService;
	}

	@Override
	public void setWrappedService(
		MiicCertificateOfIssuanceLocalService
			miicCertificateOfIssuanceLocalService) {

		_miicCertificateOfIssuanceLocalService =
			miicCertificateOfIssuanceLocalService;
	}

	private MiicCertificateOfIssuanceLocalService
		_miicCertificateOfIssuanceLocalService;

}