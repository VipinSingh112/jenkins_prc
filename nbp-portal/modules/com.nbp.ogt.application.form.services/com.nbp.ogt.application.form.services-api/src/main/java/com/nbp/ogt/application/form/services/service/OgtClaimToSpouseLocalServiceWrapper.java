/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OgtClaimToSpouseLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OgtClaimToSpouseLocalService
 * @generated
 */
public class OgtClaimToSpouseLocalServiceWrapper
	implements OgtClaimToSpouseLocalService,
			   ServiceWrapper<OgtClaimToSpouseLocalService> {

	public OgtClaimToSpouseLocalServiceWrapper() {
		this(null);
	}

	public OgtClaimToSpouseLocalServiceWrapper(
		OgtClaimToSpouseLocalService ogtClaimToSpouseLocalService) {

		_ogtClaimToSpouseLocalService = ogtClaimToSpouseLocalService;
	}

	/**
	 * Adds the ogt claim to spouse to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtClaimToSpouseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtClaimToSpouse the ogt claim to spouse
	 * @return the ogt claim to spouse that was added
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtClaimToSpouse
		addOgtClaimToSpouse(
			com.nbp.ogt.application.form.services.model.OgtClaimToSpouse
				ogtClaimToSpouse) {

		return _ogtClaimToSpouseLocalService.addOgtClaimToSpouse(
			ogtClaimToSpouse);
	}

	/**
	 * Creates a new ogt claim to spouse with the primary key. Does not add the ogt claim to spouse to the database.
	 *
	 * @param ogtClaimToSpouseId the primary key for the new ogt claim to spouse
	 * @return the new ogt claim to spouse
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtClaimToSpouse
		createOgtClaimToSpouse(long ogtClaimToSpouseId) {

		return _ogtClaimToSpouseLocalService.createOgtClaimToSpouse(
			ogtClaimToSpouseId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtClaimToSpouseLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ogt claim to spouse with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtClaimToSpouseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtClaimToSpouseId the primary key of the ogt claim to spouse
	 * @return the ogt claim to spouse that was removed
	 * @throws PortalException if a ogt claim to spouse with the primary key could not be found
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtClaimToSpouse
			deleteOgtClaimToSpouse(long ogtClaimToSpouseId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtClaimToSpouseLocalService.deleteOgtClaimToSpouse(
			ogtClaimToSpouseId);
	}

	/**
	 * Deletes the ogt claim to spouse from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtClaimToSpouseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtClaimToSpouse the ogt claim to spouse
	 * @return the ogt claim to spouse that was removed
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtClaimToSpouse
		deleteOgtClaimToSpouse(
			com.nbp.ogt.application.form.services.model.OgtClaimToSpouse
				ogtClaimToSpouse) {

		return _ogtClaimToSpouseLocalService.deleteOgtClaimToSpouse(
			ogtClaimToSpouse);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtClaimToSpouseLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ogtClaimToSpouseLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ogtClaimToSpouseLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ogtClaimToSpouseLocalService.dynamicQuery();
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

		return _ogtClaimToSpouseLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtClaimToSpouseModelImpl</code>.
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

		return _ogtClaimToSpouseLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtClaimToSpouseModelImpl</code>.
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

		return _ogtClaimToSpouseLocalService.dynamicQuery(
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

		return _ogtClaimToSpouseLocalService.dynamicQueryCount(dynamicQuery);
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

		return _ogtClaimToSpouseLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ogt.application.form.services.model.OgtClaimToSpouse
		fetchOgtClaimToSpouse(long ogtClaimToSpouseId) {

		return _ogtClaimToSpouseLocalService.fetchOgtClaimToSpouse(
			ogtClaimToSpouseId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ogtClaimToSpouseLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ogtClaimToSpouseLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.ogt.application.form.services.model.OgtClaimToSpouse
			getOgtById(long ogtApplicationId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtClaimToSpouseException {

		return _ogtClaimToSpouseLocalService.getOgtById(ogtApplicationId);
	}

	/**
	 * Returns the ogt claim to spouse with the primary key.
	 *
	 * @param ogtClaimToSpouseId the primary key of the ogt claim to spouse
	 * @return the ogt claim to spouse
	 * @throws PortalException if a ogt claim to spouse with the primary key could not be found
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtClaimToSpouse
			getOgtClaimToSpouse(long ogtClaimToSpouseId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtClaimToSpouseLocalService.getOgtClaimToSpouse(
			ogtClaimToSpouseId);
	}

	/**
	 * Returns a range of all the ogt claim to spouses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtClaimToSpouseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt claim to spouses
	 * @param end the upper bound of the range of ogt claim to spouses (not inclusive)
	 * @return the range of ogt claim to spouses
	 */
	@Override
	public java.util.List
		<com.nbp.ogt.application.form.services.model.OgtClaimToSpouse>
			getOgtClaimToSpouses(int start, int end) {

		return _ogtClaimToSpouseLocalService.getOgtClaimToSpouses(start, end);
	}

	/**
	 * Returns the number of ogt claim to spouses.
	 *
	 * @return the number of ogt claim to spouses
	 */
	@Override
	public int getOgtClaimToSpousesCount() {
		return _ogtClaimToSpouseLocalService.getOgtClaimToSpousesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ogtClaimToSpouseLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtClaimToSpouseLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the ogt claim to spouse in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtClaimToSpouseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtClaimToSpouse the ogt claim to spouse
	 * @return the ogt claim to spouse that was updated
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtClaimToSpouse
		updateOgtClaimToSpouse(
			com.nbp.ogt.application.form.services.model.OgtClaimToSpouse
				ogtClaimToSpouse) {

		return _ogtClaimToSpouseLocalService.updateOgtClaimToSpouse(
			ogtClaimToSpouse);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ogtClaimToSpouseLocalService.getBasePersistence();
	}

	@Override
	public OgtClaimToSpouseLocalService getWrappedService() {
		return _ogtClaimToSpouseLocalService;
	}

	@Override
	public void setWrappedService(
		OgtClaimToSpouseLocalService ogtClaimToSpouseLocalService) {

		_ogtClaimToSpouseLocalService = ogtClaimToSpouseLocalService;
	}

	private OgtClaimToSpouseLocalService _ogtClaimToSpouseLocalService;

}