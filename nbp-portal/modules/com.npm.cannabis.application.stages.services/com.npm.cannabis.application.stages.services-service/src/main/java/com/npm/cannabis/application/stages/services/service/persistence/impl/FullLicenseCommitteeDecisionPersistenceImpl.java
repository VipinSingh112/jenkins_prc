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
import com.liferay.portal.kernel.util.StringUtil;

import com.npm.cannabis.application.stages.services.exception.NoSuchFullLicenseCommitteeDecisionException;
import com.npm.cannabis.application.stages.services.model.FullLicenseCommitteeDecision;
import com.npm.cannabis.application.stages.services.model.FullLicenseCommitteeDecisionTable;
import com.npm.cannabis.application.stages.services.model.impl.FullLicenseCommitteeDecisionImpl;
import com.npm.cannabis.application.stages.services.model.impl.FullLicenseCommitteeDecisionModelImpl;
import com.npm.cannabis.application.stages.services.service.persistence.FullLicenseCommitteeDecisionPersistence;
import com.npm.cannabis.application.stages.services.service.persistence.FullLicenseCommitteeDecisionUtil;
import com.npm.cannabis.application.stages.services.service.persistence.impl.constants.CANNABIS_STAGESPersistenceConstants;

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
 * The persistence implementation for the full license committee decision service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FullLicenseCommitteeDecisionPersistence.class)
