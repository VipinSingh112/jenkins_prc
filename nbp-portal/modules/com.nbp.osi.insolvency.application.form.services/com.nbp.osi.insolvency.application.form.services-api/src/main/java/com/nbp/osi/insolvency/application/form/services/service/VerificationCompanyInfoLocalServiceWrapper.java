/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link VerificationCompanyInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VerificationCompanyInfoLocalService
 * @generated
 */
public class VerificationCompanyInfoLocalServiceWrapper
	implements ServiceWrapper<VerificationCompanyInfoLocalService>,
			   VerificationCompanyInfoLocalService {

	public VerificationCompanyInfoLocalServiceWrapper() {
		this(null);
	}

	public VerificationCompanyInfoLocalServiceWrapper(
		VerificationCompanyInfoLocalService
			verificationCompanyInfoLocalService) {

		_verificationCompanyInfoLocalService =
			verificationCompanyInfoLocalService;
	}

	/**
	 * Adds the verification company info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VerificationCompanyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param verificationCompanyInfo the verification company info
	 * @return the verification company info that was added
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		VerificationCompanyInfo addVerificationCompanyInfo(
			com.nbp.osi.insolvency.application.form.services.model.
				VerificationCompanyInfo verificationCompanyInfo) {

		return _verificationCompanyInfoLocalService.addVerificationCompanyInfo(
			verificationCompanyInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _verificationCompanyInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new verification company info with the primary key. Does not add the verification company info to the database.
	 *
	 * @param verificationCompanyInfoId the primary key for the new verification company info
	 * @return the new verification company info
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		VerificationCompanyInfo createVerificationCompanyInfo(
			long verificationCompanyInfoId) {

		return _verificationCompanyInfoLocalService.
			createVerificationCompanyInfo(verificationCompanyInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _verificationCompanyInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the verification company info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VerificationCompanyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param verificationCompanyInfoId the primary key of the verification company info
	 * @return the verification company info that was removed
	 * @throws PortalException if a verification company info with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		VerificationCompanyInfo deleteVerificationCompanyInfo(
				long verificationCompanyInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _verificationCompanyInfoLocalService.
			deleteVerificationCompanyInfo(verificationCompanyInfoId);
	}

	/**
	 * Deletes the verification company info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VerificationCompanyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param verificationCompanyInfo the verification company info
	 * @return the verification company info that was removed
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		VerificationCompanyInfo deleteVerificationCompanyInfo(
			com.nbp.osi.insolvency.application.form.services.model.
				VerificationCompanyInfo verificationCompanyInfo) {

		return _verificationCompanyInfoLocalService.
			deleteVerificationCompanyInfo(verificationCompanyInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _verificationCompanyInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _verificationCompanyInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _verificationCompanyInfoLocalService.dynamicQuery();
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

		return _verificationCompanyInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.VerificationCompanyInfoModelImpl</code>.
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

		return _verificationCompanyInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.VerificationCompanyInfoModelImpl</code>.
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

		return _verificationCompanyInfoLocalService.dynamicQuery(
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

		return _verificationCompanyInfoLocalService.dynamicQueryCount(
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

		return _verificationCompanyInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		VerificationCompanyInfo fetchVerificationCompanyInfo(
			long verificationCompanyInfoId) {

		return _verificationCompanyInfoLocalService.
			fetchVerificationCompanyInfo(verificationCompanyInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _verificationCompanyInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _verificationCompanyInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _verificationCompanyInfoLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		VerificationCompanyInfo getOsiInsolvencyById(long osiInsolvencyId)
			throws com.nbp.osi.insolvency.application.form.services.exception.
				NoSuchVerificationCompanyInfoException {

		return _verificationCompanyInfoLocalService.getOsiInsolvencyById(
			osiInsolvencyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _verificationCompanyInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the verification company info with the primary key.
	 *
	 * @param verificationCompanyInfoId the primary key of the verification company info
	 * @return the verification company info
	 * @throws PortalException if a verification company info with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		VerificationCompanyInfo getVerificationCompanyInfo(
				long verificationCompanyInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _verificationCompanyInfoLocalService.getVerificationCompanyInfo(
			verificationCompanyInfoId);
	}

	/**
	 * Returns a range of all the verification company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.VerificationCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of verification company infos
	 * @param end the upper bound of the range of verification company infos (not inclusive)
	 * @return the range of verification company infos
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			VerificationCompanyInfo> getVerificationCompanyInfos(
				int start, int end) {

		return _verificationCompanyInfoLocalService.getVerificationCompanyInfos(
			start, end);
	}

	/**
	 * Returns the number of verification company infos.
	 *
	 * @return the number of verification company infos
	 */
	@Override
	public int getVerificationCompanyInfosCount() {
		return _verificationCompanyInfoLocalService.
			getVerificationCompanyInfosCount();
	}

	/**
	 * Updates the verification company info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VerificationCompanyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param verificationCompanyInfo the verification company info
	 * @return the verification company info that was updated
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		VerificationCompanyInfo updateVerificationCompanyInfo(
			com.nbp.osi.insolvency.application.form.services.model.
				VerificationCompanyInfo verificationCompanyInfo) {

		return _verificationCompanyInfoLocalService.
			updateVerificationCompanyInfo(verificationCompanyInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _verificationCompanyInfoLocalService.getBasePersistence();
	}

	@Override
	public VerificationCompanyInfoLocalService getWrappedService() {
		return _verificationCompanyInfoLocalService;
	}

	@Override
	public void setWrappedService(
		VerificationCompanyInfoLocalService
			verificationCompanyInfoLocalService) {

		_verificationCompanyInfoLocalService =
			verificationCompanyInfoLocalService;
	}

	private VerificationCompanyInfoLocalService
		_verificationCompanyInfoLocalService;

}