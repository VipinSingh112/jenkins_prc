/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JtbAddCraftApplicantInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddCraftApplicantInfoLocalService
 * @generated
 */
public class JtbAddCraftApplicantInfoLocalServiceWrapper
	implements JtbAddCraftApplicantInfoLocalService,
			   ServiceWrapper<JtbAddCraftApplicantInfoLocalService> {

	public JtbAddCraftApplicantInfoLocalServiceWrapper() {
		this(null);
	}

	public JtbAddCraftApplicantInfoLocalServiceWrapper(
		JtbAddCraftApplicantInfoLocalService
			jtbAddCraftApplicantInfoLocalService) {

		_jtbAddCraftApplicantInfoLocalService =
			jtbAddCraftApplicantInfoLocalService;
	}

	/**
	 * Adds the jtb add craft applicant info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAddCraftApplicantInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAddCraftApplicantInfo the jtb add craft applicant info
	 * @return the jtb add craft applicant info that was added
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddCraftApplicantInfo
		addJtbAddCraftApplicantInfo(
			com.nbp.jtb.application.form.service.model.JtbAddCraftApplicantInfo
				jtbAddCraftApplicantInfo) {

		return _jtbAddCraftApplicantInfoLocalService.
			addJtbAddCraftApplicantInfo(jtbAddCraftApplicantInfo);
	}

	/**
	 * Creates a new jtb add craft applicant info with the primary key. Does not add the jtb add craft applicant info to the database.
	 *
	 * @param jtbAddCraftApplicantInfoId the primary key for the new jtb add craft applicant info
	 * @return the new jtb add craft applicant info
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddCraftApplicantInfo
		createJtbAddCraftApplicantInfo(long jtbAddCraftApplicantInfoId) {

		return _jtbAddCraftApplicantInfoLocalService.
			createJtbAddCraftApplicantInfo(jtbAddCraftApplicantInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbAddCraftApplicantInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the jtb add craft applicant info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAddCraftApplicantInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAddCraftApplicantInfo the jtb add craft applicant info
	 * @return the jtb add craft applicant info that was removed
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddCraftApplicantInfo
		deleteJtbAddCraftApplicantInfo(
			com.nbp.jtb.application.form.service.model.JtbAddCraftApplicantInfo
				jtbAddCraftApplicantInfo) {

		return _jtbAddCraftApplicantInfoLocalService.
			deleteJtbAddCraftApplicantInfo(jtbAddCraftApplicantInfo);
	}

	/**
	 * Deletes the jtb add craft applicant info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAddCraftApplicantInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAddCraftApplicantInfoId the primary key of the jtb add craft applicant info
	 * @return the jtb add craft applicant info that was removed
	 * @throws PortalException if a jtb add craft applicant info with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddCraftApplicantInfo
			deleteJtbAddCraftApplicantInfo(long jtbAddCraftApplicantInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbAddCraftApplicantInfoLocalService.
			deleteJtbAddCraftApplicantInfo(jtbAddCraftApplicantInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbAddCraftApplicantInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _jtbAddCraftApplicantInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _jtbAddCraftApplicantInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jtbAddCraftApplicantInfoLocalService.dynamicQuery();
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

		return _jtbAddCraftApplicantInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JtbAddCraftApplicantInfoModelImpl</code>.
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

		return _jtbAddCraftApplicantInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JtbAddCraftApplicantInfoModelImpl</code>.
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

		return _jtbAddCraftApplicantInfoLocalService.dynamicQuery(
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

		return _jtbAddCraftApplicantInfoLocalService.dynamicQueryCount(
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

		return _jtbAddCraftApplicantInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddCraftApplicantInfo
		fetchJtbAddCraftApplicantInfo(long jtbAddCraftApplicantInfoId) {

		return _jtbAddCraftApplicantInfoLocalService.
			fetchJtbAddCraftApplicantInfo(jtbAddCraftApplicantInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _jtbAddCraftApplicantInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.JtbAddCraftApplicantInfo>
			getByJtbAppId(long jtbApplicationId) {

		return _jtbAddCraftApplicantInfoLocalService.getByJtbAppId(
			jtbApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _jtbAddCraftApplicantInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the jtb add craft applicant info with the primary key.
	 *
	 * @param jtbAddCraftApplicantInfoId the primary key of the jtb add craft applicant info
	 * @return the jtb add craft applicant info
	 * @throws PortalException if a jtb add craft applicant info with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddCraftApplicantInfo
			getJtbAddCraftApplicantInfo(long jtbAddCraftApplicantInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbAddCraftApplicantInfoLocalService.
			getJtbAddCraftApplicantInfo(jtbAddCraftApplicantInfoId);
	}

	/**
	 * Returns a range of all the jtb add craft applicant infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JtbAddCraftApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add craft applicant infos
	 * @param end the upper bound of the range of jtb add craft applicant infos (not inclusive)
	 * @return the range of jtb add craft applicant infos
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.JtbAddCraftApplicantInfo>
			getJtbAddCraftApplicantInfos(int start, int end) {

		return _jtbAddCraftApplicantInfoLocalService.
			getJtbAddCraftApplicantInfos(start, end);
	}

	/**
	 * Returns the number of jtb add craft applicant infos.
	 *
	 * @return the number of jtb add craft applicant infos
	 */
	@Override
	public int getJtbAddCraftApplicantInfosCount() {
		return _jtbAddCraftApplicantInfoLocalService.
			getJtbAddCraftApplicantInfosCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jtbAddCraftApplicantInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbAddCraftApplicantInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the jtb add craft applicant info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAddCraftApplicantInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAddCraftApplicantInfo the jtb add craft applicant info
	 * @return the jtb add craft applicant info that was updated
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddCraftApplicantInfo
		updateJtbAddCraftApplicantInfo(
			com.nbp.jtb.application.form.service.model.JtbAddCraftApplicantInfo
				jtbAddCraftApplicantInfo) {

		return _jtbAddCraftApplicantInfoLocalService.
			updateJtbAddCraftApplicantInfo(jtbAddCraftApplicantInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _jtbAddCraftApplicantInfoLocalService.getBasePersistence();
	}

	@Override
	public JtbAddCraftApplicantInfoLocalService getWrappedService() {
		return _jtbAddCraftApplicantInfoLocalService;
	}

	@Override
	public void setWrappedService(
		JtbAddCraftApplicantInfoLocalService
			jtbAddCraftApplicantInfoLocalService) {

		_jtbAddCraftApplicantInfoLocalService =
			jtbAddCraftApplicantInfoLocalService;
	}

	private JtbAddCraftApplicantInfoLocalService
		_jtbAddCraftApplicantInfoLocalService;

}