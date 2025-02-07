/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service.persistence.impl;

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
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.manufacturing.application.stages.services.exception.NoSuchManuInspectionException;
import com.nbp.manufacturing.application.stages.services.model.ManuInspection;
import com.nbp.manufacturing.application.stages.services.model.ManuInspectionTable;
import com.nbp.manufacturing.application.stages.services.model.impl.ManuInspectionImpl;
import com.nbp.manufacturing.application.stages.services.model.impl.ManuInspectionModelImpl;
import com.nbp.manufacturing.application.stages.services.service.persistence.ManuInspectionPersistence;
import com.nbp.manufacturing.application.stages.services.service.persistence.ManuInspectionUtil;
import com.nbp.manufacturing.application.stages.services.service.persistence.impl.constants.MANUFACTURING_STAGESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
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
 * The persistence implementation for the manu inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ManuInspectionPersistence.class)
public class ManuInspectionPersistenceImpl
	extends BasePersistenceImpl<ManuInspection>
	implements ManuInspectionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ManuInspectionUtil</code> to access the manu inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ManuInspectionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetManuInspectionBy_CI;
	private FinderPath _finderPathCountBygetManuInspectionBy_CI;

	/**
	 * Returns the manu inspection where caseId = &#63; or throws a <code>NoSuchManuInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	@Override
	public ManuInspection findBygetManuInspectionBy_CI(String caseId)
		throws NoSuchManuInspectionException {

		ManuInspection manuInspection = fetchBygetManuInspectionBy_CI(caseId);

		if (manuInspection == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchManuInspectionException(sb.toString());
		}

		return manuInspection;
	}

	/**
	 * Returns the manu inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	@Override
	public ManuInspection fetchBygetManuInspectionBy_CI(String caseId) {
		return fetchBygetManuInspectionBy_CI(caseId, true);
	}

	/**
	 * Returns the manu inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	@Override
	public ManuInspection fetchBygetManuInspectionBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetManuInspectionBy_CI, finderArgs, this);
		}

		if (result instanceof ManuInspection) {
			ManuInspection manuInspection = (ManuInspection)result;

			if (!Objects.equals(caseId, manuInspection.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MANUINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMANUINSPECTIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMANUINSPECTIONBY_CI_CASEID_2);
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

				List<ManuInspection> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetManuInspectionBy_CI,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId};
							}

							_log.warn(
								"ManuInspectionPersistenceImpl.fetchBygetManuInspectionBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ManuInspection manuInspection = list.get(0);

					result = manuInspection;

					cacheResult(manuInspection);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (ManuInspection)result;
		}
	}

	/**
	 * Removes the manu inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the manu inspection that was removed
	 */
	@Override
	public ManuInspection removeBygetManuInspectionBy_CI(String caseId)
		throws NoSuchManuInspectionException {

		ManuInspection manuInspection = findBygetManuInspectionBy_CI(caseId);

		return remove(manuInspection);
	}

	/**
	 * Returns the number of manu inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching manu inspections
	 */
	@Override
	public int countBygetManuInspectionBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetManuInspectionBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMANUINSPECTIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMANUINSPECTIONBY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETMANUINSPECTIONBY_CI_CASEID_2 =
		"manuInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETMANUINSPECTIONBY_CI_CASEID_3 =
		"(manuInspection.caseId IS NULL OR manuInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetMI_MAI;
	private FinderPath _finderPathWithoutPaginationFindBygetMI_MAI;
	private FinderPath _finderPathCountBygetMI_MAI;

	/**
	 * Returns all the manu inspections where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu inspections
	 */
	@Override
	public List<ManuInspection> findBygetMI_MAI(
		long manufacturingApplicationId) {

		return findBygetMI_MAI(
			manufacturingApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the manu inspections where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @return the range of matching manu inspections
	 */
	@Override
	public List<ManuInspection> findBygetMI_MAI(
		long manufacturingApplicationId, int start, int end) {

		return findBygetMI_MAI(manufacturingApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the manu inspections where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu inspections
	 */
	@Override
	public List<ManuInspection> findBygetMI_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuInspection> orderByComparator) {

		return findBygetMI_MAI(
			manufacturingApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the manu inspections where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu inspections
	 */
	@Override
	public List<ManuInspection> findBygetMI_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuInspection> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMI_MAI;
				finderArgs = new Object[] {manufacturingApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMI_MAI;
			finderArgs = new Object[] {
				manufacturingApplicationId, start, end, orderByComparator
			};
		}

		List<ManuInspection> list = null;

		if (useFinderCache) {
			list = (List<ManuInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ManuInspection manuInspection : list) {
					if (manufacturingApplicationId !=
							manuInspection.getManufacturingApplicationId()) {

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

			sb.append(_SQL_SELECT_MANUINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETMI_MAI_MANUFACTURINGAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ManuInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				list = (List<ManuInspection>)QueryUtil.list(
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
	 * Returns the first manu inspection in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	@Override
	public ManuInspection findBygetMI_MAI_First(
			long manufacturingApplicationId,
			OrderByComparator<ManuInspection> orderByComparator)
		throws NoSuchManuInspectionException {

		ManuInspection manuInspection = fetchBygetMI_MAI_First(
			manufacturingApplicationId, orderByComparator);

		if (manuInspection != null) {
			return manuInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchManuInspectionException(sb.toString());
	}

	/**
	 * Returns the first manu inspection in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	@Override
	public ManuInspection fetchBygetMI_MAI_First(
		long manufacturingApplicationId,
		OrderByComparator<ManuInspection> orderByComparator) {

		List<ManuInspection> list = findBygetMI_MAI(
			manufacturingApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last manu inspection in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	@Override
	public ManuInspection findBygetMI_MAI_Last(
			long manufacturingApplicationId,
			OrderByComparator<ManuInspection> orderByComparator)
		throws NoSuchManuInspectionException {

		ManuInspection manuInspection = fetchBygetMI_MAI_Last(
			manufacturingApplicationId, orderByComparator);

		if (manuInspection != null) {
			return manuInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchManuInspectionException(sb.toString());
	}

	/**
	 * Returns the last manu inspection in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	@Override
	public ManuInspection fetchBygetMI_MAI_Last(
		long manufacturingApplicationId,
		OrderByComparator<ManuInspection> orderByComparator) {

		int count = countBygetMI_MAI(manufacturingApplicationId);

		if (count == 0) {
			return null;
		}

		List<ManuInspection> list = findBygetMI_MAI(
			manufacturingApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the manu inspections before and after the current manu inspection in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manuInspectionId the primary key of the current manu inspection
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu inspection
	 * @throws NoSuchManuInspectionException if a manu inspection with the primary key could not be found
	 */
	@Override
	public ManuInspection[] findBygetMI_MAI_PrevAndNext(
			long manuInspectionId, long manufacturingApplicationId,
			OrderByComparator<ManuInspection> orderByComparator)
		throws NoSuchManuInspectionException {

		ManuInspection manuInspection = findByPrimaryKey(manuInspectionId);

		Session session = null;

		try {
			session = openSession();

			ManuInspection[] array = new ManuInspectionImpl[3];

			array[0] = getBygetMI_MAI_PrevAndNext(
				session, manuInspection, manufacturingApplicationId,
				orderByComparator, true);

			array[1] = manuInspection;

			array[2] = getBygetMI_MAI_PrevAndNext(
				session, manuInspection, manufacturingApplicationId,
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

	protected ManuInspection getBygetMI_MAI_PrevAndNext(
		Session session, ManuInspection manuInspection,
		long manufacturingApplicationId,
		OrderByComparator<ManuInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_MANUINSPECTION_WHERE);

		sb.append(_FINDER_COLUMN_GETMI_MAI_MANUFACTURINGAPPLICATIONID_2);

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
			sb.append(ManuInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(manufacturingApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						manuInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ManuInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the manu inspections where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	@Override
	public void removeBygetMI_MAI(long manufacturingApplicationId) {
		for (ManuInspection manuInspection :
				findBygetMI_MAI(
					manufacturingApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(manuInspection);
		}
	}

	/**
	 * Returns the number of manu inspections where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu inspections
	 */
	@Override
	public int countBygetMI_MAI(long manufacturingApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMI_MAI;

		Object[] finderArgs = new Object[] {manufacturingApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETMI_MAI_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

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
		_FINDER_COLUMN_GETMI_MAI_MANUFACTURINGAPPLICATIONID_2 =
			"manuInspection.manufacturingApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetMI_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetMI_CaseId;
	private FinderPath _finderPathCountBygetMI_CaseId;

	/**
	 * Returns all the manu inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching manu inspections
	 */
	@Override
	public List<ManuInspection> findBygetMI_CaseId(String caseId) {
		return findBygetMI_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the manu inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @return the range of matching manu inspections
	 */
	@Override
	public List<ManuInspection> findBygetMI_CaseId(
		String caseId, int start, int end) {

		return findBygetMI_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the manu inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu inspections
	 */
	@Override
	public List<ManuInspection> findBygetMI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<ManuInspection> orderByComparator) {

		return findBygetMI_CaseId(caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the manu inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu inspections
	 */
	@Override
	public List<ManuInspection> findBygetMI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<ManuInspection> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMI_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMI_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<ManuInspection> list = null;

		if (useFinderCache) {
			list = (List<ManuInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ManuInspection manuInspection : list) {
					if (!caseId.equals(manuInspection.getCaseId())) {
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

			sb.append(_SQL_SELECT_MANUINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMI_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMI_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ManuInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<ManuInspection>)QueryUtil.list(
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
	 * Returns the first manu inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	@Override
	public ManuInspection findBygetMI_CaseId_First(
			String caseId, OrderByComparator<ManuInspection> orderByComparator)
		throws NoSuchManuInspectionException {

		ManuInspection manuInspection = fetchBygetMI_CaseId_First(
			caseId, orderByComparator);

		if (manuInspection != null) {
			return manuInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchManuInspectionException(sb.toString());
	}

	/**
	 * Returns the first manu inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	@Override
	public ManuInspection fetchBygetMI_CaseId_First(
		String caseId, OrderByComparator<ManuInspection> orderByComparator) {

		List<ManuInspection> list = findBygetMI_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last manu inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	@Override
	public ManuInspection findBygetMI_CaseId_Last(
			String caseId, OrderByComparator<ManuInspection> orderByComparator)
		throws NoSuchManuInspectionException {

		ManuInspection manuInspection = fetchBygetMI_CaseId_Last(
			caseId, orderByComparator);

		if (manuInspection != null) {
			return manuInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchManuInspectionException(sb.toString());
	}

	/**
	 * Returns the last manu inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	@Override
	public ManuInspection fetchBygetMI_CaseId_Last(
		String caseId, OrderByComparator<ManuInspection> orderByComparator) {

		int count = countBygetMI_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<ManuInspection> list = findBygetMI_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the manu inspections before and after the current manu inspection in the ordered set where caseId = &#63;.
	 *
	 * @param manuInspectionId the primary key of the current manu inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu inspection
	 * @throws NoSuchManuInspectionException if a manu inspection with the primary key could not be found
	 */
	@Override
	public ManuInspection[] findBygetMI_CaseId_PrevAndNext(
			long manuInspectionId, String caseId,
			OrderByComparator<ManuInspection> orderByComparator)
		throws NoSuchManuInspectionException {

		caseId = Objects.toString(caseId, "");

		ManuInspection manuInspection = findByPrimaryKey(manuInspectionId);

		Session session = null;

		try {
			session = openSession();

			ManuInspection[] array = new ManuInspectionImpl[3];

			array[0] = getBygetMI_CaseId_PrevAndNext(
				session, manuInspection, caseId, orderByComparator, true);

			array[1] = manuInspection;

			array[2] = getBygetMI_CaseId_PrevAndNext(
				session, manuInspection, caseId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ManuInspection getBygetMI_CaseId_PrevAndNext(
		Session session, ManuInspection manuInspection, String caseId,
		OrderByComparator<ManuInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_MANUINSPECTION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMI_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETMI_CASEID_CASEID_2);
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
			sb.append(ManuInspectionModelImpl.ORDER_BY_JPQL);
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
						manuInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ManuInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the manu inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetMI_CaseId(String caseId) {
		for (ManuInspection manuInspection :
				findBygetMI_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(manuInspection);
		}
	}

	/**
	 * Returns the number of manu inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching manu inspections
	 */
	@Override
	public int countBygetMI_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetMI_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMI_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMI_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETMI_CASEID_CASEID_2 =
		"manuInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETMI_CASEID_CASEID_3 =
		"(manuInspection.caseId IS NULL OR manuInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetMI_Status;
	private FinderPath _finderPathWithoutPaginationFindBygetMI_Status;
	private FinderPath _finderPathCountBygetMI_Status;

	/**
	 * Returns all the manu inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching manu inspections
	 */
	@Override
	public List<ManuInspection> findBygetMI_Status(String status) {
		return findBygetMI_Status(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the manu inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @return the range of matching manu inspections
	 */
	@Override
	public List<ManuInspection> findBygetMI_Status(
		String status, int start, int end) {

		return findBygetMI_Status(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the manu inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu inspections
	 */
	@Override
	public List<ManuInspection> findBygetMI_Status(
		String status, int start, int end,
		OrderByComparator<ManuInspection> orderByComparator) {

		return findBygetMI_Status(status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the manu inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu inspections
	 */
	@Override
	public List<ManuInspection> findBygetMI_Status(
		String status, int start, int end,
		OrderByComparator<ManuInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMI_Status;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMI_Status;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<ManuInspection> list = null;

		if (useFinderCache) {
			list = (List<ManuInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ManuInspection manuInspection : list) {
					if (!status.equals(manuInspection.getStatus())) {
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

			sb.append(_SQL_SELECT_MANUINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMI_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETMI_STATUS_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ManuInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<ManuInspection>)QueryUtil.list(
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
	 * Returns the first manu inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	@Override
	public ManuInspection findBygetMI_Status_First(
			String status, OrderByComparator<ManuInspection> orderByComparator)
		throws NoSuchManuInspectionException {

		ManuInspection manuInspection = fetchBygetMI_Status_First(
			status, orderByComparator);

		if (manuInspection != null) {
			return manuInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchManuInspectionException(sb.toString());
	}

	/**
	 * Returns the first manu inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	@Override
	public ManuInspection fetchBygetMI_Status_First(
		String status, OrderByComparator<ManuInspection> orderByComparator) {

		List<ManuInspection> list = findBygetMI_Status(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last manu inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	@Override
	public ManuInspection findBygetMI_Status_Last(
			String status, OrderByComparator<ManuInspection> orderByComparator)
		throws NoSuchManuInspectionException {

		ManuInspection manuInspection = fetchBygetMI_Status_Last(
			status, orderByComparator);

		if (manuInspection != null) {
			return manuInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchManuInspectionException(sb.toString());
	}

	/**
	 * Returns the last manu inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	@Override
	public ManuInspection fetchBygetMI_Status_Last(
		String status, OrderByComparator<ManuInspection> orderByComparator) {

		int count = countBygetMI_Status(status);

		if (count == 0) {
			return null;
		}

		List<ManuInspection> list = findBygetMI_Status(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the manu inspections before and after the current manu inspection in the ordered set where status = &#63;.
	 *
	 * @param manuInspectionId the primary key of the current manu inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu inspection
	 * @throws NoSuchManuInspectionException if a manu inspection with the primary key could not be found
	 */
	@Override
	public ManuInspection[] findBygetMI_Status_PrevAndNext(
			long manuInspectionId, String status,
			OrderByComparator<ManuInspection> orderByComparator)
		throws NoSuchManuInspectionException {

		status = Objects.toString(status, "");

		ManuInspection manuInspection = findByPrimaryKey(manuInspectionId);

		Session session = null;

		try {
			session = openSession();

			ManuInspection[] array = new ManuInspectionImpl[3];

			array[0] = getBygetMI_Status_PrevAndNext(
				session, manuInspection, status, orderByComparator, true);

			array[1] = manuInspection;

			array[2] = getBygetMI_Status_PrevAndNext(
				session, manuInspection, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ManuInspection getBygetMI_Status_PrevAndNext(
		Session session, ManuInspection manuInspection, String status,
		OrderByComparator<ManuInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_MANUINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMI_STATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETMI_STATUS_STATUS_2);
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
			sb.append(ManuInspectionModelImpl.ORDER_BY_JPQL);
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
						manuInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ManuInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the manu inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetMI_Status(String status) {
		for (ManuInspection manuInspection :
				findBygetMI_Status(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(manuInspection);
		}
	}

	/**
	 * Returns the number of manu inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching manu inspections
	 */
	@Override
	public int countBygetMI_Status(String status) {
		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetMI_Status;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMI_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETMI_STATUS_STATUS_2);
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

	private static final String _FINDER_COLUMN_GETMI_STATUS_STATUS_2 =
		"manuInspection.status = ?";

	private static final String _FINDER_COLUMN_GETMI_STATUS_STATUS_3 =
		"(manuInspection.status IS NULL OR manuInspection.status = '')";

	private FinderPath _finderPathWithPaginationFindBygetMI_CaseIdStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetMI_CaseIdStatus;
	private FinderPath _finderPathCountBygetMI_CaseIdStatus;

	/**
	 * Returns all the manu inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching manu inspections
	 */
	@Override
	public List<ManuInspection> findBygetMI_CaseIdStatus(
		String status, String caseId) {

		return findBygetMI_CaseIdStatus(
			status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the manu inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @return the range of matching manu inspections
	 */
	@Override
	public List<ManuInspection> findBygetMI_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return findBygetMI_CaseIdStatus(status, caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the manu inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu inspections
	 */
	@Override
	public List<ManuInspection> findBygetMI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<ManuInspection> orderByComparator) {

		return findBygetMI_CaseIdStatus(
			status, caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the manu inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu inspections
	 */
	@Override
	public List<ManuInspection> findBygetMI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<ManuInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetMI_CaseIdStatus;
				finderArgs = new Object[] {status, caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMI_CaseIdStatus;
			finderArgs = new Object[] {
				status, caseId, start, end, orderByComparator
			};
		}

		List<ManuInspection> list = null;

		if (useFinderCache) {
			list = (List<ManuInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ManuInspection manuInspection : list) {
					if (!status.equals(manuInspection.getStatus()) ||
						!caseId.equals(manuInspection.getCaseId())) {

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

			sb.append(_SQL_SELECT_MANUINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMI_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETMI_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMI_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMI_CASEIDSTATUS_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ManuInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<ManuInspection>)QueryUtil.list(
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
	 * Returns the first manu inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	@Override
	public ManuInspection findBygetMI_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<ManuInspection> orderByComparator)
		throws NoSuchManuInspectionException {

		ManuInspection manuInspection = fetchBygetMI_CaseIdStatus_First(
			status, caseId, orderByComparator);

		if (manuInspection != null) {
			return manuInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchManuInspectionException(sb.toString());
	}

	/**
	 * Returns the first manu inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	@Override
	public ManuInspection fetchBygetMI_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<ManuInspection> orderByComparator) {

		List<ManuInspection> list = findBygetMI_CaseIdStatus(
			status, caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last manu inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	@Override
	public ManuInspection findBygetMI_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<ManuInspection> orderByComparator)
		throws NoSuchManuInspectionException {

		ManuInspection manuInspection = fetchBygetMI_CaseIdStatus_Last(
			status, caseId, orderByComparator);

		if (manuInspection != null) {
			return manuInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchManuInspectionException(sb.toString());
	}

	/**
	 * Returns the last manu inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	@Override
	public ManuInspection fetchBygetMI_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<ManuInspection> orderByComparator) {

		int count = countBygetMI_CaseIdStatus(status, caseId);

		if (count == 0) {
			return null;
		}

		List<ManuInspection> list = findBygetMI_CaseIdStatus(
			status, caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the manu inspections before and after the current manu inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param manuInspectionId the primary key of the current manu inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu inspection
	 * @throws NoSuchManuInspectionException if a manu inspection with the primary key could not be found
	 */
	@Override
	public ManuInspection[] findBygetMI_CaseIdStatus_PrevAndNext(
			long manuInspectionId, String status, String caseId,
			OrderByComparator<ManuInspection> orderByComparator)
		throws NoSuchManuInspectionException {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		ManuInspection manuInspection = findByPrimaryKey(manuInspectionId);

		Session session = null;

		try {
			session = openSession();

			ManuInspection[] array = new ManuInspectionImpl[3];

			array[0] = getBygetMI_CaseIdStatus_PrevAndNext(
				session, manuInspection, status, caseId, orderByComparator,
				true);

			array[1] = manuInspection;

			array[2] = getBygetMI_CaseIdStatus_PrevAndNext(
				session, manuInspection, status, caseId, orderByComparator,
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

	protected ManuInspection getBygetMI_CaseIdStatus_PrevAndNext(
		Session session, ManuInspection manuInspection, String status,
		String caseId, OrderByComparator<ManuInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_MANUINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMI_CASEIDSTATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETMI_CASEIDSTATUS_STATUS_2);
		}

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMI_CASEIDSTATUS_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETMI_CASEIDSTATUS_CASEID_2);
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
			sb.append(ManuInspectionModelImpl.ORDER_BY_JPQL);
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
						manuInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ManuInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the manu inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetMI_CaseIdStatus(String status, String caseId) {
		for (ManuInspection manuInspection :
				findBygetMI_CaseIdStatus(
					status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(manuInspection);
		}
	}

	/**
	 * Returns the number of manu inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching manu inspections
	 */
	@Override
	public int countBygetMI_CaseIdStatus(String status, String caseId) {
		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetMI_CaseIdStatus;

		Object[] finderArgs = new Object[] {status, caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MANUINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMI_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETMI_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMI_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMI_CASEIDSTATUS_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETMI_CASEIDSTATUS_STATUS_2 =
		"manuInspection.status = ? AND ";

	private static final String _FINDER_COLUMN_GETMI_CASEIDSTATUS_STATUS_3 =
		"(manuInspection.status IS NULL OR manuInspection.status = '') AND ";

	private static final String _FINDER_COLUMN_GETMI_CASEIDSTATUS_CASEID_2 =
		"manuInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETMI_CASEIDSTATUS_CASEID_3 =
		"(manuInspection.caseId IS NULL OR manuInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetMI_CaseIdApplicationId;
	private FinderPath
		_finderPathWithoutPaginationFindBygetMI_CaseIdApplicationId;
	private FinderPath _finderPathCountBygetMI_CaseIdApplicationId;

	/**
	 * Returns all the manu inspections where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu inspections
	 */
	@Override
	public List<ManuInspection> findBygetMI_CaseIdApplicationId(
		String status, long manufacturingApplicationId) {

		return findBygetMI_CaseIdApplicationId(
			status, manufacturingApplicationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the manu inspections where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @return the range of matching manu inspections
	 */
	@Override
	public List<ManuInspection> findBygetMI_CaseIdApplicationId(
		String status, long manufacturingApplicationId, int start, int end) {

		return findBygetMI_CaseIdApplicationId(
			status, manufacturingApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the manu inspections where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu inspections
	 */
	@Override
	public List<ManuInspection> findBygetMI_CaseIdApplicationId(
		String status, long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuInspection> orderByComparator) {

		return findBygetMI_CaseIdApplicationId(
			status, manufacturingApplicationId, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the manu inspections where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu inspections
	 */
	@Override
	public List<ManuInspection> findBygetMI_CaseIdApplicationId(
		String status, long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetMI_CaseIdApplicationId;
				finderArgs = new Object[] {status, manufacturingApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetMI_CaseIdApplicationId;
			finderArgs = new Object[] {
				status, manufacturingApplicationId, start, end,
				orderByComparator
			};
		}

		List<ManuInspection> list = null;

		if (useFinderCache) {
			list = (List<ManuInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ManuInspection manuInspection : list) {
					if (!status.equals(manuInspection.getStatus()) ||
						(manufacturingApplicationId !=
							manuInspection.getManufacturingApplicationId())) {

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

			sb.append(_SQL_SELECT_MANUINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMI_CASEIDAPPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETMI_CASEIDAPPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETMI_CASEIDAPPLICATIONID_MANUFACTURINGAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ManuInspectionModelImpl.ORDER_BY_JPQL);
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

				queryPos.add(manufacturingApplicationId);

				list = (List<ManuInspection>)QueryUtil.list(
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
	 * Returns the first manu inspection in the ordered set where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	@Override
	public ManuInspection findBygetMI_CaseIdApplicationId_First(
			String status, long manufacturingApplicationId,
			OrderByComparator<ManuInspection> orderByComparator)
		throws NoSuchManuInspectionException {

		ManuInspection manuInspection = fetchBygetMI_CaseIdApplicationId_First(
			status, manufacturingApplicationId, orderByComparator);

		if (manuInspection != null) {
			return manuInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchManuInspectionException(sb.toString());
	}

	/**
	 * Returns the first manu inspection in the ordered set where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	@Override
	public ManuInspection fetchBygetMI_CaseIdApplicationId_First(
		String status, long manufacturingApplicationId,
		OrderByComparator<ManuInspection> orderByComparator) {

		List<ManuInspection> list = findBygetMI_CaseIdApplicationId(
			status, manufacturingApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last manu inspection in the ordered set where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	@Override
	public ManuInspection findBygetMI_CaseIdApplicationId_Last(
			String status, long manufacturingApplicationId,
			OrderByComparator<ManuInspection> orderByComparator)
		throws NoSuchManuInspectionException {

		ManuInspection manuInspection = fetchBygetMI_CaseIdApplicationId_Last(
			status, manufacturingApplicationId, orderByComparator);

		if (manuInspection != null) {
			return manuInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchManuInspectionException(sb.toString());
	}

	/**
	 * Returns the last manu inspection in the ordered set where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	@Override
	public ManuInspection fetchBygetMI_CaseIdApplicationId_Last(
		String status, long manufacturingApplicationId,
		OrderByComparator<ManuInspection> orderByComparator) {

		int count = countBygetMI_CaseIdApplicationId(
			status, manufacturingApplicationId);

		if (count == 0) {
			return null;
		}

		List<ManuInspection> list = findBygetMI_CaseIdApplicationId(
			status, manufacturingApplicationId, count - 1, count,
			orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the manu inspections before and after the current manu inspection in the ordered set where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param manuInspectionId the primary key of the current manu inspection
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu inspection
	 * @throws NoSuchManuInspectionException if a manu inspection with the primary key could not be found
	 */
	@Override
	public ManuInspection[] findBygetMI_CaseIdApplicationId_PrevAndNext(
			long manuInspectionId, String status,
			long manufacturingApplicationId,
			OrderByComparator<ManuInspection> orderByComparator)
		throws NoSuchManuInspectionException {

		status = Objects.toString(status, "");

		ManuInspection manuInspection = findByPrimaryKey(manuInspectionId);

		Session session = null;

		try {
			session = openSession();

			ManuInspection[] array = new ManuInspectionImpl[3];

			array[0] = getBygetMI_CaseIdApplicationId_PrevAndNext(
				session, manuInspection, status, manufacturingApplicationId,
				orderByComparator, true);

			array[1] = manuInspection;

			array[2] = getBygetMI_CaseIdApplicationId_PrevAndNext(
				session, manuInspection, status, manufacturingApplicationId,
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

	protected ManuInspection getBygetMI_CaseIdApplicationId_PrevAndNext(
		Session session, ManuInspection manuInspection, String status,
		long manufacturingApplicationId,
		OrderByComparator<ManuInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_MANUINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMI_CASEIDAPPLICATIONID_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETMI_CASEIDAPPLICATIONID_STATUS_2);
		}

		sb.append(
			_FINDER_COLUMN_GETMI_CASEIDAPPLICATIONID_MANUFACTURINGAPPLICATIONID_2);

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
			sb.append(ManuInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		queryPos.add(manufacturingApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						manuInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ManuInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the manu inspections where status = &#63; and manufacturingApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	@Override
	public void removeBygetMI_CaseIdApplicationId(
		String status, long manufacturingApplicationId) {

		for (ManuInspection manuInspection :
				findBygetMI_CaseIdApplicationId(
					status, manufacturingApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(manuInspection);
		}
	}

	/**
	 * Returns the number of manu inspections where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu inspections
	 */
	@Override
	public int countBygetMI_CaseIdApplicationId(
		String status, long manufacturingApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetMI_CaseIdApplicationId;

		Object[] finderArgs = new Object[] {status, manufacturingApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MANUINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMI_CASEIDAPPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETMI_CASEIDAPPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETMI_CASEIDAPPLICATIONID_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(manufacturingApplicationId);

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
		_FINDER_COLUMN_GETMI_CASEIDAPPLICATIONID_STATUS_2 =
			"manuInspection.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETMI_CASEIDAPPLICATIONID_STATUS_3 =
			"(manuInspection.status IS NULL OR manuInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETMI_CASEIDAPPLICATIONID_MANUFACTURINGAPPLICATIONID_2 =
			"manuInspection.manufacturingApplicationId = ?";

	private FinderPath
		_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId;
	private FinderPath
		_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId;

	/**
	 * Returns the manu inspection where status = &#63; and slotBookedByUser = &#63; and manufacturingApplicationId = &#63; or throws a <code>NoSuchManuInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	@Override
	public ManuInspection findBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser,
			long manufacturingApplicationId)
		throws NoSuchManuInspectionException {

		ManuInspection manuInspection =
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, manufacturingApplicationId);

		if (manuInspection == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("status=");
			sb.append(status);

			sb.append(", slotBookedByUser=");
			sb.append(slotBookedByUser);

			sb.append(", manufacturingApplicationId=");
			sb.append(manufacturingApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchManuInspectionException(sb.toString());
		}

		return manuInspection;
	}

	/**
	 * Returns the manu inspection where status = &#63; and slotBookedByUser = &#63; and manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	@Override
	public ManuInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser,
			long manufacturingApplicationId) {

		return fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			status, slotBookedByUser, manufacturingApplicationId, true);
	}

	/**
	 * Returns the manu inspection where status = &#63; and slotBookedByUser = &#63; and manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	@Override
	public ManuInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser,
			long manufacturingApplicationId, boolean useFinderCache) {

		status = Objects.toString(status, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				status, slotBookedByUser, manufacturingApplicationId
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
				finderArgs, this);
		}

		if (result instanceof ManuInspection) {
			ManuInspection manuInspection = (ManuInspection)result;

			if (!Objects.equals(status, manuInspection.getStatus()) ||
				(slotBookedByUser != manuInspection.getSlotBookedByUser()) ||
				(manufacturingApplicationId !=
					manuInspection.getManufacturingApplicationId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_MANUINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(
					_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_SLOTBOOKEDBYUSER_2);

			sb.append(
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(slotBookedByUser);

				queryPos.add(manufacturingApplicationId);

				List<ManuInspection> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									status, slotBookedByUser,
									manufacturingApplicationId
								};
							}

							_log.warn(
								"ManuInspectionPersistenceImpl.fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(String, long, long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ManuInspection manuInspection = list.get(0);

					result = manuInspection;

					cacheResult(manuInspection);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (ManuInspection)result;
		}
	}

	/**
	 * Removes the manu inspection where status = &#63; and slotBookedByUser = &#63; and manufacturingApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the manu inspection that was removed
	 */
	@Override
	public ManuInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser,
				long manufacturingApplicationId)
		throws NoSuchManuInspectionException {

		ManuInspection manuInspection =
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, manufacturingApplicationId);

		return remove(manuInspection);
	}

	/**
	 * Returns the number of manu inspections where status = &#63; and slotBookedByUser = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu inspections
	 */
	@Override
	public int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long manufacturingApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath =
			_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId;

		Object[] finderArgs = new Object[] {
			status, slotBookedByUser, manufacturingApplicationId
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_MANUINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(
					_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_SLOTBOOKEDBYUSER_2);

			sb.append(
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(slotBookedByUser);

				queryPos.add(manufacturingApplicationId);

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
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_2 =
			"manuInspection.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_3 =
			"(manuInspection.status IS NULL OR manuInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_SLOTBOOKEDBYUSER_2 =
			"manuInspection.slotBookedByUser = ? AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_MANUFACTURINGAPPLICATIONID_2 =
			"manuInspection.manufacturingApplicationId = ?";

	public ManuInspectionPersistenceImpl() {
		setModelClass(ManuInspection.class);

		setModelImplClass(ManuInspectionImpl.class);
		setModelPKClass(long.class);

		setTable(ManuInspectionTable.INSTANCE);
	}

	/**
	 * Caches the manu inspection in the entity cache if it is enabled.
	 *
	 * @param manuInspection the manu inspection
	 */
	@Override
	public void cacheResult(ManuInspection manuInspection) {
		entityCache.putResult(
			ManuInspectionImpl.class, manuInspection.getPrimaryKey(),
			manuInspection);

		finderCache.putResult(
			_finderPathFetchBygetManuInspectionBy_CI,
			new Object[] {manuInspection.getCaseId()}, manuInspection);

		finderCache.putResult(
			_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
			new Object[] {
				manuInspection.getStatus(),
				manuInspection.getSlotBookedByUser(),
				manuInspection.getManufacturingApplicationId()
			},
			manuInspection);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the manu inspections in the entity cache if it is enabled.
	 *
	 * @param manuInspections the manu inspections
	 */
	@Override
	public void cacheResult(List<ManuInspection> manuInspections) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (manuInspections.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ManuInspection manuInspection : manuInspections) {
			if (entityCache.getResult(
					ManuInspectionImpl.class, manuInspection.getPrimaryKey()) ==
						null) {

				cacheResult(manuInspection);
			}
		}
	}

	/**
	 * Clears the cache for all manu inspections.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ManuInspectionImpl.class);

		finderCache.clearCache(ManuInspectionImpl.class);
	}

	/**
	 * Clears the cache for the manu inspection.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ManuInspection manuInspection) {
		entityCache.removeResult(ManuInspectionImpl.class, manuInspection);
	}

	@Override
	public void clearCache(List<ManuInspection> manuInspections) {
		for (ManuInspection manuInspection : manuInspections) {
			entityCache.removeResult(ManuInspectionImpl.class, manuInspection);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ManuInspectionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(ManuInspectionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		ManuInspectionModelImpl manuInspectionModelImpl) {

		Object[] args = new Object[] {manuInspectionModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetManuInspectionBy_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetManuInspectionBy_CI, args,
			manuInspectionModelImpl);

		args = new Object[] {
			manuInspectionModelImpl.getStatus(),
			manuInspectionModelImpl.getSlotBookedByUser(),
			manuInspectionModelImpl.getManufacturingApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId,
			args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
			args, manuInspectionModelImpl);
	}

	/**
	 * Creates a new manu inspection with the primary key. Does not add the manu inspection to the database.
	 *
	 * @param manuInspectionId the primary key for the new manu inspection
	 * @return the new manu inspection
	 */
	@Override
	public ManuInspection create(long manuInspectionId) {
		ManuInspection manuInspection = new ManuInspectionImpl();

		manuInspection.setNew(true);
		manuInspection.setPrimaryKey(manuInspectionId);

		manuInspection.setCompanyId(CompanyThreadLocal.getCompanyId());

		return manuInspection;
	}

	/**
	 * Removes the manu inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuInspectionId the primary key of the manu inspection
	 * @return the manu inspection that was removed
	 * @throws NoSuchManuInspectionException if a manu inspection with the primary key could not be found
	 */
	@Override
	public ManuInspection remove(long manuInspectionId)
		throws NoSuchManuInspectionException {

		return remove((Serializable)manuInspectionId);
	}

	/**
	 * Removes the manu inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the manu inspection
	 * @return the manu inspection that was removed
	 * @throws NoSuchManuInspectionException if a manu inspection with the primary key could not be found
	 */
	@Override
	public ManuInspection remove(Serializable primaryKey)
		throws NoSuchManuInspectionException {

		Session session = null;

		try {
			session = openSession();

			ManuInspection manuInspection = (ManuInspection)session.get(
				ManuInspectionImpl.class, primaryKey);

			if (manuInspection == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchManuInspectionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(manuInspection);
		}
		catch (NoSuchManuInspectionException noSuchEntityException) {
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
	protected ManuInspection removeImpl(ManuInspection manuInspection) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(manuInspection)) {
				manuInspection = (ManuInspection)session.get(
					ManuInspectionImpl.class,
					manuInspection.getPrimaryKeyObj());
			}

			if (manuInspection != null) {
				session.delete(manuInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (manuInspection != null) {
			clearCache(manuInspection);
		}

		return manuInspection;
	}

	@Override
	public ManuInspection updateImpl(ManuInspection manuInspection) {
		boolean isNew = manuInspection.isNew();

		if (!(manuInspection instanceof ManuInspectionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(manuInspection.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					manuInspection);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in manuInspection proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ManuInspection implementation " +
					manuInspection.getClass());
		}

		ManuInspectionModelImpl manuInspectionModelImpl =
			(ManuInspectionModelImpl)manuInspection;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (manuInspection.getCreateDate() == null)) {
			if (serviceContext == null) {
				manuInspection.setCreateDate(date);
			}
			else {
				manuInspection.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!manuInspectionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				manuInspection.setModifiedDate(date);
			}
			else {
				manuInspection.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(manuInspection);
			}
			else {
				manuInspection = (ManuInspection)session.merge(manuInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ManuInspectionImpl.class, manuInspectionModelImpl, false, true);

		cacheUniqueFindersCache(manuInspectionModelImpl);

		if (isNew) {
			manuInspection.setNew(false);
		}

		manuInspection.resetOriginalValues();

		return manuInspection;
	}

	/**
	 * Returns the manu inspection with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the manu inspection
	 * @return the manu inspection
	 * @throws NoSuchManuInspectionException if a manu inspection with the primary key could not be found
	 */
	@Override
	public ManuInspection findByPrimaryKey(Serializable primaryKey)
		throws NoSuchManuInspectionException {

		ManuInspection manuInspection = fetchByPrimaryKey(primaryKey);

		if (manuInspection == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchManuInspectionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return manuInspection;
	}

	/**
	 * Returns the manu inspection with the primary key or throws a <code>NoSuchManuInspectionException</code> if it could not be found.
	 *
	 * @param manuInspectionId the primary key of the manu inspection
	 * @return the manu inspection
	 * @throws NoSuchManuInspectionException if a manu inspection with the primary key could not be found
	 */
	@Override
	public ManuInspection findByPrimaryKey(long manuInspectionId)
		throws NoSuchManuInspectionException {

		return findByPrimaryKey((Serializable)manuInspectionId);
	}

	/**
	 * Returns the manu inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuInspectionId the primary key of the manu inspection
	 * @return the manu inspection, or <code>null</code> if a manu inspection with the primary key could not be found
	 */
	@Override
	public ManuInspection fetchByPrimaryKey(long manuInspectionId) {
		return fetchByPrimaryKey((Serializable)manuInspectionId);
	}

	/**
	 * Returns all the manu inspections.
	 *
	 * @return the manu inspections
	 */
	@Override
	public List<ManuInspection> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the manu inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @return the range of manu inspections
	 */
	@Override
	public List<ManuInspection> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the manu inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manu inspections
	 */
	@Override
	public List<ManuInspection> findAll(
		int start, int end,
		OrderByComparator<ManuInspection> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the manu inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manu inspections
	 */
	@Override
	public List<ManuInspection> findAll(
		int start, int end, OrderByComparator<ManuInspection> orderByComparator,
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

		List<ManuInspection> list = null;

		if (useFinderCache) {
			list = (List<ManuInspection>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MANUINSPECTION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MANUINSPECTION;

				sql = sql.concat(ManuInspectionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ManuInspection>)QueryUtil.list(
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
	 * Removes all the manu inspections from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ManuInspection manuInspection : findAll()) {
			remove(manuInspection);
		}
	}

	/**
	 * Returns the number of manu inspections.
	 *
	 * @return the number of manu inspections
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_MANUINSPECTION);

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
		return "manuInspectionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MANUINSPECTION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ManuInspectionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the manu inspection persistence.
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

		_finderPathFetchBygetManuInspectionBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetManuInspectionBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetManuInspectionBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetManuInspectionBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetMI_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMI_MAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetMI_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMI_MAI",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathCountBygetMI_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMI_MAI",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, false);

		_finderPathWithPaginationFindBygetMI_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMI_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetMI_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMI_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetMI_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMI_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetMI_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMI_Status",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetMI_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMI_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			true);

		_finderPathCountBygetMI_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMI_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			false);

		_finderPathWithPaginationFindBygetMI_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMI_CaseIdStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"status", "caseId"}, true);

		_finderPathWithoutPaginationFindBygetMI_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetMI_CaseIdStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, true);

		_finderPathCountBygetMI_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMI_CaseIdStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, false);

		_finderPathWithPaginationFindBygetMI_CaseIdApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetMI_CaseIdApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"status", "manufacturingApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetMI_CaseIdApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetMI_CaseIdApplicationId",
				new String[] {String.class.getName(), Long.class.getName()},
				new String[] {"status", "manufacturingApplicationId"}, true);

		_finderPathCountBygetMI_CaseIdApplicationId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMI_CaseIdApplicationId",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"status", "manufacturingApplicationId"}, false);

		_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_ENTITY,
				"fetchBygetInspectionByStatus_SlotBoooked_ApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Long.class.getName()
				},
				new String[] {
					"status", "slotBookedByUser", "manufacturingApplicationId"
				},
				true);

		_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"countBygetInspectionByStatus_SlotBoooked_ApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Long.class.getName()
				},
				new String[] {
					"status", "slotBookedByUser", "manufacturingApplicationId"
				},
				false);

		ManuInspectionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ManuInspectionUtil.setPersistence(null);

		entityCache.removeCache(ManuInspectionImpl.class.getName());
	}

	@Override
	@Reference(
		target = MANUFACTURING_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MANUFACTURING_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MANUFACTURING_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MANUINSPECTION =
		"SELECT manuInspection FROM ManuInspection manuInspection";

	private static final String _SQL_SELECT_MANUINSPECTION_WHERE =
		"SELECT manuInspection FROM ManuInspection manuInspection WHERE ";

	private static final String _SQL_COUNT_MANUINSPECTION =
		"SELECT COUNT(manuInspection) FROM ManuInspection manuInspection";

	private static final String _SQL_COUNT_MANUINSPECTION_WHERE =
		"SELECT COUNT(manuInspection) FROM ManuInspection manuInspection WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "manuInspection.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ManuInspection exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ManuInspection exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ManuInspectionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}