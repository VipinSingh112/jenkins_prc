/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.services.stages.service.exception.NoSuchOSIServicesCertiOfIssuanceException;
import com.nbp.osi.services.stages.service.model.OSIServicesCertiOfIssuance;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi services certi of issuance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OSIServicesCertiOfIssuanceUtil
 * @generated
 */
@ProviderType
public interface OSIServicesCertiOfIssuancePersistence
	extends BasePersistence<OSIServicesCertiOfIssuance> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OSIServicesCertiOfIssuanceUtil} to access the osi services certi of issuance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the osi services certi of issuance where caseId = &#63; or throws a <code>NoSuchOSIServicesCertiOfIssuanceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi services certi of issuance
	 * @throws NoSuchOSIServicesCertiOfIssuanceException if a matching osi services certi of issuance could not be found
	 */
	public OSIServicesCertiOfIssuance
			findBygetOsiServicesCertiOfIssuanceServicesByCaseId(String caseId)
		throws NoSuchOSIServicesCertiOfIssuanceException;

	/**
	 * Returns the osi services certi of issuance where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi services certi of issuance, or <code>null</code> if a matching osi services certi of issuance could not be found
	 */
	public OSIServicesCertiOfIssuance
		fetchBygetOsiServicesCertiOfIssuanceServicesByCaseId(String caseId);

	/**
	 * Returns the osi services certi of issuance where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services certi of issuance, or <code>null</code> if a matching osi services certi of issuance could not be found
	 */
	public OSIServicesCertiOfIssuance
		fetchBygetOsiServicesCertiOfIssuanceServicesByCaseId(
			String caseId, boolean useFinderCache);

	/**
	 * Removes the osi services certi of issuance where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi services certi of issuance that was removed
	 */
	public OSIServicesCertiOfIssuance
			removeBygetOsiServicesCertiOfIssuanceServicesByCaseId(String caseId)
		throws NoSuchOSIServicesCertiOfIssuanceException;

	/**
	 * Returns the number of osi services certi of issuances where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi services certi of issuances
	 */
	public int countBygetOsiServicesCertiOfIssuanceServicesByCaseId(
		String caseId);

	/**
	 * Caches the osi services certi of issuance in the entity cache if it is enabled.
	 *
	 * @param osiServicesCertiOfIssuance the osi services certi of issuance
	 */
	public void cacheResult(
		OSIServicesCertiOfIssuance osiServicesCertiOfIssuance);

	/**
	 * Caches the osi services certi of issuances in the entity cache if it is enabled.
	 *
	 * @param osiServicesCertiOfIssuances the osi services certi of issuances
	 */
	public void cacheResult(
		java.util.List<OSIServicesCertiOfIssuance> osiServicesCertiOfIssuances);

	/**
	 * Creates a new osi services certi of issuance with the primary key. Does not add the osi services certi of issuance to the database.
	 *
	 * @param oSIServicesCertiOfIssuanceId the primary key for the new osi services certi of issuance
	 * @return the new osi services certi of issuance
	 */
	public OSIServicesCertiOfIssuance create(long oSIServicesCertiOfIssuanceId);

	/**
	 * Removes the osi services certi of issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param oSIServicesCertiOfIssuanceId the primary key of the osi services certi of issuance
	 * @return the osi services certi of issuance that was removed
	 * @throws NoSuchOSIServicesCertiOfIssuanceException if a osi services certi of issuance with the primary key could not be found
	 */
	public OSIServicesCertiOfIssuance remove(long oSIServicesCertiOfIssuanceId)
		throws NoSuchOSIServicesCertiOfIssuanceException;

	public OSIServicesCertiOfIssuance updateImpl(
		OSIServicesCertiOfIssuance osiServicesCertiOfIssuance);

	/**
	 * Returns the osi services certi of issuance with the primary key or throws a <code>NoSuchOSIServicesCertiOfIssuanceException</code> if it could not be found.
	 *
	 * @param oSIServicesCertiOfIssuanceId the primary key of the osi services certi of issuance
	 * @return the osi services certi of issuance
	 * @throws NoSuchOSIServicesCertiOfIssuanceException if a osi services certi of issuance with the primary key could not be found
	 */
	public OSIServicesCertiOfIssuance findByPrimaryKey(
			long oSIServicesCertiOfIssuanceId)
		throws NoSuchOSIServicesCertiOfIssuanceException;

	/**
	 * Returns the osi services certi of issuance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param oSIServicesCertiOfIssuanceId the primary key of the osi services certi of issuance
	 * @return the osi services certi of issuance, or <code>null</code> if a osi services certi of issuance with the primary key could not be found
	 */
	public OSIServicesCertiOfIssuance fetchByPrimaryKey(
		long oSIServicesCertiOfIssuanceId);

	/**
	 * Returns all the osi services certi of issuances.
	 *
	 * @return the osi services certi of issuances
	 */
	public java.util.List<OSIServicesCertiOfIssuance> findAll();

	/**
	 * Returns a range of all the osi services certi of issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesCertiOfIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services certi of issuances
	 * @param end the upper bound of the range of osi services certi of issuances (not inclusive)
	 * @return the range of osi services certi of issuances
	 */
	public java.util.List<OSIServicesCertiOfIssuance> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the osi services certi of issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesCertiOfIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services certi of issuances
	 * @param end the upper bound of the range of osi services certi of issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services certi of issuances
	 */
	public java.util.List<OSIServicesCertiOfIssuance> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OSIServicesCertiOfIssuance> orderByComparator);

	/**
	 * Returns an ordered range of all the osi services certi of issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesCertiOfIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services certi of issuances
	 * @param end the upper bound of the range of osi services certi of issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services certi of issuances
	 */
	public java.util.List<OSIServicesCertiOfIssuance> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OSIServicesCertiOfIssuance> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi services certi of issuances from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi services certi of issuances.
	 *
	 * @return the number of osi services certi of issuances
	 */
	public int countAll();

}