/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.service.persistence.impl;

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

import com.nbp.medical.stages.service.exception.NoSuchMedicalPaymentConfirmationException;
import com.nbp.medical.stages.service.model.MedicalPaymentConfirmation;
import com.nbp.medical.stages.service.model.MedicalPaymentConfirmationTable;
import com.nbp.medical.stages.service.model.impl.MedicalPaymentConfirmationImpl;
import com.nbp.medical.stages.service.model.impl.MedicalPaymentConfirmationModelImpl;
import com.nbp.medical.stages.service.service.persistence.MedicalPaymentConfirmationPersistence;
import com.nbp.medical.stages.service.service.persistence.MedicalPaymentConfirmationUtil;
import com.nbp.medical.stages.service.service.persistence.impl.constants.MEDICAL_STAGESPersistenceConstants;

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
 * The persistence implementation for the medical payment confirmation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MedicalPaymentConfirmationPersistence.class)
public class MedicalPaymentConfirmationPersistenceImpl
	extends BasePersistenceImpl<MedicalPaymentConfirmation>
	implements MedicalPaymentConfirmationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MedicalPaymentConfirmationUtil</code> to access the medical payment confirmation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MedicalPaymentConfirmationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetMedicalPaymentConfBy_CI;
	private FinderPath _finderPathCountBygetMedicalPaymentConfBy_CI;

	/**
	 * Returns the medical payment confirmation where caseId = &#63; or throws a <code>NoSuchMedicalPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching medical payment confirmation
	 * @throws NoSuchMedicalPaymentConfirmationException if a matching medical payment confirmation could not be found
	 */
	@Override
	public MedicalPaymentConfirmation findBygetMedicalPaymentConfBy_CI(
			String caseId)
		throws NoSuchMedicalPaymentConfirmationException {

		MedicalPaymentConfirmation medicalPaymentConfirmation =
			fetchBygetMedicalPaymentConfBy_CI(caseId);

		if (medicalPaymentConfirmation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMedicalPaymentConfirmationException(sb.toString());
		}

		return medicalPaymentConfirmation;
	}

	/**
	 * Returns the medical payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching medical payment confirmation, or <code>null</code> if a matching medical payment confirmation could not be found
	 */
	@Override
	public MedicalPaymentConfirmation fetchBygetMedicalPaymentConfBy_CI(
		String caseId) {

		return fetchBygetMedicalPaymentConfBy_CI(caseId, true);
	}

	/**
	 * Returns the medical payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical payment confirmation, or <code>null</code> if a matching medical payment confirmation could not be found
	 */
	@Override
	public MedicalPaymentConfirmation fetchBygetMedicalPaymentConfBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMedicalPaymentConfBy_CI, finderArgs, this);
		}

		if (result instanceof MedicalPaymentConfirmation) {
			MedicalPaymentConfirmation medicalPaymentConfirmation =
				(MedicalPaymentConfirmation)result;

			if (!Objects.equals(
					caseId, medicalPaymentConfirmation.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MEDICALPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMEDICALPAYMENTCONFBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMEDICALPAYMENTCONFBY_CI_CASEID_2);
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

				List<MedicalPaymentConfirmation> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMedicalPaymentConfBy_CI,
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
								"MedicalPaymentConfirmationPersistenceImpl.fetchBygetMedicalPaymentConfBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MedicalPaymentConfirmation medicalPaymentConfirmation =
						list.get(0);

					result = medicalPaymentConfirmation;

					cacheResult(medicalPaymentConfirmation);
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
			return (MedicalPaymentConfirmation)result;
		}
	}

	/**
	 * Removes the medical payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the medical payment confirmation that was removed
	 */
	@Override
	public MedicalPaymentConfirmation removeBygetMedicalPaymentConfBy_CI(
			String caseId)
		throws NoSuchMedicalPaymentConfirmationException {

		MedicalPaymentConfirmation medicalPaymentConfirmation =
			findBygetMedicalPaymentConfBy_CI(caseId);

		return remove(medicalPaymentConfirmation);
	}

	/**
	 * Returns the number of medical payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching medical payment confirmations
	 */
	@Override
	public int countBygetMedicalPaymentConfBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetMedicalPaymentConfBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMEDICALPAYMENTCONFBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMEDICALPAYMENTCONFBY_CI_CASEID_2);
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
		_FINDER_COLUMN_GETMEDICALPAYMENTCONFBY_CI_CASEID_2 =
			"medicalPaymentConfirmation.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETMEDICALPAYMENTCONFBY_CI_CASEID_3 =
			"(medicalPaymentConfirmation.caseId IS NULL OR medicalPaymentConfirmation.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetMedicalPayConfBy_CI;
	private FinderPath _finderPathWithoutPaginationFindBygetMedicalPayConfBy_CI;
	private FinderPath _finderPathCountBygetMedicalPayConfBy_CI;

	/**
	 * Returns all the medical payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching medical payment confirmations
	 */
	@Override
	public List<MedicalPaymentConfirmation> findBygetMedicalPayConfBy_CI(
		String caseId) {

		return findBygetMedicalPayConfBy_CI(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical payment confirmations
	 * @param end the upper bound of the range of medical payment confirmations (not inclusive)
	 * @return the range of matching medical payment confirmations
	 */
	@Override
	public List<MedicalPaymentConfirmation> findBygetMedicalPayConfBy_CI(
		String caseId, int start, int end) {

		return findBygetMedicalPayConfBy_CI(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical payment confirmations
	 * @param end the upper bound of the range of medical payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical payment confirmations
	 */
	@Override
	public List<MedicalPaymentConfirmation> findBygetMedicalPayConfBy_CI(
		String caseId, int start, int end,
		OrderByComparator<MedicalPaymentConfirmation> orderByComparator) {

		return findBygetMedicalPayConfBy_CI(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical payment confirmations
	 * @param end the upper bound of the range of medical payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical payment confirmations
	 */
	@Override
	public List<MedicalPaymentConfirmation> findBygetMedicalPayConfBy_CI(
		String caseId, int start, int end,
		OrderByComparator<MedicalPaymentConfirmation> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetMedicalPayConfBy_CI;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMedicalPayConfBy_CI;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<MedicalPaymentConfirmation> list = null;

		if (useFinderCache) {
			list = (List<MedicalPaymentConfirmation>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalPaymentConfirmation medicalPaymentConfirmation :
						list) {

					if (!caseId.equals(
							medicalPaymentConfirmation.getCaseId())) {

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

			sb.append(_SQL_SELECT_MEDICALPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMEDICALPAYCONFBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMEDICALPAYCONFBY_CI_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MedicalPaymentConfirmationModelImpl.ORDER_BY_JPQL);
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

				list = (List<MedicalPaymentConfirmation>)QueryUtil.list(
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
	 * Returns the first medical payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical payment confirmation
	 * @throws NoSuchMedicalPaymentConfirmationException if a matching medical payment confirmation could not be found
	 */
	@Override
	public MedicalPaymentConfirmation findBygetMedicalPayConfBy_CI_First(
			String caseId,
			OrderByComparator<MedicalPaymentConfirmation> orderByComparator)
		throws NoSuchMedicalPaymentConfirmationException {

		MedicalPaymentConfirmation medicalPaymentConfirmation =
			fetchBygetMedicalPayConfBy_CI_First(caseId, orderByComparator);

		if (medicalPaymentConfirmation != null) {
			return medicalPaymentConfirmation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchMedicalPaymentConfirmationException(sb.toString());
	}

	/**
	 * Returns the first medical payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical payment confirmation, or <code>null</code> if a matching medical payment confirmation could not be found
	 */
	@Override
	public MedicalPaymentConfirmation fetchBygetMedicalPayConfBy_CI_First(
		String caseId,
		OrderByComparator<MedicalPaymentConfirmation> orderByComparator) {

		List<MedicalPaymentConfirmation> list = findBygetMedicalPayConfBy_CI(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical payment confirmation
	 * @throws NoSuchMedicalPaymentConfirmationException if a matching medical payment confirmation could not be found
	 */
	@Override
	public MedicalPaymentConfirmation findBygetMedicalPayConfBy_CI_Last(
			String caseId,
			OrderByComparator<MedicalPaymentConfirmation> orderByComparator)
		throws NoSuchMedicalPaymentConfirmationException {

		MedicalPaymentConfirmation medicalPaymentConfirmation =
			fetchBygetMedicalPayConfBy_CI_Last(caseId, orderByComparator);

		if (medicalPaymentConfirmation != null) {
			return medicalPaymentConfirmation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchMedicalPaymentConfirmationException(sb.toString());
	}

	/**
	 * Returns the last medical payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical payment confirmation, or <code>null</code> if a matching medical payment confirmation could not be found
	 */
	@Override
	public MedicalPaymentConfirmation fetchBygetMedicalPayConfBy_CI_Last(
		String caseId,
		OrderByComparator<MedicalPaymentConfirmation> orderByComparator) {

		int count = countBygetMedicalPayConfBy_CI(caseId);

		if (count == 0) {
			return null;
		}

		List<MedicalPaymentConfirmation> list = findBygetMedicalPayConfBy_CI(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical payment confirmations before and after the current medical payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param medicalPaymentConfirmationId the primary key of the current medical payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical payment confirmation
	 * @throws NoSuchMedicalPaymentConfirmationException if a medical payment confirmation with the primary key could not be found
	 */
	@Override
	public MedicalPaymentConfirmation[]
			findBygetMedicalPayConfBy_CI_PrevAndNext(
				long medicalPaymentConfirmationId, String caseId,
				OrderByComparator<MedicalPaymentConfirmation> orderByComparator)
		throws NoSuchMedicalPaymentConfirmationException {

		caseId = Objects.toString(caseId, "");

		MedicalPaymentConfirmation medicalPaymentConfirmation =
			findByPrimaryKey(medicalPaymentConfirmationId);

		Session session = null;

		try {
			session = openSession();

			MedicalPaymentConfirmation[] array =
				new MedicalPaymentConfirmationImpl[3];

			array[0] = getBygetMedicalPayConfBy_CI_PrevAndNext(
				session, medicalPaymentConfirmation, caseId, orderByComparator,
				true);

			array[1] = medicalPaymentConfirmation;

			array[2] = getBygetMedicalPayConfBy_CI_PrevAndNext(
				session, medicalPaymentConfirmation, caseId, orderByComparator,
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

	protected MedicalPaymentConfirmation
		getBygetMedicalPayConfBy_CI_PrevAndNext(
			Session session,
			MedicalPaymentConfirmation medicalPaymentConfirmation,
			String caseId,
			OrderByComparator<MedicalPaymentConfirmation> orderByComparator,
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

		sb.append(_SQL_SELECT_MEDICALPAYMENTCONFIRMATION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMEDICALPAYCONFBY_CI_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETMEDICALPAYCONFBY_CI_CASEID_2);
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
			sb.append(MedicalPaymentConfirmationModelImpl.ORDER_BY_JPQL);
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
						medicalPaymentConfirmation)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalPaymentConfirmation> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetMedicalPayConfBy_CI(String caseId) {
		for (MedicalPaymentConfirmation medicalPaymentConfirmation :
				findBygetMedicalPayConfBy_CI(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(medicalPaymentConfirmation);
		}
	}

	/**
	 * Returns the number of medical payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching medical payment confirmations
	 */
	@Override
	public int countBygetMedicalPayConfBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetMedicalPayConfBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMEDICALPAYCONFBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMEDICALPAYCONFBY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETMEDICALPAYCONFBY_CI_CASEID_2 =
		"medicalPaymentConfirmation.caseId = ?";

	private static final String _FINDER_COLUMN_GETMEDICALPAYCONFBY_CI_CASEID_3 =
		"(medicalPaymentConfirmation.caseId IS NULL OR medicalPaymentConfirmation.caseId = '')";

	public MedicalPaymentConfirmationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("comment", "comment_");

		setDBColumnNames(dbColumnNames);

		setModelClass(MedicalPaymentConfirmation.class);

		setModelImplClass(MedicalPaymentConfirmationImpl.class);
		setModelPKClass(long.class);

		setTable(MedicalPaymentConfirmationTable.INSTANCE);
	}

	/**
	 * Caches the medical payment confirmation in the entity cache if it is enabled.
	 *
	 * @param medicalPaymentConfirmation the medical payment confirmation
	 */
	@Override
	public void cacheResult(
		MedicalPaymentConfirmation medicalPaymentConfirmation) {

		entityCache.putResult(
			MedicalPaymentConfirmationImpl.class,
			medicalPaymentConfirmation.getPrimaryKey(),
			medicalPaymentConfirmation);

		finderCache.putResult(
			_finderPathFetchBygetMedicalPaymentConfBy_CI,
			new Object[] {medicalPaymentConfirmation.getCaseId()},
			medicalPaymentConfirmation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the medical payment confirmations in the entity cache if it is enabled.
	 *
	 * @param medicalPaymentConfirmations the medical payment confirmations
	 */
	@Override
	public void cacheResult(
		List<MedicalPaymentConfirmation> medicalPaymentConfirmations) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (medicalPaymentConfirmations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MedicalPaymentConfirmation medicalPaymentConfirmation :
				medicalPaymentConfirmations) {

			if (entityCache.getResult(
					MedicalPaymentConfirmationImpl.class,
					medicalPaymentConfirmation.getPrimaryKey()) == null) {

				cacheResult(medicalPaymentConfirmation);
			}
		}
	}

	/**
	 * Clears the cache for all medical payment confirmations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MedicalPaymentConfirmationImpl.class);

		finderCache.clearCache(MedicalPaymentConfirmationImpl.class);
	}

	/**
	 * Clears the cache for the medical payment confirmation.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		MedicalPaymentConfirmation medicalPaymentConfirmation) {

		entityCache.removeResult(
			MedicalPaymentConfirmationImpl.class, medicalPaymentConfirmation);
	}

	@Override
	public void clearCache(
		List<MedicalPaymentConfirmation> medicalPaymentConfirmations) {

		for (MedicalPaymentConfirmation medicalPaymentConfirmation :
				medicalPaymentConfirmations) {

			entityCache.removeResult(
				MedicalPaymentConfirmationImpl.class,
				medicalPaymentConfirmation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MedicalPaymentConfirmationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MedicalPaymentConfirmationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MedicalPaymentConfirmationModelImpl
			medicalPaymentConfirmationModelImpl) {

		Object[] args = new Object[] {
			medicalPaymentConfirmationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetMedicalPaymentConfBy_CI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMedicalPaymentConfBy_CI, args,
			medicalPaymentConfirmationModelImpl);
	}

	/**
	 * Creates a new medical payment confirmation with the primary key. Does not add the medical payment confirmation to the database.
	 *
	 * @param medicalPaymentConfirmationId the primary key for the new medical payment confirmation
	 * @return the new medical payment confirmation
	 */
	@Override
	public MedicalPaymentConfirmation create(
		long medicalPaymentConfirmationId) {

		MedicalPaymentConfirmation medicalPaymentConfirmation =
			new MedicalPaymentConfirmationImpl();

		medicalPaymentConfirmation.setNew(true);
		medicalPaymentConfirmation.setPrimaryKey(medicalPaymentConfirmationId);

		medicalPaymentConfirmation.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return medicalPaymentConfirmation;
	}

	/**
	 * Removes the medical payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalPaymentConfirmationId the primary key of the medical payment confirmation
	 * @return the medical payment confirmation that was removed
	 * @throws NoSuchMedicalPaymentConfirmationException if a medical payment confirmation with the primary key could not be found
	 */
	@Override
	public MedicalPaymentConfirmation remove(long medicalPaymentConfirmationId)
		throws NoSuchMedicalPaymentConfirmationException {

		return remove((Serializable)medicalPaymentConfirmationId);
	}

	/**
	 * Removes the medical payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the medical payment confirmation
	 * @return the medical payment confirmation that was removed
	 * @throws NoSuchMedicalPaymentConfirmationException if a medical payment confirmation with the primary key could not be found
	 */
	@Override
	public MedicalPaymentConfirmation remove(Serializable primaryKey)
		throws NoSuchMedicalPaymentConfirmationException {

		Session session = null;

		try {
			session = openSession();

			MedicalPaymentConfirmation medicalPaymentConfirmation =
				(MedicalPaymentConfirmation)session.get(
					MedicalPaymentConfirmationImpl.class, primaryKey);

			if (medicalPaymentConfirmation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMedicalPaymentConfirmationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(medicalPaymentConfirmation);
		}
		catch (NoSuchMedicalPaymentConfirmationException
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
	protected MedicalPaymentConfirmation removeImpl(
		MedicalPaymentConfirmation medicalPaymentConfirmation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(medicalPaymentConfirmation)) {
				medicalPaymentConfirmation =
					(MedicalPaymentConfirmation)session.get(
						MedicalPaymentConfirmationImpl.class,
						medicalPaymentConfirmation.getPrimaryKeyObj());
			}

			if (medicalPaymentConfirmation != null) {
				session.delete(medicalPaymentConfirmation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (medicalPaymentConfirmation != null) {
			clearCache(medicalPaymentConfirmation);
		}

		return medicalPaymentConfirmation;
	}

	@Override
	public MedicalPaymentConfirmation updateImpl(
		MedicalPaymentConfirmation medicalPaymentConfirmation) {

		boolean isNew = medicalPaymentConfirmation.isNew();

		if (!(medicalPaymentConfirmation instanceof
				MedicalPaymentConfirmationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(medicalPaymentConfirmation.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					medicalPaymentConfirmation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in medicalPaymentConfirmation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MedicalPaymentConfirmation implementation " +
					medicalPaymentConfirmation.getClass());
		}

		MedicalPaymentConfirmationModelImpl
			medicalPaymentConfirmationModelImpl =
				(MedicalPaymentConfirmationModelImpl)medicalPaymentConfirmation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (medicalPaymentConfirmation.getCreateDate() == null)) {
			if (serviceContext == null) {
				medicalPaymentConfirmation.setCreateDate(date);
			}
			else {
				medicalPaymentConfirmation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!medicalPaymentConfirmationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				medicalPaymentConfirmation.setModifiedDate(date);
			}
			else {
				medicalPaymentConfirmation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(medicalPaymentConfirmation);
			}
			else {
				medicalPaymentConfirmation =
					(MedicalPaymentConfirmation)session.merge(
						medicalPaymentConfirmation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MedicalPaymentConfirmationImpl.class,
			medicalPaymentConfirmationModelImpl, false, true);

		cacheUniqueFindersCache(medicalPaymentConfirmationModelImpl);

		if (isNew) {
			medicalPaymentConfirmation.setNew(false);
		}

		medicalPaymentConfirmation.resetOriginalValues();

		return medicalPaymentConfirmation;
	}

	/**
	 * Returns the medical payment confirmation with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the medical payment confirmation
	 * @return the medical payment confirmation
	 * @throws NoSuchMedicalPaymentConfirmationException if a medical payment confirmation with the primary key could not be found
	 */
	@Override
	public MedicalPaymentConfirmation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMedicalPaymentConfirmationException {

		MedicalPaymentConfirmation medicalPaymentConfirmation =
			fetchByPrimaryKey(primaryKey);

		if (medicalPaymentConfirmation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMedicalPaymentConfirmationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return medicalPaymentConfirmation;
	}

	/**
	 * Returns the medical payment confirmation with the primary key or throws a <code>NoSuchMedicalPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param medicalPaymentConfirmationId the primary key of the medical payment confirmation
	 * @return the medical payment confirmation
	 * @throws NoSuchMedicalPaymentConfirmationException if a medical payment confirmation with the primary key could not be found
	 */
	@Override
	public MedicalPaymentConfirmation findByPrimaryKey(
			long medicalPaymentConfirmationId)
		throws NoSuchMedicalPaymentConfirmationException {

		return findByPrimaryKey((Serializable)medicalPaymentConfirmationId);
	}

	/**
	 * Returns the medical payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalPaymentConfirmationId the primary key of the medical payment confirmation
	 * @return the medical payment confirmation, or <code>null</code> if a medical payment confirmation with the primary key could not be found
	 */
	@Override
	public MedicalPaymentConfirmation fetchByPrimaryKey(
		long medicalPaymentConfirmationId) {

		return fetchByPrimaryKey((Serializable)medicalPaymentConfirmationId);
	}

	/**
	 * Returns all the medical payment confirmations.
	 *
	 * @return the medical payment confirmations
	 */
	@Override
	public List<MedicalPaymentConfirmation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical payment confirmations
	 * @param end the upper bound of the range of medical payment confirmations (not inclusive)
	 * @return the range of medical payment confirmations
	 */
	@Override
	public List<MedicalPaymentConfirmation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical payment confirmations
	 * @param end the upper bound of the range of medical payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical payment confirmations
	 */
	@Override
	public List<MedicalPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<MedicalPaymentConfirmation> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical payment confirmations
	 * @param end the upper bound of the range of medical payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical payment confirmations
	 */
	@Override
	public List<MedicalPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<MedicalPaymentConfirmation> orderByComparator,
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

		List<MedicalPaymentConfirmation> list = null;

		if (useFinderCache) {
			list = (List<MedicalPaymentConfirmation>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MEDICALPAYMENTCONFIRMATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MEDICALPAYMENTCONFIRMATION;

				sql = sql.concat(
					MedicalPaymentConfirmationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MedicalPaymentConfirmation>)QueryUtil.list(
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
	 * Removes all the medical payment confirmations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MedicalPaymentConfirmation medicalPaymentConfirmation :
				findAll()) {

			remove(medicalPaymentConfirmation);
		}
	}

	/**
	 * Returns the number of medical payment confirmations.
	 *
	 * @return the number of medical payment confirmations
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
					_SQL_COUNT_MEDICALPAYMENTCONFIRMATION);

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
		return "medicalPaymentConfirmationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MEDICALPAYMENTCONFIRMATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MedicalPaymentConfirmationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the medical payment confirmation persistence.
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

		_finderPathFetchBygetMedicalPaymentConfBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMedicalPaymentConfBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetMedicalPaymentConfBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMedicalPaymentConfBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetMedicalPayConfBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetMedicalPayConfBy_CI",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetMedicalPayConfBy_CI =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetMedicalPayConfBy_CI",
				new String[] {String.class.getName()}, new String[] {"caseId"},
				true);

		_finderPathCountBygetMedicalPayConfBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMedicalPayConfBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		MedicalPaymentConfirmationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MedicalPaymentConfirmationUtil.setPersistence(null);

		entityCache.removeCache(MedicalPaymentConfirmationImpl.class.getName());
	}

	@Override
	@Reference(
		target = MEDICAL_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MEDICAL_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MEDICAL_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MEDICALPAYMENTCONFIRMATION =
		"SELECT medicalPaymentConfirmation FROM MedicalPaymentConfirmation medicalPaymentConfirmation";

	private static final String _SQL_SELECT_MEDICALPAYMENTCONFIRMATION_WHERE =
		"SELECT medicalPaymentConfirmation FROM MedicalPaymentConfirmation medicalPaymentConfirmation WHERE ";

	private static final String _SQL_COUNT_MEDICALPAYMENTCONFIRMATION =
		"SELECT COUNT(medicalPaymentConfirmation) FROM MedicalPaymentConfirmation medicalPaymentConfirmation";

	private static final String _SQL_COUNT_MEDICALPAYMENTCONFIRMATION_WHERE =
		"SELECT COUNT(medicalPaymentConfirmation) FROM MedicalPaymentConfirmation medicalPaymentConfirmation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"medicalPaymentConfirmation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MedicalPaymentConfirmation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MedicalPaymentConfirmation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MedicalPaymentConfirmationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"comment"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}