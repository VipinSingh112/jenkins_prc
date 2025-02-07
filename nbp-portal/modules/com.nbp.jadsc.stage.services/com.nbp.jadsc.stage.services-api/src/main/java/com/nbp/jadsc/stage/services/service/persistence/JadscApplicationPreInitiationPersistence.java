/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jadsc.stage.services.exception.NoSuchJadscApplicationPreInitiationException;
import com.nbp.jadsc.stage.services.model.JadscApplicationPreInitiation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jadsc application pre initiation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JadscApplicationPreInitiationUtil
 * @generated
 */
@ProviderType
public interface JadscApplicationPreInitiationPersistence
	extends BasePersistence<JadscApplicationPreInitiation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JadscApplicationPreInitiationUtil} to access the jadsc application pre initiation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the jadsc application pre initiation where caseId = &#63; or throws a <code>NoSuchJadscApplicationPreInitiationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc application pre initiation
	 * @throws NoSuchJadscApplicationPreInitiationException if a matching jadsc application pre initiation could not be found
	 */
	public JadscApplicationPreInitiation findBygetJadsc_PI_CI(String caseId)
		throws NoSuchJadscApplicationPreInitiationException;

	/**
	 * Returns the jadsc application pre initiation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc application pre initiation, or <code>null</code> if a matching jadsc application pre initiation could not be found
	 */
	public JadscApplicationPreInitiation fetchBygetJadsc_PI_CI(String caseId);

	/**
	 * Returns the jadsc application pre initiation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application pre initiation, or <code>null</code> if a matching jadsc application pre initiation could not be found
	 */
	public JadscApplicationPreInitiation fetchBygetJadsc_PI_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the jadsc application pre initiation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jadsc application pre initiation that was removed
	 */
	public JadscApplicationPreInitiation removeBygetJadsc_PI_CI(String caseId)
		throws NoSuchJadscApplicationPreInitiationException;

	/**
	 * Returns the number of jadsc application pre initiations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jadsc application pre initiations
	 */
	public int countBygetJadsc_PI_CI(String caseId);

	/**
	 * Returns all the jadsc application pre initiations where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @return the matching jadsc application pre initiations
	 */
	public java.util.List<JadscApplicationPreInitiation> findBygetJadsc_By_PI(
		String outcome);

	/**
	 * Returns a range of all the jadsc application pre initiations where outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param outcome the outcome
	 * @param start the lower bound of the range of jadsc application pre initiations
	 * @param end the upper bound of the range of jadsc application pre initiations (not inclusive)
	 * @return the range of matching jadsc application pre initiations
	 */
	public java.util.List<JadscApplicationPreInitiation> findBygetJadsc_By_PI(
		String outcome, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc application pre initiations where outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param outcome the outcome
	 * @param start the lower bound of the range of jadsc application pre initiations
	 * @param end the upper bound of the range of jadsc application pre initiations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc application pre initiations
	 */
	public java.util.List<JadscApplicationPreInitiation> findBygetJadsc_By_PI(
		String outcome, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JadscApplicationPreInitiation> orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc application pre initiations where outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param outcome the outcome
	 * @param start the lower bound of the range of jadsc application pre initiations
	 * @param end the upper bound of the range of jadsc application pre initiations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc application pre initiations
	 */
	public java.util.List<JadscApplicationPreInitiation> findBygetJadsc_By_PI(
		String outcome, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JadscApplicationPreInitiation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc application pre initiation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application pre initiation
	 * @throws NoSuchJadscApplicationPreInitiationException if a matching jadsc application pre initiation could not be found
	 */
	public JadscApplicationPreInitiation findBygetJadsc_By_PI_First(
			String outcome,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscApplicationPreInitiation> orderByComparator)
		throws NoSuchJadscApplicationPreInitiationException;

	/**
	 * Returns the first jadsc application pre initiation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application pre initiation, or <code>null</code> if a matching jadsc application pre initiation could not be found
	 */
	public JadscApplicationPreInitiation fetchBygetJadsc_By_PI_First(
		String outcome,
		com.liferay.portal.kernel.util.OrderByComparator
			<JadscApplicationPreInitiation> orderByComparator);

	/**
	 * Returns the last jadsc application pre initiation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application pre initiation
	 * @throws NoSuchJadscApplicationPreInitiationException if a matching jadsc application pre initiation could not be found
	 */
	public JadscApplicationPreInitiation findBygetJadsc_By_PI_Last(
			String outcome,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscApplicationPreInitiation> orderByComparator)
		throws NoSuchJadscApplicationPreInitiationException;

	/**
	 * Returns the last jadsc application pre initiation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application pre initiation, or <code>null</code> if a matching jadsc application pre initiation could not be found
	 */
	public JadscApplicationPreInitiation fetchBygetJadsc_By_PI_Last(
		String outcome,
		com.liferay.portal.kernel.util.OrderByComparator
			<JadscApplicationPreInitiation> orderByComparator);

	/**
	 * Returns the jadsc application pre initiations before and after the current jadsc application pre initiation in the ordered set where outcome = &#63;.
	 *
	 * @param jadscAppliPreInitiationId the primary key of the current jadsc application pre initiation
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application pre initiation
	 * @throws NoSuchJadscApplicationPreInitiationException if a jadsc application pre initiation with the primary key could not be found
	 */
	public JadscApplicationPreInitiation[] findBygetJadsc_By_PI_PrevAndNext(
			long jadscAppliPreInitiationId, String outcome,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscApplicationPreInitiation> orderByComparator)
		throws NoSuchJadscApplicationPreInitiationException;

	/**
	 * Removes all the jadsc application pre initiations where outcome = &#63; from the database.
	 *
	 * @param outcome the outcome
	 */
	public void removeBygetJadsc_By_PI(String outcome);

	/**
	 * Returns the number of jadsc application pre initiations where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @return the number of matching jadsc application pre initiations
	 */
	public int countBygetJadsc_By_PI(String outcome);

	/**
	 * Caches the jadsc application pre initiation in the entity cache if it is enabled.
	 *
	 * @param jadscApplicationPreInitiation the jadsc application pre initiation
	 */
	public void cacheResult(
		JadscApplicationPreInitiation jadscApplicationPreInitiation);

	/**
	 * Caches the jadsc application pre initiations in the entity cache if it is enabled.
	 *
	 * @param jadscApplicationPreInitiations the jadsc application pre initiations
	 */
	public void cacheResult(
		java.util.List<JadscApplicationPreInitiation>
			jadscApplicationPreInitiations);

	/**
	 * Creates a new jadsc application pre initiation with the primary key. Does not add the jadsc application pre initiation to the database.
	 *
	 * @param jadscAppliPreInitiationId the primary key for the new jadsc application pre initiation
	 * @return the new jadsc application pre initiation
	 */
	public JadscApplicationPreInitiation create(long jadscAppliPreInitiationId);

	/**
	 * Removes the jadsc application pre initiation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscAppliPreInitiationId the primary key of the jadsc application pre initiation
	 * @return the jadsc application pre initiation that was removed
	 * @throws NoSuchJadscApplicationPreInitiationException if a jadsc application pre initiation with the primary key could not be found
	 */
	public JadscApplicationPreInitiation remove(long jadscAppliPreInitiationId)
		throws NoSuchJadscApplicationPreInitiationException;

	public JadscApplicationPreInitiation updateImpl(
		JadscApplicationPreInitiation jadscApplicationPreInitiation);

	/**
	 * Returns the jadsc application pre initiation with the primary key or throws a <code>NoSuchJadscApplicationPreInitiationException</code> if it could not be found.
	 *
	 * @param jadscAppliPreInitiationId the primary key of the jadsc application pre initiation
	 * @return the jadsc application pre initiation
	 * @throws NoSuchJadscApplicationPreInitiationException if a jadsc application pre initiation with the primary key could not be found
	 */
	public JadscApplicationPreInitiation findByPrimaryKey(
			long jadscAppliPreInitiationId)
		throws NoSuchJadscApplicationPreInitiationException;

	/**
	 * Returns the jadsc application pre initiation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscAppliPreInitiationId the primary key of the jadsc application pre initiation
	 * @return the jadsc application pre initiation, or <code>null</code> if a jadsc application pre initiation with the primary key could not be found
	 */
	public JadscApplicationPreInitiation fetchByPrimaryKey(
		long jadscAppliPreInitiationId);

	/**
	 * Returns all the jadsc application pre initiations.
	 *
	 * @return the jadsc application pre initiations
	 */
	public java.util.List<JadscApplicationPreInitiation> findAll();

	/**
	 * Returns a range of all the jadsc application pre initiations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application pre initiations
	 * @param end the upper bound of the range of jadsc application pre initiations (not inclusive)
	 * @return the range of jadsc application pre initiations
	 */
	public java.util.List<JadscApplicationPreInitiation> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the jadsc application pre initiations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application pre initiations
	 * @param end the upper bound of the range of jadsc application pre initiations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc application pre initiations
	 */
	public java.util.List<JadscApplicationPreInitiation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JadscApplicationPreInitiation> orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc application pre initiations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application pre initiations
	 * @param end the upper bound of the range of jadsc application pre initiations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc application pre initiations
	 */
	public java.util.List<JadscApplicationPreInitiation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JadscApplicationPreInitiation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jadsc application pre initiations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jadsc application pre initiations.
	 *
	 * @return the number of jadsc application pre initiations
	 */
	public int countAll();

}