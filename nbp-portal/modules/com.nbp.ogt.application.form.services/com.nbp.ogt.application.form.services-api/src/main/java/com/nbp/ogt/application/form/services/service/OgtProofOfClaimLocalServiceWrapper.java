/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OgtProofOfClaimLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OgtProofOfClaimLocalService
 * @generated
 */
public class OgtProofOfClaimLocalServiceWrapper
	implements OgtProofOfClaimLocalService,
			   ServiceWrapper<OgtProofOfClaimLocalService> {

	public OgtProofOfClaimLocalServiceWrapper() {
		this(null);
	}

	public OgtProofOfClaimLocalServiceWrapper(
		OgtProofOfClaimLocalService ogtProofOfClaimLocalService) {

		_ogtProofOfClaimLocalService = ogtProofOfClaimLocalService;
	}

	/**
	 * Adds the ogt proof of claim to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtProofOfClaimLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtProofOfClaim the ogt proof of claim
	 * @return the ogt proof of claim that was added
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtProofOfClaim
		addOgtProofOfClaim(
			com.nbp.ogt.application.form.services.model.OgtProofOfClaim
				ogtProofOfClaim) {

		return _ogtProofOfClaimLocalService.addOgtProofOfClaim(ogtProofOfClaim);
	}

	/**
	 * Creates a new ogt proof of claim with the primary key. Does not add the ogt proof of claim to the database.
	 *
	 * @param ogtProofOfClaimId the primary key for the new ogt proof of claim
	 * @return the new ogt proof of claim
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtProofOfClaim
		createOgtProofOfClaim(long ogtProofOfClaimId) {

		return _ogtProofOfClaimLocalService.createOgtProofOfClaim(
			ogtProofOfClaimId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtProofOfClaimLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the ogt proof of claim with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtProofOfClaimLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtProofOfClaimId the primary key of the ogt proof of claim
	 * @return the ogt proof of claim that was removed
	 * @throws PortalException if a ogt proof of claim with the primary key could not be found
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtProofOfClaim
			deleteOgtProofOfClaim(long ogtProofOfClaimId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtProofOfClaimLocalService.deleteOgtProofOfClaim(
			ogtProofOfClaimId);
	}

	/**
	 * Deletes the ogt proof of claim from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtProofOfClaimLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtProofOfClaim the ogt proof of claim
	 * @return the ogt proof of claim that was removed
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtProofOfClaim
		deleteOgtProofOfClaim(
			com.nbp.ogt.application.form.services.model.OgtProofOfClaim
				ogtProofOfClaim) {

		return _ogtProofOfClaimLocalService.deleteOgtProofOfClaim(
			ogtProofOfClaim);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtProofOfClaimLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ogtProofOfClaimLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ogtProofOfClaimLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ogtProofOfClaimLocalService.dynamicQuery();
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

		return _ogtProofOfClaimLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtProofOfClaimModelImpl</code>.
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

		return _ogtProofOfClaimLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtProofOfClaimModelImpl</code>.
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

		return _ogtProofOfClaimLocalService.dynamicQuery(
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

		return _ogtProofOfClaimLocalService.dynamicQueryCount(dynamicQuery);
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

		return _ogtProofOfClaimLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ogt.application.form.services.model.OgtProofOfClaim
		fetchOgtProofOfClaim(long ogtProofOfClaimId) {

		return _ogtProofOfClaimLocalService.fetchOgtProofOfClaim(
			ogtProofOfClaimId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ogtProofOfClaimLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ogtProofOfClaimLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.ogt.application.form.services.model.OgtProofOfClaim
			getOgtById(long ogtApplicationId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtProofOfClaimException {

		return _ogtProofOfClaimLocalService.getOgtById(ogtApplicationId);
	}

	/**
	 * Returns the ogt proof of claim with the primary key.
	 *
	 * @param ogtProofOfClaimId the primary key of the ogt proof of claim
	 * @return the ogt proof of claim
	 * @throws PortalException if a ogt proof of claim with the primary key could not be found
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtProofOfClaim
			getOgtProofOfClaim(long ogtProofOfClaimId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtProofOfClaimLocalService.getOgtProofOfClaim(
			ogtProofOfClaimId);
	}

	/**
	 * Returns a range of all the ogt proof of claims.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtProofOfClaimModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt proof of claims
	 * @param end the upper bound of the range of ogt proof of claims (not inclusive)
	 * @return the range of ogt proof of claims
	 */
	@Override
	public java.util.List
		<com.nbp.ogt.application.form.services.model.OgtProofOfClaim>
			getOgtProofOfClaims(int start, int end) {

		return _ogtProofOfClaimLocalService.getOgtProofOfClaims(start, end);
	}

	/**
	 * Returns the number of ogt proof of claims.
	 *
	 * @return the number of ogt proof of claims
	 */
	@Override
	public int getOgtProofOfClaimsCount() {
		return _ogtProofOfClaimLocalService.getOgtProofOfClaimsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ogtProofOfClaimLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtProofOfClaimLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the ogt proof of claim in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtProofOfClaimLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtProofOfClaim the ogt proof of claim
	 * @return the ogt proof of claim that was updated
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtProofOfClaim
		updateOgtProofOfClaim(
			com.nbp.ogt.application.form.services.model.OgtProofOfClaim
				ogtProofOfClaim) {

		return _ogtProofOfClaimLocalService.updateOgtProofOfClaim(
			ogtProofOfClaim);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ogtProofOfClaimLocalService.getBasePersistence();
	}

	@Override
	public OgtProofOfClaimLocalService getWrappedService() {
		return _ogtProofOfClaimLocalService;
	}

	@Override
	public void setWrappedService(
		OgtProofOfClaimLocalService ogtProofOfClaimLocalService) {

		_ogtProofOfClaimLocalService = ogtProofOfClaimLocalService;
	}

	private OgtProofOfClaimLocalService _ogtProofOfClaimLocalService;

}