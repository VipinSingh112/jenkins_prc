/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisLicensePreCondtionsException;
import com.npm.cannabis.application.stages.services.model.CannabisLicensePreCondtions;
import com.npm.cannabis.application.stages.services.model.CannabisLicensePreCondtionsTable;
import com.npm.cannabis.application.stages.services.model.impl.CannabisLicensePreCondtionsImpl;
import com.npm.cannabis.application.stages.services.model.impl.CannabisLicensePreCondtionsModelImpl;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisLicensePreCondtionsPersistence;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisLicensePreCondtionsUtil;
import com.npm.cannabis.application.stages.services.service.persistence.impl.constants.CANNABIS_STAGESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the cannabis license pre condtions service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CannabisLicensePreCondtionsPersistence.class)
public class CannabisLicensePreCondtionsPersistenceImpl
	extends BasePersistenceImpl<CannabisLicensePreCondtions>
	implements CannabisLicensePreCondtionsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CannabisLicensePreCondtionsUtil</code> to access the cannabis license pre condtions persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CannabisLicensePreCondtionsImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetCI_CAI;
	private FinderPath _finderPathWithoutPaginationFindBygetCI_CAI;
	private FinderPath _finderPathCountBygetCI_CAI;

	/**
	 * Returns all the cannabis license pre condtionses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis license pre condtionses
	 */
	@Override
	public List<CannabisLicensePreCondtions> findBygetCI_CAI(
		long cannabisApplicationId) {

		return findBygetCI_CAI(
			cannabisApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis license pre condtionses where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @return the range of matching cannabis license pre condtionses
	 */
	@Override
	public List<CannabisLicensePreCondtions> findBygetCI_CAI(
		long cannabisApplicationId, int start, int end) {

		return findBygetCI_CAI(cannabisApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis license pre condtionses where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis license pre condtionses
	 */
	@Override
	public List<CannabisLicensePreCondtions> findBygetCI_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisLicensePreCondtions> orderByComparator) {

		return findBygetCI_CAI(
			cannabisApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis license pre condtionses where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis license pre condtionses
	 */
	@Override
	public List<CannabisLicensePreCondtions> findBygetCI_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisLicensePreCondtions> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCI_CAI;
				finderArgs = new Object[] {cannabisApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCI_CAI;
			finderArgs = new Object[] {
				cannabisApplicationId, start, end, orderByComparator
			};
		}

		List<CannabisLicensePreCondtions> list = null;

		if (useFinderCache) {
			list = (List<CannabisLicensePreCondtions>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisLicensePreCondtions cannabisLicensePreCondtions :
						list) {

					if (cannabisApplicationId !=
							cannabisLicensePreCondtions.
								getCannabisApplicationId()) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_CANNABISLICENSEPRECONDTIONS_WHERE);

			sb.append(_FINDER_COLUMN_GETCI_CAI_CANNABISAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CannabisLicensePreCondtionsModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

				list = (List<CannabisLicensePreCondtions>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first cannabis license pre condtions in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a matching cannabis license pre condtions could not be found
	 */
	@Override
	public CannabisLicensePreCondtions findBygetCI_CAI_First(
			long cannabisApplicationId,
			OrderByComparator<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException {

		CannabisLicensePreCondtions cannabisLicensePreCondtions =
			fetchBygetCI_CAI_First(cannabisApplicationId, orderByComparator);

		if (cannabisLicensePreCondtions != null) {
			return cannabisLicensePreCondtions;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("cannabisApplicationId=");
		sb.append(cannabisApplicationId);

		sb.append("}");

		throw new NoSuchCannabisLicensePreCondtionsException(sb.toString());
	}

	/**
	 * Returns the first cannabis license pre condtions in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis license pre condtions, or <code>null</code> if a matching cannabis license pre condtions could not be found
	 */
	@Override
	public CannabisLicensePreCondtions fetchBygetCI_CAI_First(
		long cannabisApplicationId,
		OrderByComparator<CannabisLicensePreCondtions> orderByComparator) {

		List<CannabisLicensePreCondtions> list = findBygetCI_CAI(
			cannabisApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis license pre condtions in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a matching cannabis license pre condtions could not be found
	 */
	@Override
	public CannabisLicensePreCondtions findBygetCI_CAI_Last(
			long cannabisApplicationId,
			OrderByComparator<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException {

		CannabisLicensePreCondtions cannabisLicensePreCondtions =
			fetchBygetCI_CAI_Last(cannabisApplicationId, orderByComparator);

		if (cannabisLicensePreCondtions != null) {
			return cannabisLicensePreCondtions;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("cannabisApplicationId=");
		sb.append(cannabisApplicationId);

		sb.append("}");

		throw new NoSuchCannabisLicensePreCondtionsException(sb.toString());
	}

	/**
	 * Returns the last cannabis license pre condtions in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis license pre condtions, or <code>null</code> if a matching cannabis license pre condtions could not be found
	 */
	@Override
	public CannabisLicensePreCondtions fetchBygetCI_CAI_Last(
		long cannabisApplicationId,
		OrderByComparator<CannabisLicensePreCondtions> orderByComparator) {

		int count = countBygetCI_CAI(cannabisApplicationId);

		if (count == 0) {
			return null;
		}

		List<CannabisLicensePreCondtions> list = findBygetCI_CAI(
			cannabisApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis license pre condtionses before and after the current cannabis license pre condtions in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisPreconditionsId the primary key of the current cannabis license pre condtions
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a cannabis license pre condtions with the primary key could not be found
	 */
	@Override
	public CannabisLicensePreCondtions[] findBygetCI_CAI_PrevAndNext(
			long cannabisPreconditionsId, long cannabisApplicationId,
			OrderByComparator<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException {

		CannabisLicensePreCondtions cannabisLicensePreCondtions =
			findByPrimaryKey(cannabisPreconditionsId);

		Session session = null;

		try {
			session = openSession();

			CannabisLicensePreCondtions[] array =
				new CannabisLicensePreCondtionsImpl[3];

			array[0] = getBygetCI_CAI_PrevAndNext(
				session, cannabisLicensePreCondtions, cannabisApplicationId,
				orderByComparator, true);

			array[1] = cannabisLicensePreCondtions;

			array[2] = getBygetCI_CAI_PrevAndNext(
				session, cannabisLicensePreCondtions, cannabisApplicationId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CannabisLicensePreCondtions getBygetCI_CAI_PrevAndNext(
		Session session,
		CannabisLicensePreCondtions cannabisLicensePreCondtions,
		long cannabisApplicationId,
		OrderByComparator<CannabisLicensePreCondtions> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_CANNABISLICENSEPRECONDTIONS_WHERE);

		sb.append(_FINDER_COLUMN_GETCI_CAI_CANNABISAPPLICATIONID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(CannabisLicensePreCondtionsModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(cannabisApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisLicensePreCondtions)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisLicensePreCondtions> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis license pre condtionses where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	@Override
	public void removeBygetCI_CAI(long cannabisApplicationId) {
		for (CannabisLicensePreCondtions cannabisLicensePreCondtions :
				findBygetCI_CAI(
					cannabisApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(cannabisLicensePreCondtions);
		}
	}

	/**
	 * Returns the number of cannabis license pre condtionses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis license pre condtionses
	 */
	@Override
	public int countBygetCI_CAI(long cannabisApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCI_CAI;

		Object[] finderArgs = new Object[] {cannabisApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISLICENSEPRECONDTIONS_WHERE);

			sb.append(_FINDER_COLUMN_GETCI_CAI_CANNABISAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETCI_CAI_CANNABISAPPLICATIONID_2 =
			"cannabisLicensePreCondtions.cannabisApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetCI_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetCI_CaseId;
	private FinderPath _finderPathCountBygetCI_CaseId;

	/**
	 * Returns all the cannabis license pre condtionses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis license pre condtionses
	 */
	@Override
	public List<CannabisLicensePreCondtions> findBygetCI_CaseId(String caseId) {
		return findBygetCI_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis license pre condtionses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @return the range of matching cannabis license pre condtionses
	 */
	@Override
	public List<CannabisLicensePreCondtions> findBygetCI_CaseId(
		String caseId, int start, int end) {

		return findBygetCI_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis license pre condtionses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis license pre condtionses
	 */
	@Override
	public List<CannabisLicensePreCondtions> findBygetCI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<CannabisLicensePreCondtions> orderByComparator) {

		return findBygetCI_CaseId(caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis license pre condtionses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis license pre condtionses
	 */
	@Override
	public List<CannabisLicensePreCondtions> findBygetCI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<CannabisLicensePreCondtions> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCI_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCI_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<CannabisLicensePreCondtions> list = null;

		if (useFinderCache) {
			list = (List<CannabisLicensePreCondtions>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisLicensePreCondtions cannabisLicensePreCondtions :
						list) {

					if (!caseId.equals(
							cannabisLicensePreCondtions.getCaseId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_CANNABISLICENSEPRECONDTIONS_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCI_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CannabisLicensePreCondtionsModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				list = (List<CannabisLicensePreCondtions>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first cannabis license pre condtions in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a matching cannabis license pre condtions could not be found
	 */
	@Override
	public CannabisLicensePreCondtions findBygetCI_CaseId_First(
			String caseId,
			OrderByComparator<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException {

		CannabisLicensePreCondtions cannabisLicensePreCondtions =
			fetchBygetCI_CaseId_First(caseId, orderByComparator);

		if (cannabisLicensePreCondtions != null) {
			return cannabisLicensePreCondtions;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchCannabisLicensePreCondtionsException(sb.toString());
	}

	/**
	 * Returns the first cannabis license pre condtions in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis license pre condtions, or <code>null</code> if a matching cannabis license pre condtions could not be found
	 */
	@Override
	public CannabisLicensePreCondtions fetchBygetCI_CaseId_First(
		String caseId,
		OrderByComparator<CannabisLicensePreCondtions> orderByComparator) {

		List<CannabisLicensePreCondtions> list = findBygetCI_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis license pre condtions in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a matching cannabis license pre condtions could not be found
	 */
	@Override
	public CannabisLicensePreCondtions findBygetCI_CaseId_Last(
			String caseId,
			OrderByComparator<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException {

		CannabisLicensePreCondtions cannabisLicensePreCondtions =
			fetchBygetCI_CaseId_Last(caseId, orderByComparator);

		if (cannabisLicensePreCondtions != null) {
			return cannabisLicensePreCondtions;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchCannabisLicensePreCondtionsException(sb.toString());
	}

	/**
	 * Returns the last cannabis license pre condtions in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis license pre condtions, or <code>null</code> if a matching cannabis license pre condtions could not be found
	 */
	@Override
	public CannabisLicensePreCondtions fetchBygetCI_CaseId_Last(
		String caseId,
		OrderByComparator<CannabisLicensePreCondtions> orderByComparator) {

		int count = countBygetCI_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<CannabisLicensePreCondtions> list = findBygetCI_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis license pre condtionses before and after the current cannabis license pre condtions in the ordered set where caseId = &#63;.
	 *
	 * @param cannabisPreconditionsId the primary key of the current cannabis license pre condtions
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a cannabis license pre condtions with the primary key could not be found
	 */
	@Override
	public CannabisLicensePreCondtions[] findBygetCI_CaseId_PrevAndNext(
			long cannabisPreconditionsId, String caseId,
			OrderByComparator<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException {

		caseId = Objects.toString(caseId, "");

		CannabisLicensePreCondtions cannabisLicensePreCondtions =
			findByPrimaryKey(cannabisPreconditionsId);

		Session session = null;

		try {
			session = openSession();

			CannabisLicensePreCondtions[] array =
				new CannabisLicensePreCondtionsImpl[3];

			array[0] = getBygetCI_CaseId_PrevAndNext(
				session, cannabisLicensePreCondtions, caseId, orderByComparator,
				true);

			array[1] = cannabisLicensePreCondtions;

			array[2] = getBygetCI_CaseId_PrevAndNext(
				session, cannabisLicensePreCondtions, caseId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CannabisLicensePreCondtions getBygetCI_CaseId_PrevAndNext(
		Session session,
		CannabisLicensePreCondtions cannabisLicensePreCondtions, String caseId,
		OrderByComparator<CannabisLicensePreCondtions> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_CANNABISLICENSEPRECONDTIONS_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCI_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETCI_CASEID_CASEID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(CannabisLicensePreCondtionsModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisLicensePreCondtions)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisLicensePreCondtions> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis license pre condtionses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetCI_CaseId(String caseId) {
		for (CannabisLicensePreCondtions cannabisLicensePreCondtions :
				findBygetCI_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cannabisLicensePreCondtions);
		}
	}

	/**
	 * Returns the number of cannabis license pre condtionses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis license pre condtionses
	 */
	@Override
	public int countBygetCI_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetCI_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISLICENSEPRECONDTIONS_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCI_CASEID_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETCI_CASEID_CASEID_2 =
		"cannabisLicensePreCondtions.caseId = ?";

	private static final String _FINDER_COLUMN_GETCI_CASEID_CASEID_3 =
		"(cannabisLicensePreCondtions.caseId IS NULL OR cannabisLicensePreCondtions.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetCI_Status;
	private FinderPath _finderPathWithoutPaginationFindBygetCI_Status;
	private FinderPath _finderPathCountBygetCI_Status;

	/**
	 * Returns all the cannabis license pre condtionses where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching cannabis license pre condtionses
	 */
	@Override
	public List<CannabisLicensePreCondtions> findBygetCI_Status(String status) {
		return findBygetCI_Status(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis license pre condtionses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @return the range of matching cannabis license pre condtionses
	 */
	@Override
	public List<CannabisLicensePreCondtions> findBygetCI_Status(
		String status, int start, int end) {

		return findBygetCI_Status(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis license pre condtionses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis license pre condtionses
	 */
	@Override
	public List<CannabisLicensePreCondtions> findBygetCI_Status(
		String status, int start, int end,
		OrderByComparator<CannabisLicensePreCondtions> orderByComparator) {

		return findBygetCI_Status(status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis license pre condtionses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis license pre condtionses
	 */
	@Override
	public List<CannabisLicensePreCondtions> findBygetCI_Status(
		String status, int start, int end,
		OrderByComparator<CannabisLicensePreCondtions> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCI_Status;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCI_Status;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<CannabisLicensePreCondtions> list = null;

		if (useFinderCache) {
			list = (List<CannabisLicensePreCondtions>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisLicensePreCondtions cannabisLicensePreCondtions :
						list) {

					if (!status.equals(
							cannabisLicensePreCondtions.getStatus())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_CANNABISLICENSEPRECONDTIONS_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETCI_STATUS_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CannabisLicensePreCondtionsModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				list = (List<CannabisLicensePreCondtions>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first cannabis license pre condtions in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a matching cannabis license pre condtions could not be found
	 */
	@Override
	public CannabisLicensePreCondtions findBygetCI_Status_First(
			String status,
			OrderByComparator<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException {

		CannabisLicensePreCondtions cannabisLicensePreCondtions =
			fetchBygetCI_Status_First(status, orderByComparator);

		if (cannabisLicensePreCondtions != null) {
			return cannabisLicensePreCondtions;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchCannabisLicensePreCondtionsException(sb.toString());
	}

	/**
	 * Returns the first cannabis license pre condtions in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis license pre condtions, or <code>null</code> if a matching cannabis license pre condtions could not be found
	 */
	@Override
	public CannabisLicensePreCondtions fetchBygetCI_Status_First(
		String status,
		OrderByComparator<CannabisLicensePreCondtions> orderByComparator) {

		List<CannabisLicensePreCondtions> list = findBygetCI_Status(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis license pre condtions in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a matching cannabis license pre condtions could not be found
	 */
	@Override
	public CannabisLicensePreCondtions findBygetCI_Status_Last(
			String status,
			OrderByComparator<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException {

		CannabisLicensePreCondtions cannabisLicensePreCondtions =
			fetchBygetCI_Status_Last(status, orderByComparator);

		if (cannabisLicensePreCondtions != null) {
			return cannabisLicensePreCondtions;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchCannabisLicensePreCondtionsException(sb.toString());
	}

	/**
	 * Returns the last cannabis license pre condtions in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis license pre condtions, or <code>null</code> if a matching cannabis license pre condtions could not be found
	 */
	@Override
	public CannabisLicensePreCondtions fetchBygetCI_Status_Last(
		String status,
		OrderByComparator<CannabisLicensePreCondtions> orderByComparator) {

		int count = countBygetCI_Status(status);

		if (count == 0) {
			return null;
		}

		List<CannabisLicensePreCondtions> list = findBygetCI_Status(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis license pre condtionses before and after the current cannabis license pre condtions in the ordered set where status = &#63;.
	 *
	 * @param cannabisPreconditionsId the primary key of the current cannabis license pre condtions
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a cannabis license pre condtions with the primary key could not be found
	 */
	@Override
	public CannabisLicensePreCondtions[] findBygetCI_Status_PrevAndNext(
			long cannabisPreconditionsId, String status,
			OrderByComparator<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException {

		status = Objects.toString(status, "");

		CannabisLicensePreCondtions cannabisLicensePreCondtions =
			findByPrimaryKey(cannabisPreconditionsId);

		Session session = null;

		try {
			session = openSession();

			CannabisLicensePreCondtions[] array =
				new CannabisLicensePreCondtionsImpl[3];

			array[0] = getBygetCI_Status_PrevAndNext(
				session, cannabisLicensePreCondtions, status, orderByComparator,
				true);

			array[1] = cannabisLicensePreCondtions;

			array[2] = getBygetCI_Status_PrevAndNext(
				session, cannabisLicensePreCondtions, status, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CannabisLicensePreCondtions getBygetCI_Status_PrevAndNext(
		Session session,
		CannabisLicensePreCondtions cannabisLicensePreCondtions, String status,
		OrderByComparator<CannabisLicensePreCondtions> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_CANNABISLICENSEPRECONDTIONS_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCI_STATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETCI_STATUS_STATUS_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(CannabisLicensePreCondtionsModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisLicensePreCondtions)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisLicensePreCondtions> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis license pre condtionses where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetCI_Status(String status) {
		for (CannabisLicensePreCondtions cannabisLicensePreCondtions :
				findBygetCI_Status(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cannabisLicensePreCondtions);
		}
	}

	/**
	 * Returns the number of cannabis license pre condtionses where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching cannabis license pre condtionses
	 */
	@Override
	public int countBygetCI_Status(String status) {
		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetCI_Status;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISLICENSEPRECONDTIONS_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETCI_STATUS_STATUS_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETCI_STATUS_STATUS_2 =
		"cannabisLicensePreCondtions.status = ?";

	private static final String _FINDER_COLUMN_GETCI_STATUS_STATUS_3 =
		"(cannabisLicensePreCondtions.status IS NULL OR cannabisLicensePreCondtions.status = '')";

	private FinderPath _finderPathWithPaginationFindBygetCI_CaseIdStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetCI_CaseIdStatus;
	private FinderPath _finderPathCountBygetCI_CaseIdStatus;

	/**
	 * Returns all the cannabis license pre condtionses where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching cannabis license pre condtionses
	 */
	@Override
	public List<CannabisLicensePreCondtions> findBygetCI_CaseIdStatus(
		String status, String caseId) {

		return findBygetCI_CaseIdStatus(
			status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis license pre condtionses where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @return the range of matching cannabis license pre condtionses
	 */
	@Override
	public List<CannabisLicensePreCondtions> findBygetCI_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return findBygetCI_CaseIdStatus(status, caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis license pre condtionses where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis license pre condtionses
	 */
	@Override
	public List<CannabisLicensePreCondtions> findBygetCI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<CannabisLicensePreCondtions> orderByComparator) {

		return findBygetCI_CaseIdStatus(
			status, caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis license pre condtionses where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis license pre condtionses
	 */
	@Override
	public List<CannabisLicensePreCondtions> findBygetCI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<CannabisLicensePreCondtions> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetCI_CaseIdStatus;
				finderArgs = new Object[] {status, caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCI_CaseIdStatus;
			finderArgs = new Object[] {
				status, caseId, start, end, orderByComparator
			};
		}

		List<CannabisLicensePreCondtions> list = null;

		if (useFinderCache) {
			list = (List<CannabisLicensePreCondtions>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisLicensePreCondtions cannabisLicensePreCondtions :
						list) {

					if (!status.equals(
							cannabisLicensePreCondtions.getStatus()) ||
						!caseId.equals(
							cannabisLicensePreCondtions.getCaseId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_CANNABISLICENSEPRECONDTIONS_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CannabisLicensePreCondtionsModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				list = (List<CannabisLicensePreCondtions>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first cannabis license pre condtions in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a matching cannabis license pre condtions could not be found
	 */
	@Override
	public CannabisLicensePreCondtions findBygetCI_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException {

		CannabisLicensePreCondtions cannabisLicensePreCondtions =
			fetchBygetCI_CaseIdStatus_First(status, caseId, orderByComparator);

		if (cannabisLicensePreCondtions != null) {
			return cannabisLicensePreCondtions;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchCannabisLicensePreCondtionsException(sb.toString());
	}

	/**
	 * Returns the first cannabis license pre condtions in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis license pre condtions, or <code>null</code> if a matching cannabis license pre condtions could not be found
	 */
	@Override
	public CannabisLicensePreCondtions fetchBygetCI_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<CannabisLicensePreCondtions> orderByComparator) {

		List<CannabisLicensePreCondtions> list = findBygetCI_CaseIdStatus(
			status, caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis license pre condtions in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a matching cannabis license pre condtions could not be found
	 */
	@Override
	public CannabisLicensePreCondtions findBygetCI_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException {

		CannabisLicensePreCondtions cannabisLicensePreCondtions =
			fetchBygetCI_CaseIdStatus_Last(status, caseId, orderByComparator);

		if (cannabisLicensePreCondtions != null) {
			return cannabisLicensePreCondtions;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchCannabisLicensePreCondtionsException(sb.toString());
	}

	/**
	 * Returns the last cannabis license pre condtions in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis license pre condtions, or <code>null</code> if a matching cannabis license pre condtions could not be found
	 */
	@Override
	public CannabisLicensePreCondtions fetchBygetCI_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<CannabisLicensePreCondtions> orderByComparator) {

		int count = countBygetCI_CaseIdStatus(status, caseId);

		if (count == 0) {
			return null;
		}

		List<CannabisLicensePreCondtions> list = findBygetCI_CaseIdStatus(
			status, caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis license pre condtionses before and after the current cannabis license pre condtions in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param cannabisPreconditionsId the primary key of the current cannabis license pre condtions
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a cannabis license pre condtions with the primary key could not be found
	 */
	@Override
	public CannabisLicensePreCondtions[] findBygetCI_CaseIdStatus_PrevAndNext(
			long cannabisPreconditionsId, String status, String caseId,
			OrderByComparator<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		CannabisLicensePreCondtions cannabisLicensePreCondtions =
			findByPrimaryKey(cannabisPreconditionsId);

		Session session = null;

		try {
			session = openSession();

			CannabisLicensePreCondtions[] array =
				new CannabisLicensePreCondtionsImpl[3];

			array[0] = getBygetCI_CaseIdStatus_PrevAndNext(
				session, cannabisLicensePreCondtions, status, caseId,
				orderByComparator, true);

			array[1] = cannabisLicensePreCondtions;

			array[2] = getBygetCI_CaseIdStatus_PrevAndNext(
				session, cannabisLicensePreCondtions, status, caseId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CannabisLicensePreCondtions getBygetCI_CaseIdStatus_PrevAndNext(
		Session session,
		CannabisLicensePreCondtions cannabisLicensePreCondtions, String status,
		String caseId,
		OrderByComparator<CannabisLicensePreCondtions> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_CANNABISLICENSEPRECONDTIONS_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_STATUS_2);
		}

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_CASEID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(CannabisLicensePreCondtionsModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisLicensePreCondtions)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisLicensePreCondtions> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis license pre condtionses where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetCI_CaseIdStatus(String status, String caseId) {
		for (CannabisLicensePreCondtions cannabisLicensePreCondtions :
				findBygetCI_CaseIdStatus(
					status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(cannabisLicensePreCondtions);
		}
	}

	/**
	 * Returns the number of cannabis license pre condtionses where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching cannabis license pre condtionses
	 */
	@Override
	public int countBygetCI_CaseIdStatus(String status, String caseId) {
		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetCI_CaseIdStatus;

		Object[] finderArgs = new Object[] {status, caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISLICENSEPRECONDTIONS_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETCI_CASEIDSTATUS_STATUS_2 =
		"cannabisLicensePreCondtions.status = ? AND ";

	private static final String _FINDER_COLUMN_GETCI_CASEIDSTATUS_STATUS_3 =
		"(cannabisLicensePreCondtions.status IS NULL OR cannabisLicensePreCondtions.status = '') AND ";

	private static final String _FINDER_COLUMN_GETCI_CASEIDSTATUS_CASEID_2 =
		"cannabisLicensePreCondtions.caseId = ?";

	private static final String _FINDER_COLUMN_GETCI_CASEIDSTATUS_CASEID_3 =
		"(cannabisLicensePreCondtions.caseId IS NULL OR cannabisLicensePreCondtions.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetCI_CaseIdLicenseType;
	private FinderPath
		_finderPathWithoutPaginationFindBygetCI_CaseIdLicenseType;
	private FinderPath _finderPathCountBygetCI_CaseIdLicenseType;

	/**
	 * Returns all the cannabis license pre condtionses where caseId = &#63; and licenseType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param licenseType the license type
	 * @return the matching cannabis license pre condtionses
	 */
	@Override
	public List<CannabisLicensePreCondtions> findBygetCI_CaseIdLicenseType(
		String caseId, String licenseType) {

		return findBygetCI_CaseIdLicenseType(
			caseId, licenseType, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis license pre condtionses where caseId = &#63; and licenseType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param licenseType the license type
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @return the range of matching cannabis license pre condtionses
	 */
	@Override
	public List<CannabisLicensePreCondtions> findBygetCI_CaseIdLicenseType(
		String caseId, String licenseType, int start, int end) {

		return findBygetCI_CaseIdLicenseType(
			caseId, licenseType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis license pre condtionses where caseId = &#63; and licenseType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param licenseType the license type
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis license pre condtionses
	 */
	@Override
	public List<CannabisLicensePreCondtions> findBygetCI_CaseIdLicenseType(
		String caseId, String licenseType, int start, int end,
		OrderByComparator<CannabisLicensePreCondtions> orderByComparator) {

		return findBygetCI_CaseIdLicenseType(
			caseId, licenseType, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis license pre condtionses where caseId = &#63; and licenseType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param licenseType the license type
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis license pre condtionses
	 */
	@Override
	public List<CannabisLicensePreCondtions> findBygetCI_CaseIdLicenseType(
		String caseId, String licenseType, int start, int end,
		OrderByComparator<CannabisLicensePreCondtions> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		licenseType = Objects.toString(licenseType, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetCI_CaseIdLicenseType;
				finderArgs = new Object[] {caseId, licenseType};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCI_CaseIdLicenseType;
			finderArgs = new Object[] {
				caseId, licenseType, start, end, orderByComparator
			};
		}

		List<CannabisLicensePreCondtions> list = null;

		if (useFinderCache) {
			list = (List<CannabisLicensePreCondtions>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisLicensePreCondtions cannabisLicensePreCondtions :
						list) {

					if (!caseId.equals(
							cannabisLicensePreCondtions.getCaseId()) ||
						!licenseType.equals(
							cannabisLicensePreCondtions.getLicenseType())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_CANNABISLICENSEPRECONDTIONS_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_CASEIDLICENSETYPE_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCI_CASEIDLICENSETYPE_CASEID_2);
			}

			boolean bindLicenseType = false;

			if (licenseType.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_CASEIDLICENSETYPE_LICENSETYPE_3);
			}
			else {
				bindLicenseType = true;

				sb.append(_FINDER_COLUMN_GETCI_CASEIDLICENSETYPE_LICENSETYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CannabisLicensePreCondtionsModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				if (bindLicenseType) {
					queryPos.add(licenseType);
				}

				list = (List<CannabisLicensePreCondtions>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first cannabis license pre condtions in the ordered set where caseId = &#63; and licenseType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param licenseType the license type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a matching cannabis license pre condtions could not be found
	 */
	@Override
	public CannabisLicensePreCondtions findBygetCI_CaseIdLicenseType_First(
			String caseId, String licenseType,
			OrderByComparator<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException {

		CannabisLicensePreCondtions cannabisLicensePreCondtions =
			fetchBygetCI_CaseIdLicenseType_First(
				caseId, licenseType, orderByComparator);

		if (cannabisLicensePreCondtions != null) {
			return cannabisLicensePreCondtions;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append(", licenseType=");
		sb.append(licenseType);

		sb.append("}");

		throw new NoSuchCannabisLicensePreCondtionsException(sb.toString());
	}

	/**
	 * Returns the first cannabis license pre condtions in the ordered set where caseId = &#63; and licenseType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param licenseType the license type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis license pre condtions, or <code>null</code> if a matching cannabis license pre condtions could not be found
	 */
	@Override
	public CannabisLicensePreCondtions fetchBygetCI_CaseIdLicenseType_First(
		String caseId, String licenseType,
		OrderByComparator<CannabisLicensePreCondtions> orderByComparator) {

		List<CannabisLicensePreCondtions> list = findBygetCI_CaseIdLicenseType(
			caseId, licenseType, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis license pre condtions in the ordered set where caseId = &#63; and licenseType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param licenseType the license type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a matching cannabis license pre condtions could not be found
	 */
	@Override
	public CannabisLicensePreCondtions findBygetCI_CaseIdLicenseType_Last(
			String caseId, String licenseType,
			OrderByComparator<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException {

		CannabisLicensePreCondtions cannabisLicensePreCondtions =
			fetchBygetCI_CaseIdLicenseType_Last(
				caseId, licenseType, orderByComparator);

		if (cannabisLicensePreCondtions != null) {
			return cannabisLicensePreCondtions;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append(", licenseType=");
		sb.append(licenseType);

		sb.append("}");

		throw new NoSuchCannabisLicensePreCondtionsException(sb.toString());
	}

	/**
	 * Returns the last cannabis license pre condtions in the ordered set where caseId = &#63; and licenseType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param licenseType the license type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis license pre condtions, or <code>null</code> if a matching cannabis license pre condtions could not be found
	 */
	@Override
	public CannabisLicensePreCondtions fetchBygetCI_CaseIdLicenseType_Last(
		String caseId, String licenseType,
		OrderByComparator<CannabisLicensePreCondtions> orderByComparator) {

		int count = countBygetCI_CaseIdLicenseType(caseId, licenseType);

		if (count == 0) {
			return null;
		}

		List<CannabisLicensePreCondtions> list = findBygetCI_CaseIdLicenseType(
			caseId, licenseType, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis license pre condtionses before and after the current cannabis license pre condtions in the ordered set where caseId = &#63; and licenseType = &#63;.
	 *
	 * @param cannabisPreconditionsId the primary key of the current cannabis license pre condtions
	 * @param caseId the case ID
	 * @param licenseType the license type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a cannabis license pre condtions with the primary key could not be found
	 */
	@Override
	public CannabisLicensePreCondtions[]
			findBygetCI_CaseIdLicenseType_PrevAndNext(
				long cannabisPreconditionsId, String caseId, String licenseType,
				OrderByComparator<CannabisLicensePreCondtions>
					orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException {

		caseId = Objects.toString(caseId, "");
		licenseType = Objects.toString(licenseType, "");

		CannabisLicensePreCondtions cannabisLicensePreCondtions =
			findByPrimaryKey(cannabisPreconditionsId);

		Session session = null;

		try {
			session = openSession();

			CannabisLicensePreCondtions[] array =
				new CannabisLicensePreCondtionsImpl[3];

			array[0] = getBygetCI_CaseIdLicenseType_PrevAndNext(
				session, cannabisLicensePreCondtions, caseId, licenseType,
				orderByComparator, true);

			array[1] = cannabisLicensePreCondtions;

			array[2] = getBygetCI_CaseIdLicenseType_PrevAndNext(
				session, cannabisLicensePreCondtions, caseId, licenseType,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CannabisLicensePreCondtions
		getBygetCI_CaseIdLicenseType_PrevAndNext(
			Session session,
			CannabisLicensePreCondtions cannabisLicensePreCondtions,
			String caseId, String licenseType,
			OrderByComparator<CannabisLicensePreCondtions> orderByComparator,
			boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_CANNABISLICENSEPRECONDTIONS_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCI_CASEIDLICENSETYPE_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETCI_CASEIDLICENSETYPE_CASEID_2);
		}

		boolean bindLicenseType = false;

		if (licenseType.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCI_CASEIDLICENSETYPE_LICENSETYPE_3);
		}
		else {
			bindLicenseType = true;

			sb.append(_FINDER_COLUMN_GETCI_CASEIDLICENSETYPE_LICENSETYPE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(CannabisLicensePreCondtionsModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (bindLicenseType) {
			queryPos.add(licenseType);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisLicensePreCondtions)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisLicensePreCondtions> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis license pre condtionses where caseId = &#63; and licenseType = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param licenseType the license type
	 */
	@Override
	public void removeBygetCI_CaseIdLicenseType(
		String caseId, String licenseType) {

		for (CannabisLicensePreCondtions cannabisLicensePreCondtions :
				findBygetCI_CaseIdLicenseType(
					caseId, licenseType, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(cannabisLicensePreCondtions);
		}
	}

	/**
	 * Returns the number of cannabis license pre condtionses where caseId = &#63; and licenseType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param licenseType the license type
	 * @return the number of matching cannabis license pre condtionses
	 */
	@Override
	public int countBygetCI_CaseIdLicenseType(
		String caseId, String licenseType) {

		caseId = Objects.toString(caseId, "");
		licenseType = Objects.toString(licenseType, "");

		FinderPath finderPath = _finderPathCountBygetCI_CaseIdLicenseType;

		Object[] finderArgs = new Object[] {caseId, licenseType};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISLICENSEPRECONDTIONS_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_CASEIDLICENSETYPE_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCI_CASEIDLICENSETYPE_CASEID_2);
			}

			boolean bindLicenseType = false;

			if (licenseType.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_CASEIDLICENSETYPE_LICENSETYPE_3);
			}
			else {
				bindLicenseType = true;

				sb.append(_FINDER_COLUMN_GETCI_CASEIDLICENSETYPE_LICENSETYPE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				if (bindLicenseType) {
					queryPos.add(licenseType);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETCI_CASEIDLICENSETYPE_CASEID_2 =
			"cannabisLicensePreCondtions.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETCI_CASEIDLICENSETYPE_CASEID_3 =
			"(cannabisLicensePreCondtions.caseId IS NULL OR cannabisLicensePreCondtions.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETCI_CASEIDLICENSETYPE_LICENSETYPE_2 =
			"cannabisLicensePreCondtions.licenseType = ?";

	private static final String
		_FINDER_COLUMN_GETCI_CASEIDLICENSETYPE_LICENSETYPE_3 =
			"(cannabisLicensePreCondtions.licenseType IS NULL OR cannabisLicensePreCondtions.licenseType = '')";

	private FinderPath _finderPathWithPaginationFindBygetCI_CaseIdApplicationId;
	private FinderPath
		_finderPathWithoutPaginationFindBygetCI_CaseIdApplicationId;
	private FinderPath _finderPathCountBygetCI_CaseIdApplicationId;

	/**
	 * Returns all the cannabis license pre condtionses where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis license pre condtionses
	 */
	@Override
	public List<CannabisLicensePreCondtions> findBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId) {

		return findBygetCI_CaseIdApplicationId(
			status, cannabisApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the cannabis license pre condtionses where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @return the range of matching cannabis license pre condtionses
	 */
	@Override
	public List<CannabisLicensePreCondtions> findBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId, int start, int end) {

		return findBygetCI_CaseIdApplicationId(
			status, cannabisApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis license pre condtionses where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis license pre condtionses
	 */
	@Override
	public List<CannabisLicensePreCondtions> findBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisLicensePreCondtions> orderByComparator) {

		return findBygetCI_CaseIdApplicationId(
			status, cannabisApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis license pre condtionses where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis license pre condtionses
	 */
	@Override
	public List<CannabisLicensePreCondtions> findBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisLicensePreCondtions> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetCI_CaseIdApplicationId;
				finderArgs = new Object[] {status, cannabisApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetCI_CaseIdApplicationId;
			finderArgs = new Object[] {
				status, cannabisApplicationId, start, end, orderByComparator
			};
		}

		List<CannabisLicensePreCondtions> list = null;

		if (useFinderCache) {
			list = (List<CannabisLicensePreCondtions>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisLicensePreCondtions cannabisLicensePreCondtions :
						list) {

					if (!status.equals(
							cannabisLicensePreCondtions.getStatus()) ||
						(cannabisApplicationId !=
							cannabisLicensePreCondtions.
								getCannabisApplicationId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_CANNABISLICENSEPRECONDTIONS_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_CANNABISAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CannabisLicensePreCondtionsModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(cannabisApplicationId);

				list = (List<CannabisLicensePreCondtions>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first cannabis license pre condtions in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a matching cannabis license pre condtions could not be found
	 */
	@Override
	public CannabisLicensePreCondtions findBygetCI_CaseIdApplicationId_First(
			String status, long cannabisApplicationId,
			OrderByComparator<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException {

		CannabisLicensePreCondtions cannabisLicensePreCondtions =
			fetchBygetCI_CaseIdApplicationId_First(
				status, cannabisApplicationId, orderByComparator);

		if (cannabisLicensePreCondtions != null) {
			return cannabisLicensePreCondtions;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", cannabisApplicationId=");
		sb.append(cannabisApplicationId);

		sb.append("}");

		throw new NoSuchCannabisLicensePreCondtionsException(sb.toString());
	}

	/**
	 * Returns the first cannabis license pre condtions in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis license pre condtions, or <code>null</code> if a matching cannabis license pre condtions could not be found
	 */
	@Override
	public CannabisLicensePreCondtions fetchBygetCI_CaseIdApplicationId_First(
		String status, long cannabisApplicationId,
		OrderByComparator<CannabisLicensePreCondtions> orderByComparator) {

		List<CannabisLicensePreCondtions> list =
			findBygetCI_CaseIdApplicationId(
				status, cannabisApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis license pre condtions in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a matching cannabis license pre condtions could not be found
	 */
	@Override
	public CannabisLicensePreCondtions findBygetCI_CaseIdApplicationId_Last(
			String status, long cannabisApplicationId,
			OrderByComparator<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException {

		CannabisLicensePreCondtions cannabisLicensePreCondtions =
			fetchBygetCI_CaseIdApplicationId_Last(
				status, cannabisApplicationId, orderByComparator);

		if (cannabisLicensePreCondtions != null) {
			return cannabisLicensePreCondtions;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", cannabisApplicationId=");
		sb.append(cannabisApplicationId);

		sb.append("}");

		throw new NoSuchCannabisLicensePreCondtionsException(sb.toString());
	}

	/**
	 * Returns the last cannabis license pre condtions in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis license pre condtions, or <code>null</code> if a matching cannabis license pre condtions could not be found
	 */
	@Override
	public CannabisLicensePreCondtions fetchBygetCI_CaseIdApplicationId_Last(
		String status, long cannabisApplicationId,
		OrderByComparator<CannabisLicensePreCondtions> orderByComparator) {

		int count = countBygetCI_CaseIdApplicationId(
			status, cannabisApplicationId);

		if (count == 0) {
			return null;
		}

		List<CannabisLicensePreCondtions> list =
			findBygetCI_CaseIdApplicationId(
				status, cannabisApplicationId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis license pre condtionses before and after the current cannabis license pre condtions in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param cannabisPreconditionsId the primary key of the current cannabis license pre condtions
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a cannabis license pre condtions with the primary key could not be found
	 */
	@Override
	public CannabisLicensePreCondtions[]
			findBygetCI_CaseIdApplicationId_PrevAndNext(
				long cannabisPreconditionsId, String status,
				long cannabisApplicationId,
				OrderByComparator<CannabisLicensePreCondtions>
					orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException {

		status = Objects.toString(status, "");

		CannabisLicensePreCondtions cannabisLicensePreCondtions =
			findByPrimaryKey(cannabisPreconditionsId);

		Session session = null;

		try {
			session = openSession();

			CannabisLicensePreCondtions[] array =
				new CannabisLicensePreCondtionsImpl[3];

			array[0] = getBygetCI_CaseIdApplicationId_PrevAndNext(
				session, cannabisLicensePreCondtions, status,
				cannabisApplicationId, orderByComparator, true);

			array[1] = cannabisLicensePreCondtions;

			array[2] = getBygetCI_CaseIdApplicationId_PrevAndNext(
				session, cannabisLicensePreCondtions, status,
				cannabisApplicationId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CannabisLicensePreCondtions
		getBygetCI_CaseIdApplicationId_PrevAndNext(
			Session session,
			CannabisLicensePreCondtions cannabisLicensePreCondtions,
			String status, long cannabisApplicationId,
			OrderByComparator<CannabisLicensePreCondtions> orderByComparator,
			boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_CANNABISLICENSEPRECONDTIONS_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_2);
		}

		sb.append(
			_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_CANNABISAPPLICATIONID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(CannabisLicensePreCondtionsModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		queryPos.add(cannabisApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisLicensePreCondtions)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisLicensePreCondtions> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis license pre condtionses where status = &#63; and cannabisApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 */
	@Override
	public void removeBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId) {

		for (CannabisLicensePreCondtions cannabisLicensePreCondtions :
				findBygetCI_CaseIdApplicationId(
					status, cannabisApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(cannabisLicensePreCondtions);
		}
	}

	/**
	 * Returns the number of cannabis license pre condtionses where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis license pre condtionses
	 */
	@Override
	public int countBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetCI_CaseIdApplicationId;

		Object[] finderArgs = new Object[] {status, cannabisApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISLICENSEPRECONDTIONS_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_CANNABISAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(cannabisApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_2 =
			"cannabisLicensePreCondtions.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_3 =
			"(cannabisLicensePreCondtions.status IS NULL OR cannabisLicensePreCondtions.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_CANNABISAPPLICATIONID_2 =
			"cannabisLicensePreCondtions.cannabisApplicationId = ?";

	public CannabisLicensePreCondtionsPersistenceImpl() {
		setModelClass(CannabisLicensePreCondtions.class);

		setModelImplClass(CannabisLicensePreCondtionsImpl.class);
		setModelPKClass(long.class);

		setTable(CannabisLicensePreCondtionsTable.INSTANCE);
	}

	/**
	 * Caches the cannabis license pre condtions in the entity cache if it is enabled.
	 *
	 * @param cannabisLicensePreCondtions the cannabis license pre condtions
	 */
	@Override
	public void cacheResult(
		CannabisLicensePreCondtions cannabisLicensePreCondtions) {

		entityCache.putResult(
			CannabisLicensePreCondtionsImpl.class,
			cannabisLicensePreCondtions.getPrimaryKey(),
			cannabisLicensePreCondtions);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the cannabis license pre condtionses in the entity cache if it is enabled.
	 *
	 * @param cannabisLicensePreCondtionses the cannabis license pre condtionses
	 */
	@Override
	public void cacheResult(
		List<CannabisLicensePreCondtions> cannabisLicensePreCondtionses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (cannabisLicensePreCondtionses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CannabisLicensePreCondtions cannabisLicensePreCondtions :
				cannabisLicensePreCondtionses) {

			if (entityCache.getResult(
					CannabisLicensePreCondtionsImpl.class,
					cannabisLicensePreCondtions.getPrimaryKey()) == null) {

				cacheResult(cannabisLicensePreCondtions);
			}
		}
	}

	/**
	 * Clears the cache for all cannabis license pre condtionses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CannabisLicensePreCondtionsImpl.class);

		finderCache.clearCache(CannabisLicensePreCondtionsImpl.class);
	}

	/**
	 * Clears the cache for the cannabis license pre condtions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CannabisLicensePreCondtions cannabisLicensePreCondtions) {

		entityCache.removeResult(
			CannabisLicensePreCondtionsImpl.class, cannabisLicensePreCondtions);
	}

	@Override
	public void clearCache(
		List<CannabisLicensePreCondtions> cannabisLicensePreCondtionses) {

		for (CannabisLicensePreCondtions cannabisLicensePreCondtions :
				cannabisLicensePreCondtionses) {

			entityCache.removeResult(
				CannabisLicensePreCondtionsImpl.class,
				cannabisLicensePreCondtions);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CannabisLicensePreCondtionsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CannabisLicensePreCondtionsImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new cannabis license pre condtions with the primary key. Does not add the cannabis license pre condtions to the database.
	 *
	 * @param cannabisPreconditionsId the primary key for the new cannabis license pre condtions
	 * @return the new cannabis license pre condtions
	 */
	@Override
	public CannabisLicensePreCondtions create(long cannabisPreconditionsId) {
		CannabisLicensePreCondtions cannabisLicensePreCondtions =
			new CannabisLicensePreCondtionsImpl();

		cannabisLicensePreCondtions.setNew(true);
		cannabisLicensePreCondtions.setPrimaryKey(cannabisPreconditionsId);

		cannabisLicensePreCondtions.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return cannabisLicensePreCondtions;
	}

	/**
	 * Removes the cannabis license pre condtions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisPreconditionsId the primary key of the cannabis license pre condtions
	 * @return the cannabis license pre condtions that was removed
	 * @throws NoSuchCannabisLicensePreCondtionsException if a cannabis license pre condtions with the primary key could not be found
	 */
	@Override
	public CannabisLicensePreCondtions remove(long cannabisPreconditionsId)
		throws NoSuchCannabisLicensePreCondtionsException {

		return remove((Serializable)cannabisPreconditionsId);
	}

	/**
	 * Removes the cannabis license pre condtions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cannabis license pre condtions
	 * @return the cannabis license pre condtions that was removed
	 * @throws NoSuchCannabisLicensePreCondtionsException if a cannabis license pre condtions with the primary key could not be found
	 */
	@Override
	public CannabisLicensePreCondtions remove(Serializable primaryKey)
		throws NoSuchCannabisLicensePreCondtionsException {

		Session session = null;

		try {
			session = openSession();

			CannabisLicensePreCondtions cannabisLicensePreCondtions =
				(CannabisLicensePreCondtions)session.get(
					CannabisLicensePreCondtionsImpl.class, primaryKey);

			if (cannabisLicensePreCondtions == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCannabisLicensePreCondtionsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(cannabisLicensePreCondtions);
		}
		catch (NoSuchCannabisLicensePreCondtionsException
					noSuchEntityException) {

			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected CannabisLicensePreCondtions removeImpl(
		CannabisLicensePreCondtions cannabisLicensePreCondtions) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cannabisLicensePreCondtions)) {
				cannabisLicensePreCondtions =
					(CannabisLicensePreCondtions)session.get(
						CannabisLicensePreCondtionsImpl.class,
						cannabisLicensePreCondtions.getPrimaryKeyObj());
			}

			if (cannabisLicensePreCondtions != null) {
				session.delete(cannabisLicensePreCondtions);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (cannabisLicensePreCondtions != null) {
			clearCache(cannabisLicensePreCondtions);
		}

		return cannabisLicensePreCondtions;
	}

	@Override
	public CannabisLicensePreCondtions updateImpl(
		CannabisLicensePreCondtions cannabisLicensePreCondtions) {

		boolean isNew = cannabisLicensePreCondtions.isNew();

		if (!(cannabisLicensePreCondtions instanceof
				CannabisLicensePreCondtionsModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					cannabisLicensePreCondtions.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					cannabisLicensePreCondtions);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cannabisLicensePreCondtions proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CannabisLicensePreCondtions implementation " +
					cannabisLicensePreCondtions.getClass());
		}

		CannabisLicensePreCondtionsModelImpl
			cannabisLicensePreCondtionsModelImpl =
				(CannabisLicensePreCondtionsModelImpl)
					cannabisLicensePreCondtions;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (cannabisLicensePreCondtions.getCreateDate() == null)) {
			if (serviceContext == null) {
				cannabisLicensePreCondtions.setCreateDate(date);
			}
			else {
				cannabisLicensePreCondtions.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!cannabisLicensePreCondtionsModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cannabisLicensePreCondtions.setModifiedDate(date);
			}
			else {
				cannabisLicensePreCondtions.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(cannabisLicensePreCondtions);
			}
			else {
				cannabisLicensePreCondtions =
					(CannabisLicensePreCondtions)session.merge(
						cannabisLicensePreCondtions);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CannabisLicensePreCondtionsImpl.class,
			cannabisLicensePreCondtionsModelImpl, false, true);

		if (isNew) {
			cannabisLicensePreCondtions.setNew(false);
		}

		cannabisLicensePreCondtions.resetOriginalValues();

		return cannabisLicensePreCondtions;
	}

	/**
	 * Returns the cannabis license pre condtions with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cannabis license pre condtions
	 * @return the cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a cannabis license pre condtions with the primary key could not be found
	 */
	@Override
	public CannabisLicensePreCondtions findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCannabisLicensePreCondtionsException {

		CannabisLicensePreCondtions cannabisLicensePreCondtions =
			fetchByPrimaryKey(primaryKey);

		if (cannabisLicensePreCondtions == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCannabisLicensePreCondtionsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return cannabisLicensePreCondtions;
	}

	/**
	 * Returns the cannabis license pre condtions with the primary key or throws a <code>NoSuchCannabisLicensePreCondtionsException</code> if it could not be found.
	 *
	 * @param cannabisPreconditionsId the primary key of the cannabis license pre condtions
	 * @return the cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a cannabis license pre condtions with the primary key could not be found
	 */
	@Override
	public CannabisLicensePreCondtions findByPrimaryKey(
			long cannabisPreconditionsId)
		throws NoSuchCannabisLicensePreCondtionsException {

		return findByPrimaryKey((Serializable)cannabisPreconditionsId);
	}

	/**
	 * Returns the cannabis license pre condtions with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisPreconditionsId the primary key of the cannabis license pre condtions
	 * @return the cannabis license pre condtions, or <code>null</code> if a cannabis license pre condtions with the primary key could not be found
	 */
	@Override
	public CannabisLicensePreCondtions fetchByPrimaryKey(
		long cannabisPreconditionsId) {

		return fetchByPrimaryKey((Serializable)cannabisPreconditionsId);
	}

	/**
	 * Returns all the cannabis license pre condtionses.
	 *
	 * @return the cannabis license pre condtionses
	 */
	@Override
	public List<CannabisLicensePreCondtions> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis license pre condtionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @return the range of cannabis license pre condtionses
	 */
	@Override
	public List<CannabisLicensePreCondtions> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis license pre condtionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis license pre condtionses
	 */
	@Override
	public List<CannabisLicensePreCondtions> findAll(
		int start, int end,
		OrderByComparator<CannabisLicensePreCondtions> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis license pre condtionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis license pre condtionses
	 */
	@Override
	public List<CannabisLicensePreCondtions> findAll(
		int start, int end,
		OrderByComparator<CannabisLicensePreCondtions> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<CannabisLicensePreCondtions> list = null;

		if (useFinderCache) {
			list = (List<CannabisLicensePreCondtions>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CANNABISLICENSEPRECONDTIONS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CANNABISLICENSEPRECONDTIONS;

				sql = sql.concat(
					CannabisLicensePreCondtionsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CannabisLicensePreCondtions>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the cannabis license pre condtionses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CannabisLicensePreCondtions cannabisLicensePreCondtions :
				findAll()) {

			remove(cannabisLicensePreCondtions);
		}
	}

	/**
	 * Returns the number of cannabis license pre condtionses.
	 *
	 * @return the number of cannabis license pre condtionses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_CANNABISLICENSEPRECONDTIONS);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "cannabisPreconditionsId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CANNABISLICENSEPRECONDTIONS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CannabisLicensePreCondtionsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cannabis license pre condtions persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindBygetCI_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCI_CAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"cannabisApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetCI_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCI_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, true);

		_finderPathCountBygetCI_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCI_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, false);

		_finderPathWithPaginationFindBygetCI_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCI_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetCI_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCI_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetCI_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCI_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetCI_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCI_Status",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetCI_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCI_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			true);

		_finderPathCountBygetCI_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCI_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			false);

		_finderPathWithPaginationFindBygetCI_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCI_CaseIdStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"status", "caseId"}, true);

		_finderPathWithoutPaginationFindBygetCI_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetCI_CaseIdStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, true);

		_finderPathCountBygetCI_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCI_CaseIdStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, false);

		_finderPathWithPaginationFindBygetCI_CaseIdLicenseType = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetCI_CaseIdLicenseType",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"caseId", "licenseType"}, true);

		_finderPathWithoutPaginationFindBygetCI_CaseIdLicenseType =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetCI_CaseIdLicenseType",
				new String[] {String.class.getName(), String.class.getName()},
				new String[] {"caseId", "licenseType"}, true);

		_finderPathCountBygetCI_CaseIdLicenseType = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCI_CaseIdLicenseType",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "licenseType"}, false);

		_finderPathWithPaginationFindBygetCI_CaseIdApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetCI_CaseIdApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"status", "cannabisApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetCI_CaseIdApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetCI_CaseIdApplicationId",
				new String[] {String.class.getName(), Long.class.getName()},
				new String[] {"status", "cannabisApplicationId"}, true);

		_finderPathCountBygetCI_CaseIdApplicationId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCI_CaseIdApplicationId",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"status", "cannabisApplicationId"}, false);

		CannabisLicensePreCondtionsUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CannabisLicensePreCondtionsUtil.setPersistence(null);

		entityCache.removeCache(
			CannabisLicensePreCondtionsImpl.class.getName());
	}

	@Override
	@Reference(
		target = CANNABIS_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = CANNABIS_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = CANNABIS_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CANNABISLICENSEPRECONDTIONS =
		"SELECT cannabisLicensePreCondtions FROM CannabisLicensePreCondtions cannabisLicensePreCondtions";

	private static final String _SQL_SELECT_CANNABISLICENSEPRECONDTIONS_WHERE =
		"SELECT cannabisLicensePreCondtions FROM CannabisLicensePreCondtions cannabisLicensePreCondtions WHERE ";

	private static final String _SQL_COUNT_CANNABISLICENSEPRECONDTIONS =
		"SELECT COUNT(cannabisLicensePreCondtions) FROM CannabisLicensePreCondtions cannabisLicensePreCondtions";

	private static final String _SQL_COUNT_CANNABISLICENSEPRECONDTIONS_WHERE =
		"SELECT COUNT(cannabisLicensePreCondtions) FROM CannabisLicensePreCondtions cannabisLicensePreCondtions WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"cannabisLicensePreCondtions.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CannabisLicensePreCondtions exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CannabisLicensePreCondtions exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CannabisLicensePreCondtionsPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}