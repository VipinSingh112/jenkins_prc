/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.service.persistence.impl;

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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.fire.brigade.stage.service.exception.NoSuchFireBrigadePaymentConfirmationException;
import com.nbp.fire.brigade.stage.service.model.FireBrigadePaymentConfirmation;
import com.nbp.fire.brigade.stage.service.model.FireBrigadePaymentConfirmationTable;
import com.nbp.fire.brigade.stage.service.model.impl.FireBrigadePaymentConfirmationImpl;
import com.nbp.fire.brigade.stage.service.model.impl.FireBrigadePaymentConfirmationModelImpl;
import com.nbp.fire.brigade.stage.service.service.persistence.FireBrigadePaymentConfirmationPersistence;
import com.nbp.fire.brigade.stage.service.service.persistence.FireBrigadePaymentConfirmationUtil;
import com.nbp.fire.brigade.stage.service.service.persistence.impl.constants.FIRE_BRIGADEPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
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
 * The persistence implementation for the fire brigade payment confirmation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FireBrigadePaymentConfirmationPersistence.class)
public class FireBrigadePaymentConfirmationPersistenceImpl
	extends BasePersistenceImpl<FireBrigadePaymentConfirmation>
	implements FireBrigadePaymentConfirmationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FireBrigadePaymentConfirmationUtil</code> to access the fire brigade payment confirmation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FireBrigadePaymentConfirmationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetFBA_PC_By_FBI;
	private FinderPath _finderPathWithoutPaginationFindBygetFBA_PC_By_FBI;
	private FinderPath _finderPathCountBygetFBA_PC_By_FBI;

	/**
	 * Returns all the fire brigade payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade payment confirmations
	 */
	@Override
	public List<FireBrigadePaymentConfirmation> findBygetFBA_PC_By_FBI(
		String caseId) {

		return findBygetFBA_PC_By_FBI(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fire brigade payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade payment confirmations
	 * @param end the upper bound of the range of fire brigade payment confirmations (not inclusive)
	 * @return the range of matching fire brigade payment confirmations
	 */
	@Override
	public List<FireBrigadePaymentConfirmation> findBygetFBA_PC_By_FBI(
		String caseId, int start, int end) {

		return findBygetFBA_PC_By_FBI(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the fire brigade payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade payment confirmations
	 * @param end the upper bound of the range of fire brigade payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade payment confirmations
	 */
	@Override
	public List<FireBrigadePaymentConfirmation> findBygetFBA_PC_By_FBI(
		String caseId, int start, int end,
		OrderByComparator<FireBrigadePaymentConfirmation> orderByComparator) {

		return findBygetFBA_PC_By_FBI(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fire brigade payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade payment confirmations
	 * @param end the upper bound of the range of fire brigade payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade payment confirmations
	 */
	@Override
	public List<FireBrigadePaymentConfirmation> findBygetFBA_PC_By_FBI(
		String caseId, int start, int end,
		OrderByComparator<FireBrigadePaymentConfirmation> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetFBA_PC_By_FBI;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFBA_PC_By_FBI;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<FireBrigadePaymentConfirmation> list = null;

		if (useFinderCache) {
			list = (List<FireBrigadePaymentConfirmation>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FireBrigadePaymentConfirmation
						fireBrigadePaymentConfirmation : list) {

					if (!caseId.equals(
							fireBrigadePaymentConfirmation.getCaseId())) {

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

			sb.append(_SQL_SELECT_FIREBRIGADEPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFBA_PC_BY_FBI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFBA_PC_BY_FBI_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					FireBrigadePaymentConfirmationModelImpl.ORDER_BY_JPQL);
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

				list = (List<FireBrigadePaymentConfirmation>)QueryUtil.list(
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
	 * Returns the first fire brigade payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade payment confirmation
	 * @throws NoSuchFireBrigadePaymentConfirmationException if a matching fire brigade payment confirmation could not be found
	 */
	@Override
	public FireBrigadePaymentConfirmation findBygetFBA_PC_By_FBI_First(
			String caseId,
			OrderByComparator<FireBrigadePaymentConfirmation> orderByComparator)
		throws NoSuchFireBrigadePaymentConfirmationException {

		FireBrigadePaymentConfirmation fireBrigadePaymentConfirmation =
			fetchBygetFBA_PC_By_FBI_First(caseId, orderByComparator);

		if (fireBrigadePaymentConfirmation != null) {
			return fireBrigadePaymentConfirmation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchFireBrigadePaymentConfirmationException(sb.toString());
	}

	/**
	 * Returns the first fire brigade payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade payment confirmation, or <code>null</code> if a matching fire brigade payment confirmation could not be found
	 */
	@Override
	public FireBrigadePaymentConfirmation fetchBygetFBA_PC_By_FBI_First(
		String caseId,
		OrderByComparator<FireBrigadePaymentConfirmation> orderByComparator) {

		List<FireBrigadePaymentConfirmation> list = findBygetFBA_PC_By_FBI(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last fire brigade payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade payment confirmation
	 * @throws NoSuchFireBrigadePaymentConfirmationException if a matching fire brigade payment confirmation could not be found
	 */
	@Override
	public FireBrigadePaymentConfirmation findBygetFBA_PC_By_FBI_Last(
			String caseId,
			OrderByComparator<FireBrigadePaymentConfirmation> orderByComparator)
		throws NoSuchFireBrigadePaymentConfirmationException {

		FireBrigadePaymentConfirmation fireBrigadePaymentConfirmation =
			fetchBygetFBA_PC_By_FBI_Last(caseId, orderByComparator);

		if (fireBrigadePaymentConfirmation != null) {
			return fireBrigadePaymentConfirmation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchFireBrigadePaymentConfirmationException(sb.toString());
	}

	/**
	 * Returns the last fire brigade payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade payment confirmation, or <code>null</code> if a matching fire brigade payment confirmation could not be found
	 */
	@Override
	public FireBrigadePaymentConfirmation fetchBygetFBA_PC_By_FBI_Last(
		String caseId,
		OrderByComparator<FireBrigadePaymentConfirmation> orderByComparator) {

		int count = countBygetFBA_PC_By_FBI(caseId);

		if (count == 0) {
			return null;
		}

		List<FireBrigadePaymentConfirmation> list = findBygetFBA_PC_By_FBI(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the fire brigade payment confirmations before and after the current fire brigade payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param fireBrigadePaymentConfirId the primary key of the current fire brigade payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade payment confirmation
	 * @throws NoSuchFireBrigadePaymentConfirmationException if a fire brigade payment confirmation with the primary key could not be found
	 */
	@Override
	public FireBrigadePaymentConfirmation[] findBygetFBA_PC_By_FBI_PrevAndNext(
			long fireBrigadePaymentConfirId, String caseId,
			OrderByComparator<FireBrigadePaymentConfirmation> orderByComparator)
		throws NoSuchFireBrigadePaymentConfirmationException {

		caseId = Objects.toString(caseId, "");

		FireBrigadePaymentConfirmation fireBrigadePaymentConfirmation =
			findByPrimaryKey(fireBrigadePaymentConfirId);

		Session session = null;

		try {
			session = openSession();

			FireBrigadePaymentConfirmation[] array =
				new FireBrigadePaymentConfirmationImpl[3];

			array[0] = getBygetFBA_PC_By_FBI_PrevAndNext(
				session, fireBrigadePaymentConfirmation, caseId,
				orderByComparator, true);

			array[1] = fireBrigadePaymentConfirmation;

			array[2] = getBygetFBA_PC_By_FBI_PrevAndNext(
				session, fireBrigadePaymentConfirmation, caseId,
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

	protected FireBrigadePaymentConfirmation getBygetFBA_PC_By_FBI_PrevAndNext(
		Session session,
		FireBrigadePaymentConfirmation fireBrigadePaymentConfirmation,
		String caseId,
		OrderByComparator<FireBrigadePaymentConfirmation> orderByComparator,
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

		sb.append(_SQL_SELECT_FIREBRIGADEPAYMENTCONFIRMATION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETFBA_PC_BY_FBI_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETFBA_PC_BY_FBI_CASEID_2);
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
			sb.append(FireBrigadePaymentConfirmationModelImpl.ORDER_BY_JPQL);
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
						fireBrigadePaymentConfirmation)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FireBrigadePaymentConfirmation> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the fire brigade payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetFBA_PC_By_FBI(String caseId) {
		for (FireBrigadePaymentConfirmation fireBrigadePaymentConfirmation :
				findBygetFBA_PC_By_FBI(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(fireBrigadePaymentConfirmation);
		}
	}

	/**
	 * Returns the number of fire brigade payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching fire brigade payment confirmations
	 */
	@Override
	public int countBygetFBA_PC_By_FBI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetFBA_PC_By_FBI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FIREBRIGADEPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFBA_PC_BY_FBI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFBA_PC_BY_FBI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETFBA_PC_BY_FBI_CASEID_2 =
		"fireBrigadePaymentConfirmation.caseId = ?";

	private static final String _FINDER_COLUMN_GETFBA_PC_BY_FBI_CASEID_3 =
		"(fireBrigadePaymentConfirmation.caseId IS NULL OR fireBrigadePaymentConfirmation.caseId = '')";

	private FinderPath _finderPathFetchBygetFireBrigadePaymentByCaseId;
	private FinderPath _finderPathCountBygetFireBrigadePaymentByCaseId;

	/**
	 * Returns the fire brigade payment confirmation where caseId = &#63; or throws a <code>NoSuchFireBrigadePaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade payment confirmation
	 * @throws NoSuchFireBrigadePaymentConfirmationException if a matching fire brigade payment confirmation could not be found
	 */
	@Override
	public FireBrigadePaymentConfirmation findBygetFireBrigadePaymentByCaseId(
			String caseId)
		throws NoSuchFireBrigadePaymentConfirmationException {

		FireBrigadePaymentConfirmation fireBrigadePaymentConfirmation =
			fetchBygetFireBrigadePaymentByCaseId(caseId);

		if (fireBrigadePaymentConfirmation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFireBrigadePaymentConfirmationException(
				sb.toString());
		}

		return fireBrigadePaymentConfirmation;
	}

	/**
	 * Returns the fire brigade payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade payment confirmation, or <code>null</code> if a matching fire brigade payment confirmation could not be found
	 */
	@Override
	public FireBrigadePaymentConfirmation fetchBygetFireBrigadePaymentByCaseId(
		String caseId) {

		return fetchBygetFireBrigadePaymentByCaseId(caseId, true);
	}

	/**
	 * Returns the fire brigade payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade payment confirmation, or <code>null</code> if a matching fire brigade payment confirmation could not be found
	 */
	@Override
	public FireBrigadePaymentConfirmation fetchBygetFireBrigadePaymentByCaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFireBrigadePaymentByCaseId, finderArgs,
				this);
		}

		if (result instanceof FireBrigadePaymentConfirmation) {
			FireBrigadePaymentConfirmation fireBrigadePaymentConfirmation =
				(FireBrigadePaymentConfirmation)result;

			if (!Objects.equals(
					caseId, fireBrigadePaymentConfirmation.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FIREBRIGADEPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFIREBRIGADEPAYMENTBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETFIREBRIGADEPAYMENTBYCASEID_CASEID_2);
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

				List<FireBrigadePaymentConfirmation> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFireBrigadePaymentByCaseId,
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
								"FireBrigadePaymentConfirmationPersistenceImpl.fetchBygetFireBrigadePaymentByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FireBrigadePaymentConfirmation
						fireBrigadePaymentConfirmation = list.get(0);

					result = fireBrigadePaymentConfirmation;

					cacheResult(fireBrigadePaymentConfirmation);
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
			return (FireBrigadePaymentConfirmation)result;
		}
	}

	/**
	 * Removes the fire brigade payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the fire brigade payment confirmation that was removed
	 */
	@Override
	public FireBrigadePaymentConfirmation removeBygetFireBrigadePaymentByCaseId(
			String caseId)
		throws NoSuchFireBrigadePaymentConfirmationException {

		FireBrigadePaymentConfirmation fireBrigadePaymentConfirmation =
			findBygetFireBrigadePaymentByCaseId(caseId);

		return remove(fireBrigadePaymentConfirmation);
	}

	/**
	 * Returns the number of fire brigade payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching fire brigade payment confirmations
	 */
	@Override
	public int countBygetFireBrigadePaymentByCaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetFireBrigadePaymentByCaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FIREBRIGADEPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFIREBRIGADEPAYMENTBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETFIREBRIGADEPAYMENTBYCASEID_CASEID_2);
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

	private static final String
		_FINDER_COLUMN_GETFIREBRIGADEPAYMENTBYCASEID_CASEID_2 =
			"fireBrigadePaymentConfirmation.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETFIREBRIGADEPAYMENTBYCASEID_CASEID_3 =
			"(fireBrigadePaymentConfirmation.caseId IS NULL OR fireBrigadePaymentConfirmation.caseId = '')";

	public FireBrigadePaymentConfirmationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("comment", "comment_");

		setDBColumnNames(dbColumnNames);

		setModelClass(FireBrigadePaymentConfirmation.class);

		setModelImplClass(FireBrigadePaymentConfirmationImpl.class);
		setModelPKClass(long.class);

		setTable(FireBrigadePaymentConfirmationTable.INSTANCE);
	}

	/**
	 * Caches the fire brigade payment confirmation in the entity cache if it is enabled.
	 *
	 * @param fireBrigadePaymentConfirmation the fire brigade payment confirmation
	 */
	@Override
	public void cacheResult(
		FireBrigadePaymentConfirmation fireBrigadePaymentConfirmation) {

		entityCache.putResult(
			FireBrigadePaymentConfirmationImpl.class,
			fireBrigadePaymentConfirmation.getPrimaryKey(),
			fireBrigadePaymentConfirmation);

		finderCache.putResult(
			_finderPathFetchBygetFireBrigadePaymentByCaseId,
			new Object[] {fireBrigadePaymentConfirmation.getCaseId()},
			fireBrigadePaymentConfirmation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the fire brigade payment confirmations in the entity cache if it is enabled.
	 *
	 * @param fireBrigadePaymentConfirmations the fire brigade payment confirmations
	 */
	@Override
	public void cacheResult(
		List<FireBrigadePaymentConfirmation> fireBrigadePaymentConfirmations) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (fireBrigadePaymentConfirmations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FireBrigadePaymentConfirmation fireBrigadePaymentConfirmation :
				fireBrigadePaymentConfirmations) {

			if (entityCache.getResult(
					FireBrigadePaymentConfirmationImpl.class,
					fireBrigadePaymentConfirmation.getPrimaryKey()) == null) {

				cacheResult(fireBrigadePaymentConfirmation);
			}
		}
	}

	/**
	 * Clears the cache for all fire brigade payment confirmations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FireBrigadePaymentConfirmationImpl.class);

		finderCache.clearCache(FireBrigadePaymentConfirmationImpl.class);
	}

	/**
	 * Clears the cache for the fire brigade payment confirmation.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		FireBrigadePaymentConfirmation fireBrigadePaymentConfirmation) {

		entityCache.removeResult(
			FireBrigadePaymentConfirmationImpl.class,
			fireBrigadePaymentConfirmation);
	}

	@Override
	public void clearCache(
		List<FireBrigadePaymentConfirmation> fireBrigadePaymentConfirmations) {

		for (FireBrigadePaymentConfirmation fireBrigadePaymentConfirmation :
				fireBrigadePaymentConfirmations) {

			entityCache.removeResult(
				FireBrigadePaymentConfirmationImpl.class,
				fireBrigadePaymentConfirmation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FireBrigadePaymentConfirmationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FireBrigadePaymentConfirmationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FireBrigadePaymentConfirmationModelImpl
			fireBrigadePaymentConfirmationModelImpl) {

		Object[] args = new Object[] {
			fireBrigadePaymentConfirmationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetFireBrigadePaymentByCaseId, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFireBrigadePaymentByCaseId, args,
			fireBrigadePaymentConfirmationModelImpl);
	}

	/**
	 * Creates a new fire brigade payment confirmation with the primary key. Does not add the fire brigade payment confirmation to the database.
	 *
	 * @param fireBrigadePaymentConfirId the primary key for the new fire brigade payment confirmation
	 * @return the new fire brigade payment confirmation
	 */
	@Override
	public FireBrigadePaymentConfirmation create(
		long fireBrigadePaymentConfirId) {

		FireBrigadePaymentConfirmation fireBrigadePaymentConfirmation =
			new FireBrigadePaymentConfirmationImpl();

		fireBrigadePaymentConfirmation.setNew(true);
		fireBrigadePaymentConfirmation.setPrimaryKey(
			fireBrigadePaymentConfirId);

		fireBrigadePaymentConfirmation.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return fireBrigadePaymentConfirmation;
	}

	/**
	 * Removes the fire brigade payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadePaymentConfirId the primary key of the fire brigade payment confirmation
	 * @return the fire brigade payment confirmation that was removed
	 * @throws NoSuchFireBrigadePaymentConfirmationException if a fire brigade payment confirmation with the primary key could not be found
	 */
	@Override
	public FireBrigadePaymentConfirmation remove(
			long fireBrigadePaymentConfirId)
		throws NoSuchFireBrigadePaymentConfirmationException {

		return remove((Serializable)fireBrigadePaymentConfirId);
	}

	/**
	 * Removes the fire brigade payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the fire brigade payment confirmation
	 * @return the fire brigade payment confirmation that was removed
	 * @throws NoSuchFireBrigadePaymentConfirmationException if a fire brigade payment confirmation with the primary key could not be found
	 */
	@Override
	public FireBrigadePaymentConfirmation remove(Serializable primaryKey)
		throws NoSuchFireBrigadePaymentConfirmationException {

		Session session = null;

		try {
			session = openSession();

			FireBrigadePaymentConfirmation fireBrigadePaymentConfirmation =
				(FireBrigadePaymentConfirmation)session.get(
					FireBrigadePaymentConfirmationImpl.class, primaryKey);

			if (fireBrigadePaymentConfirmation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFireBrigadePaymentConfirmationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(fireBrigadePaymentConfirmation);
		}
		catch (NoSuchFireBrigadePaymentConfirmationException
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
	protected FireBrigadePaymentConfirmation removeImpl(
		FireBrigadePaymentConfirmation fireBrigadePaymentConfirmation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fireBrigadePaymentConfirmation)) {
				fireBrigadePaymentConfirmation =
					(FireBrigadePaymentConfirmation)session.get(
						FireBrigadePaymentConfirmationImpl.class,
						fireBrigadePaymentConfirmation.getPrimaryKeyObj());
			}

			if (fireBrigadePaymentConfirmation != null) {
				session.delete(fireBrigadePaymentConfirmation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (fireBrigadePaymentConfirmation != null) {
			clearCache(fireBrigadePaymentConfirmation);
		}

		return fireBrigadePaymentConfirmation;
	}

	@Override
	public FireBrigadePaymentConfirmation updateImpl(
		FireBrigadePaymentConfirmation fireBrigadePaymentConfirmation) {

		boolean isNew = fireBrigadePaymentConfirmation.isNew();

		if (!(fireBrigadePaymentConfirmation instanceof
				FireBrigadePaymentConfirmationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					fireBrigadePaymentConfirmation.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					fireBrigadePaymentConfirmation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in fireBrigadePaymentConfirmation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FireBrigadePaymentConfirmation implementation " +
					fireBrigadePaymentConfirmation.getClass());
		}

		FireBrigadePaymentConfirmationModelImpl
			fireBrigadePaymentConfirmationModelImpl =
				(FireBrigadePaymentConfirmationModelImpl)
					fireBrigadePaymentConfirmation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (fireBrigadePaymentConfirmation.getCreateDate() == null)) {
			if (serviceContext == null) {
				fireBrigadePaymentConfirmation.setCreateDate(date);
			}
			else {
				fireBrigadePaymentConfirmation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!fireBrigadePaymentConfirmationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				fireBrigadePaymentConfirmation.setModifiedDate(date);
			}
			else {
				fireBrigadePaymentConfirmation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(fireBrigadePaymentConfirmation);
			}
			else {
				fireBrigadePaymentConfirmation =
					(FireBrigadePaymentConfirmation)session.merge(
						fireBrigadePaymentConfirmation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FireBrigadePaymentConfirmationImpl.class,
			fireBrigadePaymentConfirmationModelImpl, false, true);

		cacheUniqueFindersCache(fireBrigadePaymentConfirmationModelImpl);

		if (isNew) {
			fireBrigadePaymentConfirmation.setNew(false);
		}

		fireBrigadePaymentConfirmation.resetOriginalValues();

		return fireBrigadePaymentConfirmation;
	}

	/**
	 * Returns the fire brigade payment confirmation with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the fire brigade payment confirmation
	 * @return the fire brigade payment confirmation
	 * @throws NoSuchFireBrigadePaymentConfirmationException if a fire brigade payment confirmation with the primary key could not be found
	 */
	@Override
	public FireBrigadePaymentConfirmation findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchFireBrigadePaymentConfirmationException {

		FireBrigadePaymentConfirmation fireBrigadePaymentConfirmation =
			fetchByPrimaryKey(primaryKey);

		if (fireBrigadePaymentConfirmation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFireBrigadePaymentConfirmationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return fireBrigadePaymentConfirmation;
	}

	/**
	 * Returns the fire brigade payment confirmation with the primary key or throws a <code>NoSuchFireBrigadePaymentConfirmationException</code> if it could not be found.
	 *
	 * @param fireBrigadePaymentConfirId the primary key of the fire brigade payment confirmation
	 * @return the fire brigade payment confirmation
	 * @throws NoSuchFireBrigadePaymentConfirmationException if a fire brigade payment confirmation with the primary key could not be found
	 */
	@Override
	public FireBrigadePaymentConfirmation findByPrimaryKey(
			long fireBrigadePaymentConfirId)
		throws NoSuchFireBrigadePaymentConfirmationException {

		return findByPrimaryKey((Serializable)fireBrigadePaymentConfirId);
	}

	/**
	 * Returns the fire brigade payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadePaymentConfirId the primary key of the fire brigade payment confirmation
	 * @return the fire brigade payment confirmation, or <code>null</code> if a fire brigade payment confirmation with the primary key could not be found
	 */
	@Override
	public FireBrigadePaymentConfirmation fetchByPrimaryKey(
		long fireBrigadePaymentConfirId) {

		return fetchByPrimaryKey((Serializable)fireBrigadePaymentConfirId);
	}

	/**
	 * Returns all the fire brigade payment confirmations.
	 *
	 * @return the fire brigade payment confirmations
	 */
	@Override
	public List<FireBrigadePaymentConfirmation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fire brigade payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade payment confirmations
	 * @param end the upper bound of the range of fire brigade payment confirmations (not inclusive)
	 * @return the range of fire brigade payment confirmations
	 */
	@Override
	public List<FireBrigadePaymentConfirmation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the fire brigade payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade payment confirmations
	 * @param end the upper bound of the range of fire brigade payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade payment confirmations
	 */
	@Override
	public List<FireBrigadePaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<FireBrigadePaymentConfirmation> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fire brigade payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade payment confirmations
	 * @param end the upper bound of the range of fire brigade payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade payment confirmations
	 */
	@Override
	public List<FireBrigadePaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<FireBrigadePaymentConfirmation> orderByComparator,
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

		List<FireBrigadePaymentConfirmation> list = null;

		if (useFinderCache) {
			list = (List<FireBrigadePaymentConfirmation>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FIREBRIGADEPAYMENTCONFIRMATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FIREBRIGADEPAYMENTCONFIRMATION;

				sql = sql.concat(
					FireBrigadePaymentConfirmationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FireBrigadePaymentConfirmation>)QueryUtil.list(
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
	 * Removes all the fire brigade payment confirmations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FireBrigadePaymentConfirmation fireBrigadePaymentConfirmation :
				findAll()) {

			remove(fireBrigadePaymentConfirmation);
		}
	}

	/**
	 * Returns the number of fire brigade payment confirmations.
	 *
	 * @return the number of fire brigade payment confirmations
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
					_SQL_COUNT_FIREBRIGADEPAYMENTCONFIRMATION);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "fireBrigadePaymentConfirId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FIREBRIGADEPAYMENTCONFIRMATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FireBrigadePaymentConfirmationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the fire brigade payment confirmation persistence.
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

		_finderPathWithPaginationFindBygetFBA_PC_By_FBI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetFBA_PC_By_FBI",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetFBA_PC_By_FBI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetFBA_PC_By_FBI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetFBA_PC_By_FBI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFBA_PC_By_FBI", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		_finderPathFetchBygetFireBrigadePaymentByCaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFireBrigadePaymentByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetFireBrigadePaymentByCaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFireBrigadePaymentByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		FireBrigadePaymentConfirmationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FireBrigadePaymentConfirmationUtil.setPersistence(null);

		entityCache.removeCache(
			FireBrigadePaymentConfirmationImpl.class.getName());
	}

	@Override
	@Reference(
		target = FIRE_BRIGADEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FIRE_BRIGADEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FIRE_BRIGADEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FIREBRIGADEPAYMENTCONFIRMATION =
		"SELECT fireBrigadePaymentConfirmation FROM FireBrigadePaymentConfirmation fireBrigadePaymentConfirmation";

	private static final String
		_SQL_SELECT_FIREBRIGADEPAYMENTCONFIRMATION_WHERE =
			"SELECT fireBrigadePaymentConfirmation FROM FireBrigadePaymentConfirmation fireBrigadePaymentConfirmation WHERE ";

	private static final String _SQL_COUNT_FIREBRIGADEPAYMENTCONFIRMATION =
		"SELECT COUNT(fireBrigadePaymentConfirmation) FROM FireBrigadePaymentConfirmation fireBrigadePaymentConfirmation";

	private static final String
		_SQL_COUNT_FIREBRIGADEPAYMENTCONFIRMATION_WHERE =
			"SELECT COUNT(fireBrigadePaymentConfirmation) FROM FireBrigadePaymentConfirmation fireBrigadePaymentConfirmation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"fireBrigadePaymentConfirmation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FireBrigadePaymentConfirmation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FireBrigadePaymentConfirmation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FireBrigadePaymentConfirmationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"comment"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}