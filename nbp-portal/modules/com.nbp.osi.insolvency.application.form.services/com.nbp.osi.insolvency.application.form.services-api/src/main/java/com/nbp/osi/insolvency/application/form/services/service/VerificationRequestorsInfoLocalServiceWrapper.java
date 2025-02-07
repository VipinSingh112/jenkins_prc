/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link VerificationRequestorsInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VerificationRequestorsInfoLocalService
 * @generated
 */
public class VerificationRequestorsInfoLocalServiceWrapper
	implements ServiceWrapper<VerificationRequestorsInfoLocalService>,
			   VerificationRequestorsInfoLocalService {

	public VerificationRequestorsInfoLocalServiceWrapper() {
		this(null);
	}

	public VerificationRequestorsInfoLocalServiceWrapper(
		VerificationRequestorsInfoLocalService
			verificationRequestorsInfoLocalService) {

		_verificationRequestorsInfoLocalService =
			verificationRequestorsInfoLocalService;
	}

	/**
	 * Adds the verification requestors info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VerificationRequestorsInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param verificationRequestorsInfo the verification requestors info
	 * @return the verification requestors info that was added
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		VerificationRequestorsInfo addVerificationRequestorsInfo(
			com.nbp.osi.insolvency.application.form.services.model.
				VerificationRequestorsInfo verificationRequestorsInfo) {

		return _verificationRequestorsInfoLocalService.
			addVerificationRequestorsInfo(verificationRequestorsInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _verificationRequestorsInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new verification requestors info with the primary key. Does not add the verification requestors info to the database.
	 *
	 * @param requestorInformationId the primary key for the new verification requestors info
	 * @return the new verification requestors info
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		VerificationRequestorsInfo createVerificationRequestorsInfo(
			long requestorInformationId) {

		return _verificationRequestorsInfoLocalService.
			createVerificationRequestorsInfo(requestorInformationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _verificationRequestorsInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the verification requestors info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VerificationRequestorsInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param requestorInformationId the primary key of the verification requestors info
	 * @return the verification requestors info that was removed
	 * @throws PortalException if a verification requestors info with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		VerificationRequestorsInfo deleteVerificationRequestorsInfo(
				long requestorInformationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _verificationRequestorsInfoLocalService.
			deleteVerificationRequestorsInfo(requestorInformationId);
	}

	/**
	 * Deletes the verification requestors info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VerificationRequestorsInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param verificationRequestorsInfo the verification requestors info
	 * @return the verification requestors info that was removed
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		VerificationRequestorsInfo deleteVerificationRequestorsInfo(
			com.nbp.osi.insolvency.application.form.services.model.
				VerificationRequestorsInfo verificationRequestorsInfo) {

		return _verificationRequestorsInfoLocalService.
			deleteVerificationRequestorsInfo(verificationRequestorsInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _verificationRequestorsInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _verificationRequestorsInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _verificationRequestorsInfoLocalService.dynamicQuery();
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

		return _verificationRequestorsInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.VerificationRequestorsInfoModelImpl</code>.
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

		return _verificationRequestorsInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.VerificationRequestorsInfoModelImpl</code>.
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

		return _verificationRequestorsInfoLocalService.dynamicQuery(
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

		return _verificationRequestorsInfoLocalService.dynamicQueryCount(
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

		return _verificationRequestorsInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		VerificationRequestorsInfo fetchVerificationRequestorsInfo(
			long requestorInformationId) {

		return _verificationRequestorsInfoLocalService.
			fetchVerificationRequestorsInfo(requestorInformationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _verificationRequestorsInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _verificationRequestorsInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _verificationRequestorsInfoLocalService.
			getOSGiServiceIdentifier();
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		VerificationRequestorsInfo getOsiById(long osiInsolvencyId)
			throws com.nbp.osi.insolvency.application.form.services.exception.
				NoSuchVerificationRequestorsInfoException {

		return _verificationRequestorsInfoLocalService.getOsiById(
			osiInsolvencyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _verificationRequestorsInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the verification requestors info with the primary key.
	 *
	 * @param requestorInformationId the primary key of the verification requestors info
	 * @return the verification requestors info
	 * @throws PortalException if a verification requestors info with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		VerificationRequestorsInfo getVerificationRequestorsInfo(
				long requestorInformationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _verificationRequestorsInfoLocalService.
			getVerificationRequestorsInfo(requestorInformationId);
	}

	/**
	 * Returns a range of all the verification requestors infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.VerificationRequestorsInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of verification requestors infos
	 * @param end the upper bound of the range of verification requestors infos (not inclusive)
	 * @return the range of verification requestors infos
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			VerificationRequestorsInfo> getVerificationRequestorsInfos(
				int start, int end) {

		return _verificationRequestorsInfoLocalService.
			getVerificationRequestorsInfos(start, end);
	}

	/**
	 * Returns the number of verification requestors infos.
	 *
	 * @return the number of verification requestors infos
	 */
	@Override
	public int getVerificationRequestorsInfosCount() {
		return _verificationRequestorsInfoLocalService.
			getVerificationRequestorsInfosCount();
	}

	/**
	 * Updates the verification requestors info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VerificationRequestorsInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param verificationRequestorsInfo the verification requestors info
	 * @return the verification requestors info that was updated
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		VerificationRequestorsInfo updateVerificationRequestorsInfo(
			com.nbp.osi.insolvency.application.form.services.model.
				VerificationRequestorsInfo verificationRequestorsInfo) {

		return _verificationRequestorsInfoLocalService.
			updateVerificationRequestorsInfo(verificationRequestorsInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _verificationRequestorsInfoLocalService.getBasePersistence();
	}

	@Override
	public VerificationRequestorsInfoLocalService getWrappedService() {
		return _verificationRequestorsInfoLocalService;
	}

	@Override
	public void setWrappedService(
		VerificationRequestorsInfoLocalService
			verificationRequestorsInfoLocalService) {

		_verificationRequestorsInfoLocalService =
			verificationRequestorsInfoLocalService;
	}

	private VerificationRequestorsInfoLocalService
		_verificationRequestorsInfoLocalService;

}