public class FullLicenseCommitteeDecisionPersistenceImpl
	extends BasePersistenceImpl<FullLicenseCommitteeDecision>
	implements FullLicenseCommitteeDecisionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FullLicenseCommitteeDecisionUtil</code> to access the full license committee decision persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FullLicenseCommitteeDecisionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetFLCD_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetFLCD_CaseId;
	private FinderPath _finderPathCountBygetFLCD_CaseId;

	/**
	 * Returns all the full license committee decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching full license committee decisions
	 */
	@Override
	public List<FullLicenseCommitteeDecision> findBygetFLCD_CaseId(
		String caseId) {

		return findBygetFLCD_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the full license committee decisions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FullLicenseCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of full license committee decisions
	 * @param end the upper bound of the range of full license committee decisions (not inclusive)
	 * @return the range of matching full license committee decisions
	 */
	@Override
	public List<FullLicenseCommitteeDecision> findBygetFLCD_CaseId(
		String caseId, int start, int end) {

		return findBygetFLCD_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the full license committee decisions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FullLicenseCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of full license committee decisions
	 * @param end the upper bound of the range of full license committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching full license committee decisions
	 */
	@Override
	public List<FullLicenseCommitteeDecision> findBygetFLCD_CaseId(
		String caseId, int start, int end,
		OrderByComparator<FullLicenseCommitteeDecision> orderByComparator) {

		return findBygetFLCD_CaseId(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the full license committee decisions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FullLicenseCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of full license committee decisions
	 * @param end the upper bound of the range of full license committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching full license committee decisions
	 */
	@Override
	public List<FullLicenseCommitteeDecision> findBygetFLCD_CaseId(
		String caseId, int start, int end,
		OrderByComparator<FullLicenseCommitteeDecision> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetFLCD_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFLCD_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<FullLicenseCommitteeDecision> list = null;

		if (useFinderCache) {
			list = (List<FullLicenseCommitteeDecision>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FullLicenseCommitteeDecision fullLicenseCommitteeDecision :
						list) {

					if (!caseId.equals(
							fullLicenseCommitteeDecision.getCaseId())) {

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

			sb.append(_SQL_SELECT_FULLLICENSECOMMITTEEDECISION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFLCD_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFLCD_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FullLicenseCommitteeDecisionModelImpl.ORDER_BY_JPQL);
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

				list = (List<FullLicenseCommitteeDecision>)QueryUtil.list(
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
	 * Returns the first full license committee decision in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching full license committee decision
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a matching full license committee decision could not be found
	 */
	@Override
	public FullLicenseCommitteeDecision findBygetFLCD_CaseId_First(
			String caseId,
			OrderByComparator<FullLicenseCommitteeDecision> orderByComparator)
		throws NoSuchFullLicenseCommitteeDecisionException {

		FullLicenseCommitteeDecision fullLicenseCommitteeDecision =
			fetchBygetFLCD_CaseId_First(caseId, orderByComparator);

		if (fullLicenseCommitteeDecision != null) {
			return fullLicenseCommitteeDecision;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchFullLicenseCommitteeDecisionException(sb.toString());
	}

	/**
	 * Returns the first full license committee decision in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching full license committee decision, or <code>null</code> if a matching full license committee decision could not be found
	 */
	@Override
	public FullLicenseCommitteeDecision fetchBygetFLCD_CaseId_First(
		String caseId,
		OrderByComparator<FullLicenseCommitteeDecision> orderByComparator) {

		List<FullLicenseCommitteeDecision> list = findBygetFLCD_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last full license committee decision in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching full license committee decision
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a matching full license committee decision could not be found
	 */
	@Override
	public FullLicenseCommitteeDecision findBygetFLCD_CaseId_Last(
			String caseId,
			OrderByComparator<FullLicenseCommitteeDecision> orderByComparator)
		throws NoSuchFullLicenseCommitteeDecisionException {

		FullLicenseCommitteeDecision fullLicenseCommitteeDecision =
			fetchBygetFLCD_CaseId_Last(caseId, orderByComparator);

		if (fullLicenseCommitteeDecision != null) {
			return fullLicenseCommitteeDecision;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchFullLicenseCommitteeDecisionException(sb.toString());
	}

	/**
	 * Returns the last full license committee decision in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching full license committee decision, or <code>null</code> if a matching full license committee decision could not be found
	 */
	@Override
	public FullLicenseCommitteeDecision fetchBygetFLCD_CaseId_Last(
		String caseId,
		OrderByComparator<FullLicenseCommitteeDecision> orderByComparator) {

		int count = countBygetFLCD_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<FullLicenseCommitteeDecision> list = findBygetFLCD_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the full license committee decisions before and after the current full license committee decision in the ordered set where caseId = &#63;.
	 *
	 * @param fullLicenseCommitteeDecisionId the primary key of the current full license committee decision
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next full license committee decision
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a full license committee decision with the primary key could not be found
	 */
	@Override
	public FullLicenseCommitteeDecision[] findBygetFLCD_CaseId_PrevAndNext(
			long fullLicenseCommitteeDecisionId, String caseId,
			OrderByComparator<FullLicenseCommitteeDecision> orderByComparator)
		throws NoSuchFullLicenseCommitteeDecisionException {

		caseId = Objects.toString(caseId, "");

		FullLicenseCommitteeDecision fullLicenseCommitteeDecision =
			findByPrimaryKey(fullLicenseCommitteeDecisionId);

		Session session = null;

		try {
			session = openSession();

			FullLicenseCommitteeDecision[] array =
				new FullLicenseCommitteeDecisionImpl[3];

			array[0] = getBygetFLCD_CaseId_PrevAndNext(
				session, fullLicenseCommitteeDecision, caseId,
				orderByComparator, true);

			array[1] = fullLicenseCommitteeDecision;

			array[2] = getBygetFLCD_CaseId_PrevAndNext(
				session, fullLicenseCommitteeDecision, caseId,
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

	protected FullLicenseCommitteeDecision getBygetFLCD_CaseId_PrevAndNext(
		Session session,
		FullLicenseCommitteeDecision fullLicenseCommitteeDecision,
		String caseId,
		OrderByComparator<FullLicenseCommitteeDecision> orderByComparator,
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

		sb.append(_SQL_SELECT_FULLLICENSECOMMITTEEDECISION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETFLCD_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETFLCD_CASEID_CASEID_2);
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
			sb.append(FullLicenseCommitteeDecisionModelImpl.ORDER_BY_JPQL);
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
						fullLicenseCommitteeDecision)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FullLicenseCommitteeDecision> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the full license committee decisions where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetFLCD_CaseId(String caseId) {
		for (FullLicenseCommitteeDecision fullLicenseCommitteeDecision :
				findBygetFLCD_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(fullLicenseCommitteeDecision);
		}
	}

	/**
	 * Returns the number of full license committee decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching full license committee decisions
	 */
	@Override
	public int countBygetFLCD_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetFLCD_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FULLLICENSECOMMITTEEDECISION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFLCD_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFLCD_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETFLCD_CASEID_CASEID_2 =
		"fullLicenseCommitteeDecision.caseId = ?";

	private static final String _FINDER_COLUMN_GETFLCD_CASEID_CASEID_3 =
		"(fullLicenseCommitteeDecision.caseId IS NULL OR fullLicenseCommitteeDecision.caseId = '')";

	private FinderPath _finderPathFetchBygetFLCD_By_CaseId;
	private FinderPath _finderPathCountBygetFLCD_By_CaseId;

	/**
	 * Returns the full license committee decision where caseId = &#63; or throws a <code>NoSuchFullLicenseCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching full license committee decision
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a matching full license committee decision could not be found
	 */
	@Override
	public FullLicenseCommitteeDecision findBygetFLCD_By_CaseId(String caseId)
		throws NoSuchFullLicenseCommitteeDecisionException {

		FullLicenseCommitteeDecision fullLicenseCommitteeDecision =
			fetchBygetFLCD_By_CaseId(caseId);

		if (fullLicenseCommitteeDecision == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFullLicenseCommitteeDecisionException(
				sb.toString());
		}

		return fullLicenseCommitteeDecision;
	}

	/**
	 * Returns the full license committee decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching full license committee decision, or <code>null</code> if a matching full license committee decision could not be found
	 */
	@Override
	public FullLicenseCommitteeDecision fetchBygetFLCD_By_CaseId(
		String caseId) {

		return fetchBygetFLCD_By_CaseId(caseId, true);
	}

	/**
	 * Returns the full license committee decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching full license committee decision, or <code>null</code> if a matching full license committee decision could not be found
	 */
	@Override
	public FullLicenseCommitteeDecision fetchBygetFLCD_By_CaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFLCD_By_CaseId, finderArgs, this);
		}

		if (result instanceof FullLicenseCommitteeDecision) {
			FullLicenseCommitteeDecision fullLicenseCommitteeDecision =
				(FullLicenseCommitteeDecision)result;

			if (!Objects.equals(
					caseId, fullLicenseCommitteeDecision.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FULLLICENSECOMMITTEEDECISION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFLCD_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFLCD_BY_CASEID_CASEID_2);
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

				List<FullLicenseCommitteeDecision> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFLCD_By_CaseId, finderArgs,
							list);
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
								"FullLicenseCommitteeDecisionPersistenceImpl.fetchBygetFLCD_By_CaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FullLicenseCommitteeDecision fullLicenseCommitteeDecision =
						list.get(0);

					result = fullLicenseCommitteeDecision;

					cacheResult(fullLicenseCommitteeDecision);
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
			return (FullLicenseCommitteeDecision)result;
		}
	}

	/**
	 * Removes the full license committee decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the full license committee decision that was removed
	 */
	@Override
	public FullLicenseCommitteeDecision removeBygetFLCD_By_CaseId(String caseId)
		throws NoSuchFullLicenseCommitteeDecisionException {

		FullLicenseCommitteeDecision fullLicenseCommitteeDecision =
			findBygetFLCD_By_CaseId(caseId);

		return remove(fullLicenseCommitteeDecision);
	}

	/**
	 * Returns the number of full license committee decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching full license committee decisions
	 */
	@Override
	public int countBygetFLCD_By_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetFLCD_By_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FULLLICENSECOMMITTEEDECISION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFLCD_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFLCD_BY_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETFLCD_BY_CASEID_CASEID_2 =
		"fullLicenseCommitteeDecision.caseId = ?";

	private static final String _FINDER_COLUMN_GETFLCD_BY_CASEID_CASEID_3 =
		"(fullLicenseCommitteeDecision.caseId IS NULL OR fullLicenseCommitteeDecision.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetFLCD_CD;
	private FinderPath _finderPathWithoutPaginationFindBygetFLCD_CD;
	private FinderPath _finderPathCountBygetFLCD_CD;

	/**
	 * Returns all the full license committee decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the matching full license committee decisions
	 */
	@Override
	public List<FullLicenseCommitteeDecision> findBygetFLCD_CD(
		String committeeDecision) {

		return findBygetFLCD_CD(
			committeeDecision, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the full license committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FullLicenseCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of full license committee decisions
	 * @param end the upper bound of the range of full license committee decisions (not inclusive)
	 * @return the range of matching full license committee decisions
	 */
	@Override
	public List<FullLicenseCommitteeDecision> findBygetFLCD_CD(
		String committeeDecision, int start, int end) {

		return findBygetFLCD_CD(committeeDecision, start, end, null);
	}

	/**
	 * Returns an ordered range of all the full license committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FullLicenseCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of full license committee decisions
	 * @param end the upper bound of the range of full license committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching full license committee decisions
	 */
	@Override
	public List<FullLicenseCommitteeDecision> findBygetFLCD_CD(
		String committeeDecision, int start, int end,
		OrderByComparator<FullLicenseCommitteeDecision> orderByComparator) {

		return findBygetFLCD_CD(
			committeeDecision, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the full license committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FullLicenseCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of full license committee decisions
	 * @param end the upper bound of the range of full license committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching full license committee decisions
	 */
	@Override
	public List<FullLicenseCommitteeDecision> findBygetFLCD_CD(
		String committeeDecision, int start, int end,
		OrderByComparator<FullLicenseCommitteeDecision> orderByComparator,
		boolean useFinderCache) {

		committeeDecision = Objects.toString(committeeDecision, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetFLCD_CD;
				finderArgs = new Object[] {committeeDecision};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFLCD_CD;
			finderArgs = new Object[] {
				committeeDecision, start, end, orderByComparator
			};
		}

		List<FullLicenseCommitteeDecision> list = null;

		if (useFinderCache) {
			list = (List<FullLicenseCommitteeDecision>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FullLicenseCommitteeDecision fullLicenseCommitteeDecision :
						list) {

					if (!committeeDecision.equals(
							fullLicenseCommitteeDecision.
								getCommitteeDecision())) {

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

			sb.append(_SQL_SELECT_FULLLICENSECOMMITTEEDECISION_WHERE);

			boolean bindCommitteeDecision = false;

			if (committeeDecision.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFLCD_CD_COMMITTEEDECISION_3);
			}
			else {
				bindCommitteeDecision = true;

				sb.append(_FINDER_COLUMN_GETFLCD_CD_COMMITTEEDECISION_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FullLicenseCommitteeDecisionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCommitteeDecision) {
					queryPos.add(committeeDecision);
				}

				list = (List<FullLicenseCommitteeDecision>)QueryUtil.list(
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
	 * Returns the first full license committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching full license committee decision
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a matching full license committee decision could not be found
	 */
	@Override
	public FullLicenseCommitteeDecision findBygetFLCD_CD_First(
			String committeeDecision,
			OrderByComparator<FullLicenseCommitteeDecision> orderByComparator)
		throws NoSuchFullLicenseCommitteeDecisionException {

		FullLicenseCommitteeDecision fullLicenseCommitteeDecision =
			fetchBygetFLCD_CD_First(committeeDecision, orderByComparator);

		if (fullLicenseCommitteeDecision != null) {
			return fullLicenseCommitteeDecision;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("committeeDecision=");
		sb.append(committeeDecision);

		sb.append("}");

		throw new NoSuchFullLicenseCommitteeDecisionException(sb.toString());
	}

	/**
	 * Returns the first full license committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching full license committee decision, or <code>null</code> if a matching full license committee decision could not be found
	 */
	@Override
	public FullLicenseCommitteeDecision fetchBygetFLCD_CD_First(
		String committeeDecision,
		OrderByComparator<FullLicenseCommitteeDecision> orderByComparator) {

		List<FullLicenseCommitteeDecision> list = findBygetFLCD_CD(
			committeeDecision, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last full license committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching full license committee decision
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a matching full license committee decision could not be found
	 */
	@Override
	public FullLicenseCommitteeDecision findBygetFLCD_CD_Last(
			String committeeDecision,
			OrderByComparator<FullLicenseCommitteeDecision> orderByComparator)
		throws NoSuchFullLicenseCommitteeDecisionException {

		FullLicenseCommitteeDecision fullLicenseCommitteeDecision =
			fetchBygetFLCD_CD_Last(committeeDecision, orderByComparator);

		if (fullLicenseCommitteeDecision != null) {
			return fullLicenseCommitteeDecision;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("committeeDecision=");
		sb.append(committeeDecision);

		sb.append("}");

		throw new NoSuchFullLicenseCommitteeDecisionException(sb.toString());
	}

	/**
	 * Returns the last full license committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching full license committee decision, or <code>null</code> if a matching full license committee decision could not be found
	 */
	@Override
	public FullLicenseCommitteeDecision fetchBygetFLCD_CD_Last(
		String committeeDecision,
		OrderByComparator<FullLicenseCommitteeDecision> orderByComparator) {

		int count = countBygetFLCD_CD(committeeDecision);

		if (count == 0) {
			return null;
		}

		List<FullLicenseCommitteeDecision> list = findBygetFLCD_CD(
			committeeDecision, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the full license committee decisions before and after the current full license committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param fullLicenseCommitteeDecisionId the primary key of the current full license committee decision
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next full license committee decision
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a full license committee decision with the primary key could not be found
	 */
	@Override
	public FullLicenseCommitteeDecision[] findBygetFLCD_CD_PrevAndNext(
			long fullLicenseCommitteeDecisionId, String committeeDecision,
			OrderByComparator<FullLicenseCommitteeDecision> orderByComparator)
		throws NoSuchFullLicenseCommitteeDecisionException {

		committeeDecision = Objects.toString(committeeDecision, "");

		FullLicenseCommitteeDecision fullLicenseCommitteeDecision =
			findByPrimaryKey(fullLicenseCommitteeDecisionId);

		Session session = null;

		try {
			session = openSession();

			FullLicenseCommitteeDecision[] array =
				new FullLicenseCommitteeDecisionImpl[3];

			array[0] = getBygetFLCD_CD_PrevAndNext(
				session, fullLicenseCommitteeDecision, committeeDecision,
				orderByComparator, true);

			array[1] = fullLicenseCommitteeDecision;

			array[2] = getBygetFLCD_CD_PrevAndNext(
				session, fullLicenseCommitteeDecision, committeeDecision,
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

	protected FullLicenseCommitteeDecision getBygetFLCD_CD_PrevAndNext(
		Session session,
		FullLicenseCommitteeDecision fullLicenseCommitteeDecision,
		String committeeDecision,
		OrderByComparator<FullLicenseCommitteeDecision> orderByComparator,
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

		sb.append(_SQL_SELECT_FULLLICENSECOMMITTEEDECISION_WHERE);

		boolean bindCommitteeDecision = false;

		if (committeeDecision.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETFLCD_CD_COMMITTEEDECISION_3);
		}
		else {
			bindCommitteeDecision = true;

			sb.append(_FINDER_COLUMN_GETFLCD_CD_COMMITTEEDECISION_2);
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
			sb.append(FullLicenseCommitteeDecisionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCommitteeDecision) {
			queryPos.add(committeeDecision);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						fullLicenseCommitteeDecision)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FullLicenseCommitteeDecision> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the full license committee decisions where committeeDecision = &#63; from the database.
	 *
	 * @param committeeDecision the committee decision
	 */
	@Override
	public void removeBygetFLCD_CD(String committeeDecision) {
		for (FullLicenseCommitteeDecision fullLicenseCommitteeDecision :
				findBygetFLCD_CD(
					committeeDecision, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(fullLicenseCommitteeDecision);
		}
	}

	/**
	 * Returns the number of full license committee decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the number of matching full license committee decisions
	 */
	@Override
	public int countBygetFLCD_CD(String committeeDecision) {
		committeeDecision = Objects.toString(committeeDecision, "");

		FinderPath finderPath = _finderPathCountBygetFLCD_CD;

		Object[] finderArgs = new Object[] {committeeDecision};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FULLLICENSECOMMITTEEDECISION_WHERE);

			boolean bindCommitteeDecision = false;

			if (committeeDecision.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFLCD_CD_COMMITTEEDECISION_3);
			}
			else {
				bindCommitteeDecision = true;

				sb.append(_FINDER_COLUMN_GETFLCD_CD_COMMITTEEDECISION_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCommitteeDecision) {
					queryPos.add(committeeDecision);
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

	private static final String _FINDER_COLUMN_GETFLCD_CD_COMMITTEEDECISION_2 =
		"fullLicenseCommitteeDecision.committeeDecision = ?";

	private static final String _FINDER_COLUMN_GETFLCD_CD_COMMITTEEDECISION_3 =
		"(fullLicenseCommitteeDecision.committeeDecision IS NULL OR fullLicenseCommitteeDecision.committeeDecision = '')";

	private FinderPath _finderPathFetchBygetFLCD_CD_caseId;
	private FinderPath _finderPathCountBygetFLCD_CD_caseId;

	/**
	 * Returns the full license committee decision where committeeDecision = &#63; and caseId = &#63; or throws a <code>NoSuchFullLicenseCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param committeeDecision the committee decision
	 * @param caseId the case ID
	 * @return the matching full license committee decision
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a matching full license committee decision could not be found
	 */
	@Override
	public FullLicenseCommitteeDecision findBygetFLCD_CD_caseId(
			String committeeDecision, String caseId)
		throws NoSuchFullLicenseCommitteeDecisionException {

		FullLicenseCommitteeDecision fullLicenseCommitteeDecision =
			fetchBygetFLCD_CD_caseId(committeeDecision, caseId);

		if (fullLicenseCommitteeDecision == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("committeeDecision=");
			sb.append(committeeDecision);

			sb.append(", caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFullLicenseCommitteeDecisionException(
				sb.toString());
		}

		return fullLicenseCommitteeDecision;
	}

	/**
	 * Returns the full license committee decision where committeeDecision = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param committeeDecision the committee decision
	 * @param caseId the case ID
	 * @return the matching full license committee decision, or <code>null</code> if a matching full license committee decision could not be found
	 */
	@Override
	public FullLicenseCommitteeDecision fetchBygetFLCD_CD_caseId(
		String committeeDecision, String caseId) {

		return fetchBygetFLCD_CD_caseId(committeeDecision, caseId, true);
	}

	/**
	 * Returns the full license committee decision where committeeDecision = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param committeeDecision the committee decision
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching full license committee decision, or <code>null</code> if a matching full license committee decision could not be found
	 */
	@Override
	public FullLicenseCommitteeDecision fetchBygetFLCD_CD_caseId(
		String committeeDecision, String caseId, boolean useFinderCache) {

		committeeDecision = Objects.toString(committeeDecision, "");
		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {committeeDecision, caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFLCD_CD_caseId, finderArgs, this);
		}

		if (result instanceof FullLicenseCommitteeDecision) {
			FullLicenseCommitteeDecision fullLicenseCommitteeDecision =
				(FullLicenseCommitteeDecision)result;

			if (!Objects.equals(
					committeeDecision,
					fullLicenseCommitteeDecision.getCommitteeDecision()) ||
				!Objects.equals(
					caseId, fullLicenseCommitteeDecision.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_FULLLICENSECOMMITTEEDECISION_WHERE);

			boolean bindCommitteeDecision = false;

			if (committeeDecision.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFLCD_CD_CASEID_COMMITTEEDECISION_3);
			}
			else {
				bindCommitteeDecision = true;

				sb.append(_FINDER_COLUMN_GETFLCD_CD_CASEID_COMMITTEEDECISION_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFLCD_CD_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFLCD_CD_CASEID_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCommitteeDecision) {
					queryPos.add(committeeDecision);
				}

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				List<FullLicenseCommitteeDecision> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFLCD_CD_caseId, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									committeeDecision, caseId
								};
							}

							_log.warn(
								"FullLicenseCommitteeDecisionPersistenceImpl.fetchBygetFLCD_CD_caseId(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FullLicenseCommitteeDecision fullLicenseCommitteeDecision =
						list.get(0);

					result = fullLicenseCommitteeDecision;

					cacheResult(fullLicenseCommitteeDecision);
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
			return (FullLicenseCommitteeDecision)result;
		}
	}

	/**
	 * Removes the full license committee decision where committeeDecision = &#63; and caseId = &#63; from the database.
	 *
	 * @param committeeDecision the committee decision
	 * @param caseId the case ID
	 * @return the full license committee decision that was removed
	 */
	@Override
	public FullLicenseCommitteeDecision removeBygetFLCD_CD_caseId(
			String committeeDecision, String caseId)
		throws NoSuchFullLicenseCommitteeDecisionException {

		FullLicenseCommitteeDecision fullLicenseCommitteeDecision =
			findBygetFLCD_CD_caseId(committeeDecision, caseId);

		return remove(fullLicenseCommitteeDecision);
	}

	/**
	 * Returns the number of full license committee decisions where committeeDecision = &#63; and caseId = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param caseId the case ID
	 * @return the number of matching full license committee decisions
	 */
	@Override
	public int countBygetFLCD_CD_caseId(
		String committeeDecision, String caseId) {

		committeeDecision = Objects.toString(committeeDecision, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetFLCD_CD_caseId;

		Object[] finderArgs = new Object[] {committeeDecision, caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FULLLICENSECOMMITTEEDECISION_WHERE);

			boolean bindCommitteeDecision = false;

			if (committeeDecision.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFLCD_CD_CASEID_COMMITTEEDECISION_3);
			}
			else {
				bindCommitteeDecision = true;

				sb.append(_FINDER_COLUMN_GETFLCD_CD_CASEID_COMMITTEEDECISION_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFLCD_CD_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFLCD_CD_CASEID_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCommitteeDecision) {
					queryPos.add(committeeDecision);
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

	private static final String
		_FINDER_COLUMN_GETFLCD_CD_CASEID_COMMITTEEDECISION_2 =
			"fullLicenseCommitteeDecision.committeeDecision = ? AND ";

	private static final String
		_FINDER_COLUMN_GETFLCD_CD_CASEID_COMMITTEEDECISION_3 =
			"(fullLicenseCommitteeDecision.committeeDecision IS NULL OR fullLicenseCommitteeDecision.committeeDecision = '') AND ";

	private static final String _FINDER_COLUMN_GETFLCD_CD_CASEID_CASEID_2 =
		"fullLicenseCommitteeDecision.caseId = ?";

	private static final String _FINDER_COLUMN_GETFLCD_CD_CASEID_CASEID_3 =
		"(fullLicenseCommitteeDecision.caseId IS NULL OR fullLicenseCommitteeDecision.caseId = '')";

	public FullLicenseCommitteeDecisionPersistenceImpl() {
		setModelClass(FullLicenseCommitteeDecision.class);

		setModelImplClass(FullLicenseCommitteeDecisionImpl.class);
		setModelPKClass(long.class);

		setTable(FullLicenseCommitteeDecisionTable.INSTANCE);
	}

	/**
	 * Caches the full license committee decision in the entity cache if it is enabled.
	 *
	 * @param fullLicenseCommitteeDecision the full license committee decision
	 */
	@Override
	public void cacheResult(
		FullLicenseCommitteeDecision fullLicenseCommitteeDecision) {

		entityCache.putResult(
			FullLicenseCommitteeDecisionImpl.class,
			fullLicenseCommitteeDecision.getPrimaryKey(),
			fullLicenseCommitteeDecision);

		finderCache.putResult(
			_finderPathFetchBygetFLCD_By_CaseId,
			new Object[] {fullLicenseCommitteeDecision.getCaseId()},
			fullLicenseCommitteeDecision);

		finderCache.putResult(
			_finderPathFetchBygetFLCD_CD_caseId,
			new Object[] {
				fullLicenseCommitteeDecision.getCommitteeDecision(),
				fullLicenseCommitteeDecision.getCaseId()
			},
			fullLicenseCommitteeDecision);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the full license committee decisions in the entity cache if it is enabled.
	 *
	 * @param fullLicenseCommitteeDecisions the full license committee decisions
	 */
	@Override
	public void cacheResult(
		List<FullLicenseCommitteeDecision> fullLicenseCommitteeDecisions) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (fullLicenseCommitteeDecisions.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FullLicenseCommitteeDecision fullLicenseCommitteeDecision :
				fullLicenseCommitteeDecisions) {

			if (entityCache.getResult(
					FullLicenseCommitteeDecisionImpl.class,
					fullLicenseCommitteeDecision.getPrimaryKey()) == null) {

				cacheResult(fullLicenseCommitteeDecision);
			}
		}
	}

	/**
	 * Clears the cache for all full license committee decisions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FullLicenseCommitteeDecisionImpl.class);

		finderCache.clearCache(FullLicenseCommitteeDecisionImpl.class);
	}

	/**
	 * Clears the cache for the full license committee decision.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		FullLicenseCommitteeDecision fullLicenseCommitteeDecision) {

		entityCache.removeResult(
			FullLicenseCommitteeDecisionImpl.class,
			fullLicenseCommitteeDecision);
	}

	@Override
	public void clearCache(
		List<FullLicenseCommitteeDecision> fullLicenseCommitteeDecisions) {

		for (FullLicenseCommitteeDecision fullLicenseCommitteeDecision :
				fullLicenseCommitteeDecisions) {

			entityCache.removeResult(
				FullLicenseCommitteeDecisionImpl.class,
				fullLicenseCommitteeDecision);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FullLicenseCommitteeDecisionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FullLicenseCommitteeDecisionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FullLicenseCommitteeDecisionModelImpl
			fullLicenseCommitteeDecisionModelImpl) {

		Object[] args = new Object[] {
			fullLicenseCommitteeDecisionModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetFLCD_By_CaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFLCD_By_CaseId, args,
			fullLicenseCommitteeDecisionModelImpl);

		args = new Object[] {
			fullLicenseCommitteeDecisionModelImpl.getCommitteeDecision(),
			fullLicenseCommitteeDecisionModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetFLCD_CD_caseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFLCD_CD_caseId, args,
			fullLicenseCommitteeDecisionModelImpl);
	}

	/**
	 * Creates a new full license committee decision with the primary key. Does not add the full license committee decision to the database.
	 *
	 * @param fullLicenseCommitteeDecisionId the primary key for the new full license committee decision
	 * @return the new full license committee decision
	 */
	@Override
	public FullLicenseCommitteeDecision create(
		long fullLicenseCommitteeDecisionId) {

		FullLicenseCommitteeDecision fullLicenseCommitteeDecision =
			new FullLicenseCommitteeDecisionImpl();

		fullLicenseCommitteeDecision.setNew(true);
		fullLicenseCommitteeDecision.setPrimaryKey(
			fullLicenseCommitteeDecisionId);

		fullLicenseCommitteeDecision.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return fullLicenseCommitteeDecision;
	}

	/**
	 * Removes the full license committee decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fullLicenseCommitteeDecisionId the primary key of the full license committee decision
	 * @return the full license committee decision that was removed
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a full license committee decision with the primary key could not be found
	 */
	@Override
	public FullLicenseCommitteeDecision remove(
			long fullLicenseCommitteeDecisionId)
		throws NoSuchFullLicenseCommitteeDecisionException {

		return remove((Serializable)fullLicenseCommitteeDecisionId);
	}

	/**
	 * Removes the full license committee decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the full license committee decision
	 * @return the full license committee decision that was removed
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a full license committee decision with the primary key could not be found
	 */
	@Override
	public FullLicenseCommitteeDecision remove(Serializable primaryKey)
		throws NoSuchFullLicenseCommitteeDecisionException {

		Session session = null;

		try {
			session = openSession();

			FullLicenseCommitteeDecision fullLicenseCommitteeDecision =
				(FullLicenseCommitteeDecision)session.get(
					FullLicenseCommitteeDecisionImpl.class, primaryKey);

			if (fullLicenseCommitteeDecision == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFullLicenseCommitteeDecisionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(fullLicenseCommitteeDecision);
		}
		catch (NoSuchFullLicenseCommitteeDecisionException
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
	protected FullLicenseCommitteeDecision removeImpl(
		FullLicenseCommitteeDecision fullLicenseCommitteeDecision) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fullLicenseCommitteeDecision)) {
				fullLicenseCommitteeDecision =
					(FullLicenseCommitteeDecision)session.get(
						FullLicenseCommitteeDecisionImpl.class,
						fullLicenseCommitteeDecision.getPrimaryKeyObj());
			}

			if (fullLicenseCommitteeDecision != null) {
				session.delete(fullLicenseCommitteeDecision);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (fullLicenseCommitteeDecision != null) {
			clearCache(fullLicenseCommitteeDecision);
		}

		return fullLicenseCommitteeDecision;
	}

	@Override
	public FullLicenseCommitteeDecision updateImpl(
		FullLicenseCommitteeDecision fullLicenseCommitteeDecision) {

		boolean isNew = fullLicenseCommitteeDecision.isNew();

		if (!(fullLicenseCommitteeDecision instanceof
				FullLicenseCommitteeDecisionModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					fullLicenseCommitteeDecision.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					fullLicenseCommitteeDecision);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in fullLicenseCommitteeDecision proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FullLicenseCommitteeDecision implementation " +
					fullLicenseCommitteeDecision.getClass());
		}

		FullLicenseCommitteeDecisionModelImpl
			fullLicenseCommitteeDecisionModelImpl =
				(FullLicenseCommitteeDecisionModelImpl)
					fullLicenseCommitteeDecision;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (fullLicenseCommitteeDecision.getCreateDate() == null)) {
			if (serviceContext == null) {
				fullLicenseCommitteeDecision.setCreateDate(date);
			}
			else {
				fullLicenseCommitteeDecision.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!fullLicenseCommitteeDecisionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				fullLicenseCommitteeDecision.setModifiedDate(date);
			}
			else {
				fullLicenseCommitteeDecision.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(fullLicenseCommitteeDecision);
			}
			else {
				fullLicenseCommitteeDecision =
					(FullLicenseCommitteeDecision)session.merge(
						fullLicenseCommitteeDecision);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FullLicenseCommitteeDecisionImpl.class,
			fullLicenseCommitteeDecisionModelImpl, false, true);

		cacheUniqueFindersCache(fullLicenseCommitteeDecisionModelImpl);

		if (isNew) {
			fullLicenseCommitteeDecision.setNew(false);
		}

		fullLicenseCommitteeDecision.resetOriginalValues();

		return fullLicenseCommitteeDecision;
	}

	/**
	 * Returns the full license committee decision with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the full license committee decision
	 * @return the full license committee decision
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a full license committee decision with the primary key could not be found
	 */
	@Override
	public FullLicenseCommitteeDecision findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchFullLicenseCommitteeDecisionException {

		FullLicenseCommitteeDecision fullLicenseCommitteeDecision =
			fetchByPrimaryKey(primaryKey);

		if (fullLicenseCommitteeDecision == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFullLicenseCommitteeDecisionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return fullLicenseCommitteeDecision;
	}

	/**
	 * Returns the full license committee decision with the primary key or throws a <code>NoSuchFullLicenseCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param fullLicenseCommitteeDecisionId the primary key of the full license committee decision
	 * @return the full license committee decision
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a full license committee decision with the primary key could not be found
	 */
	@Override
	public FullLicenseCommitteeDecision findByPrimaryKey(
			long fullLicenseCommitteeDecisionId)
		throws NoSuchFullLicenseCommitteeDecisionException {

		return findByPrimaryKey((Serializable)fullLicenseCommitteeDecisionId);
	}

	/**
	 * Returns the full license committee decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fullLicenseCommitteeDecisionId the primary key of the full license committee decision
	 * @return the full license committee decision, or <code>null</code> if a full license committee decision with the primary key could not be found
	 */
	@Override
	public FullLicenseCommitteeDecision fetchByPrimaryKey(
		long fullLicenseCommitteeDecisionId) {

		return fetchByPrimaryKey((Serializable)fullLicenseCommitteeDecisionId);
	}

	/**
	 * Returns all the full license committee decisions.
	 *
	 * @return the full license committee decisions
	 */
	@Override
	public List<FullLicenseCommitteeDecision> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the full license committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FullLicenseCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of full license committee decisions
	 * @param end the upper bound of the range of full license committee decisions (not inclusive)
	 * @return the range of full license committee decisions
	 */
	@Override
	public List<FullLicenseCommitteeDecision> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the full license committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FullLicenseCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of full license committee decisions
	 * @param end the upper bound of the range of full license committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of full license committee decisions
	 */
	@Override
	public List<FullLicenseCommitteeDecision> findAll(
		int start, int end,
		OrderByComparator<FullLicenseCommitteeDecision> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the full license committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FullLicenseCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of full license committee decisions
	 * @param end the upper bound of the range of full license committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of full license committee decisions
	 */
	@Override
	public List<FullLicenseCommitteeDecision> findAll(
		int start, int end,
		OrderByComparator<FullLicenseCommitteeDecision> orderByComparator,
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

		List<FullLicenseCommitteeDecision> list = null;

		if (useFinderCache) {
			list = (List<FullLicenseCommitteeDecision>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FULLLICENSECOMMITTEEDECISION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FULLLICENSECOMMITTEEDECISION;

				sql = sql.concat(
					FullLicenseCommitteeDecisionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FullLicenseCommitteeDecision>)QueryUtil.list(
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
	 * Removes all the full license committee decisions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FullLicenseCommitteeDecision fullLicenseCommitteeDecision :
				findAll()) {

			remove(fullLicenseCommitteeDecision);
		}
	}

	/**
	 * Returns the number of full license committee decisions.
	 *
	 * @return the number of full license committee decisions
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
					_SQL_COUNT_FULLLICENSECOMMITTEEDECISION);

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
		return "fullLicenseCommitteeDecisionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FULLLICENSECOMMITTEEDECISION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FullLicenseCommitteeDecisionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the full license committee decision persistence.
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

		_finderPathWithPaginationFindBygetFLCD_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetFLCD_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetFLCD_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetFLCD_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetFLCD_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFLCD_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathFetchBygetFLCD_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFLCD_By_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetFLCD_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFLCD_By_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		_finderPathWithPaginationFindBygetFLCD_CD = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetFLCD_CD",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"committeeDecision"}, true);

		_finderPathWithoutPaginationFindBygetFLCD_CD = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetFLCD_CD",
			new String[] {String.class.getName()},
			new String[] {"committeeDecision"}, true);

		_finderPathCountBygetFLCD_CD = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFLCD_CD",
			new String[] {String.class.getName()},
			new String[] {"committeeDecision"}, false);

		_finderPathFetchBygetFLCD_CD_caseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFLCD_CD_caseId",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"committeeDecision", "caseId"}, true);

		_finderPathCountBygetFLCD_CD_caseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFLCD_CD_caseId",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"committeeDecision", "caseId"}, false);

		FullLicenseCommitteeDecisionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FullLicenseCommitteeDecisionUtil.setPersistence(null);

		entityCache.removeCache(
			FullLicenseCommitteeDecisionImpl.class.getName());
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

	private static final String _SQL_SELECT_FULLLICENSECOMMITTEEDECISION =
		"SELECT fullLicenseCommitteeDecision FROM FullLicenseCommitteeDecision fullLicenseCommitteeDecision";

	private static final String _SQL_SELECT_FULLLICENSECOMMITTEEDECISION_WHERE =
		"SELECT fullLicenseCommitteeDecision FROM FullLicenseCommitteeDecision fullLicenseCommitteeDecision WHERE ";

	private static final String _SQL_COUNT_FULLLICENSECOMMITTEEDECISION =
		"SELECT COUNT(fullLicenseCommitteeDecision) FROM FullLicenseCommitteeDecision fullLicenseCommitteeDecision";

	private static final String _SQL_COUNT_FULLLICENSECOMMITTEEDECISION_WHERE =
		"SELECT COUNT(fullLicenseCommitteeDecision) FROM FullLicenseCommitteeDecision fullLicenseCommitteeDecision WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"fullLicenseCommitteeDecision.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FullLicenseCommitteeDecision exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FullLicenseCommitteeDecision exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FullLicenseCommitteeDecisionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}