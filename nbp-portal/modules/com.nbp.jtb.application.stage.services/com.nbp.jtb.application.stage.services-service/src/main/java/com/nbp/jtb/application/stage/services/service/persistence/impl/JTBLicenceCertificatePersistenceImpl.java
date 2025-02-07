/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.service.persistence.impl;

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

import com.nbp.jtb.application.stage.services.exception.NoSuchJTBLicenceCertificateException;
import com.nbp.jtb.application.stage.services.model.JTBLicenceCertificate;
import com.nbp.jtb.application.stage.services.model.JTBLicenceCertificateTable;
import com.nbp.jtb.application.stage.services.model.impl.JTBLicenceCertificateImpl;
import com.nbp.jtb.application.stage.services.model.impl.JTBLicenceCertificateModelImpl;
import com.nbp.jtb.application.stage.services.service.persistence.JTBLicenceCertificatePersistence;
import com.nbp.jtb.application.stage.services.service.persistence.JTBLicenceCertificateUtil;
import com.nbp.jtb.application.stage.services.service.persistence.impl.constants.JTB_APPLICATION_STAGEPersistenceConstants;

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
 * The persistence implementation for the jtb licence certificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JTBLicenceCertificatePersistence.class)
public class JTBLicenceCertificatePersistenceImpl
	extends BasePersistenceImpl<JTBLicenceCertificate>
	implements JTBLicenceCertificatePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JTBLicenceCertificateUtil</code> to access the jtb licence certificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JTBLicenceCertificateImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetJtbLicenceCertiBy_CI;
	private FinderPath _finderPathCountBygetJtbLicenceCertiBy_CI;

	/**
	 * Returns the jtb licence certificate where caseId = &#63; or throws a <code>NoSuchJTBLicenceCertificateException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb licence certificate
	 * @throws NoSuchJTBLicenceCertificateException if a matching jtb licence certificate could not be found
	 */
	@Override
	public JTBLicenceCertificate findBygetJtbLicenceCertiBy_CI(String caseId)
		throws NoSuchJTBLicenceCertificateException {

		JTBLicenceCertificate jtbLicenceCertificate =
			fetchBygetJtbLicenceCertiBy_CI(caseId);

		if (jtbLicenceCertificate == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJTBLicenceCertificateException(sb.toString());
		}

		return jtbLicenceCertificate;
	}

	/**
	 * Returns the jtb licence certificate where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb licence certificate, or <code>null</code> if a matching jtb licence certificate could not be found
	 */
	@Override
	public JTBLicenceCertificate fetchBygetJtbLicenceCertiBy_CI(String caseId) {
		return fetchBygetJtbLicenceCertiBy_CI(caseId, true);
	}

	/**
	 * Returns the jtb licence certificate where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb licence certificate, or <code>null</code> if a matching jtb licence certificate could not be found
	 */
	@Override
	public JTBLicenceCertificate fetchBygetJtbLicenceCertiBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJtbLicenceCertiBy_CI, finderArgs, this);
		}

		if (result instanceof JTBLicenceCertificate) {
			JTBLicenceCertificate jtbLicenceCertificate =
				(JTBLicenceCertificate)result;

			if (!Objects.equals(caseId, jtbLicenceCertificate.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JTBLICENCECERTIFICATE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTBLICENCECERTIBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJTBLICENCECERTIBY_CI_CASEID_2);
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

				List<JTBLicenceCertificate> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJtbLicenceCertiBy_CI,
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
								"JTBLicenceCertificatePersistenceImpl.fetchBygetJtbLicenceCertiBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JTBLicenceCertificate jtbLicenceCertificate = list.get(0);

					result = jtbLicenceCertificate;

					cacheResult(jtbLicenceCertificate);
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
			return (JTBLicenceCertificate)result;
		}
	}

	/**
	 * Removes the jtb licence certificate where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jtb licence certificate that was removed
	 */
	@Override
	public JTBLicenceCertificate removeBygetJtbLicenceCertiBy_CI(String caseId)
		throws NoSuchJTBLicenceCertificateException {

		JTBLicenceCertificate jtbLicenceCertificate =
			findBygetJtbLicenceCertiBy_CI(caseId);

		return remove(jtbLicenceCertificate);
	}

	/**
	 * Returns the number of jtb licence certificates where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jtb licence certificates
	 */
	@Override
	public int countBygetJtbLicenceCertiBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetJtbLicenceCertiBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JTBLICENCECERTIFICATE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTBLICENCECERTIBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJTBLICENCECERTIBY_CI_CASEID_2);
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
		_FINDER_COLUMN_GETJTBLICENCECERTIBY_CI_CASEID_2 =
			"jtbLicenceCertificate.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETJTBLICENCECERTIBY_CI_CASEID_3 =
			"(jtbLicenceCertificate.caseId IS NULL OR jtbLicenceCertificate.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetJtbLicCertiBy_CI;
	private FinderPath _finderPathWithoutPaginationFindBygetJtbLicCertiBy_CI;
	private FinderPath _finderPathCountBygetJtbLicCertiBy_CI;

	/**
	 * Returns all the jtb licence certificates where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb licence certificates
	 */
	@Override
	public List<JTBLicenceCertificate> findBygetJtbLicCertiBy_CI(
		String caseId) {

		return findBygetJtbLicCertiBy_CI(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb licence certificates where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb licence certificates
	 * @param end the upper bound of the range of jtb licence certificates (not inclusive)
	 * @return the range of matching jtb licence certificates
	 */
	@Override
	public List<JTBLicenceCertificate> findBygetJtbLicCertiBy_CI(
		String caseId, int start, int end) {

		return findBygetJtbLicCertiBy_CI(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb licence certificates where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb licence certificates
	 * @param end the upper bound of the range of jtb licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb licence certificates
	 */
	@Override
	public List<JTBLicenceCertificate> findBygetJtbLicCertiBy_CI(
		String caseId, int start, int end,
		OrderByComparator<JTBLicenceCertificate> orderByComparator) {

		return findBygetJtbLicCertiBy_CI(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb licence certificates where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb licence certificates
	 * @param end the upper bound of the range of jtb licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb licence certificates
	 */
	@Override
	public List<JTBLicenceCertificate> findBygetJtbLicCertiBy_CI(
		String caseId, int start, int end,
		OrderByComparator<JTBLicenceCertificate> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetJtbLicCertiBy_CI;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJtbLicCertiBy_CI;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<JTBLicenceCertificate> list = null;

		if (useFinderCache) {
			list = (List<JTBLicenceCertificate>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JTBLicenceCertificate jtbLicenceCertificate : list) {
					if (!caseId.equals(jtbLicenceCertificate.getCaseId())) {
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

			sb.append(_SQL_SELECT_JTBLICENCECERTIFICATE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTBLICCERTIBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJTBLICCERTIBY_CI_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JTBLicenceCertificateModelImpl.ORDER_BY_JPQL);
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

				list = (List<JTBLicenceCertificate>)QueryUtil.list(
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
	 * Returns the first jtb licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb licence certificate
	 * @throws NoSuchJTBLicenceCertificateException if a matching jtb licence certificate could not be found
	 */
	@Override
	public JTBLicenceCertificate findBygetJtbLicCertiBy_CI_First(
			String caseId,
			OrderByComparator<JTBLicenceCertificate> orderByComparator)
		throws NoSuchJTBLicenceCertificateException {

		JTBLicenceCertificate jtbLicenceCertificate =
			fetchBygetJtbLicCertiBy_CI_First(caseId, orderByComparator);

		if (jtbLicenceCertificate != null) {
			return jtbLicenceCertificate;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchJTBLicenceCertificateException(sb.toString());
	}

	/**
	 * Returns the first jtb licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb licence certificate, or <code>null</code> if a matching jtb licence certificate could not be found
	 */
	@Override
	public JTBLicenceCertificate fetchBygetJtbLicCertiBy_CI_First(
		String caseId,
		OrderByComparator<JTBLicenceCertificate> orderByComparator) {

		List<JTBLicenceCertificate> list = findBygetJtbLicCertiBy_CI(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jtb licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb licence certificate
	 * @throws NoSuchJTBLicenceCertificateException if a matching jtb licence certificate could not be found
	 */
	@Override
	public JTBLicenceCertificate findBygetJtbLicCertiBy_CI_Last(
			String caseId,
			OrderByComparator<JTBLicenceCertificate> orderByComparator)
		throws NoSuchJTBLicenceCertificateException {

		JTBLicenceCertificate jtbLicenceCertificate =
			fetchBygetJtbLicCertiBy_CI_Last(caseId, orderByComparator);

		if (jtbLicenceCertificate != null) {
			return jtbLicenceCertificate;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchJTBLicenceCertificateException(sb.toString());
	}

	/**
	 * Returns the last jtb licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb licence certificate, or <code>null</code> if a matching jtb licence certificate could not be found
	 */
	@Override
	public JTBLicenceCertificate fetchBygetJtbLicCertiBy_CI_Last(
		String caseId,
		OrderByComparator<JTBLicenceCertificate> orderByComparator) {

		int count = countBygetJtbLicCertiBy_CI(caseId);

		if (count == 0) {
			return null;
		}

		List<JTBLicenceCertificate> list = findBygetJtbLicCertiBy_CI(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jtb licence certificates before and after the current jtb licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param jTBLicenceCertificateId the primary key of the current jtb licence certificate
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb licence certificate
	 * @throws NoSuchJTBLicenceCertificateException if a jtb licence certificate with the primary key could not be found
	 */
	@Override
	public JTBLicenceCertificate[] findBygetJtbLicCertiBy_CI_PrevAndNext(
			long jTBLicenceCertificateId, String caseId,
			OrderByComparator<JTBLicenceCertificate> orderByComparator)
		throws NoSuchJTBLicenceCertificateException {

		caseId = Objects.toString(caseId, "");

		JTBLicenceCertificate jtbLicenceCertificate = findByPrimaryKey(
			jTBLicenceCertificateId);

		Session session = null;

		try {
			session = openSession();

			JTBLicenceCertificate[] array = new JTBLicenceCertificateImpl[3];

			array[0] = getBygetJtbLicCertiBy_CI_PrevAndNext(
				session, jtbLicenceCertificate, caseId, orderByComparator,
				true);

			array[1] = jtbLicenceCertificate;

			array[2] = getBygetJtbLicCertiBy_CI_PrevAndNext(
				session, jtbLicenceCertificate, caseId, orderByComparator,
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

	protected JTBLicenceCertificate getBygetJtbLicCertiBy_CI_PrevAndNext(
		Session session, JTBLicenceCertificate jtbLicenceCertificate,
		String caseId,
		OrderByComparator<JTBLicenceCertificate> orderByComparator,
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

		sb.append(_SQL_SELECT_JTBLICENCECERTIFICATE_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETJTBLICCERTIBY_CI_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETJTBLICCERTIBY_CI_CASEID_2);
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
			sb.append(JTBLicenceCertificateModelImpl.ORDER_BY_JPQL);
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
						jtbLicenceCertificate)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JTBLicenceCertificate> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jtb licence certificates where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetJtbLicCertiBy_CI(String caseId) {
		for (JTBLicenceCertificate jtbLicenceCertificate :
				findBygetJtbLicCertiBy_CI(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(jtbLicenceCertificate);
		}
	}

	/**
	 * Returns the number of jtb licence certificates where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jtb licence certificates
	 */
	@Override
	public int countBygetJtbLicCertiBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetJtbLicCertiBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JTBLICENCECERTIFICATE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTBLICCERTIBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJTBLICCERTIBY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETJTBLICCERTIBY_CI_CASEID_2 =
		"jtbLicenceCertificate.caseId = ?";

	private static final String _FINDER_COLUMN_GETJTBLICCERTIBY_CI_CASEID_3 =
		"(jtbLicenceCertificate.caseId IS NULL OR jtbLicenceCertificate.caseId = '')";

	public JTBLicenceCertificatePersistenceImpl() {
		setModelClass(JTBLicenceCertificate.class);

		setModelImplClass(JTBLicenceCertificateImpl.class);
		setModelPKClass(long.class);

		setTable(JTBLicenceCertificateTable.INSTANCE);
	}

	/**
	 * Caches the jtb licence certificate in the entity cache if it is enabled.
	 *
	 * @param jtbLicenceCertificate the jtb licence certificate
	 */
	@Override
	public void cacheResult(JTBLicenceCertificate jtbLicenceCertificate) {
		entityCache.putResult(
			JTBLicenceCertificateImpl.class,
			jtbLicenceCertificate.getPrimaryKey(), jtbLicenceCertificate);

		finderCache.putResult(
			_finderPathFetchBygetJtbLicenceCertiBy_CI,
			new Object[] {jtbLicenceCertificate.getCaseId()},
			jtbLicenceCertificate);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the jtb licence certificates in the entity cache if it is enabled.
	 *
	 * @param jtbLicenceCertificates the jtb licence certificates
	 */
	@Override
	public void cacheResult(
		List<JTBLicenceCertificate> jtbLicenceCertificates) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (jtbLicenceCertificates.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JTBLicenceCertificate jtbLicenceCertificate :
				jtbLicenceCertificates) {

			if (entityCache.getResult(
					JTBLicenceCertificateImpl.class,
					jtbLicenceCertificate.getPrimaryKey()) == null) {

				cacheResult(jtbLicenceCertificate);
			}
		}
	}

	/**
	 * Clears the cache for all jtb licence certificates.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JTBLicenceCertificateImpl.class);

		finderCache.clearCache(JTBLicenceCertificateImpl.class);
	}

	/**
	 * Clears the cache for the jtb licence certificate.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JTBLicenceCertificate jtbLicenceCertificate) {
		entityCache.removeResult(
			JTBLicenceCertificateImpl.class, jtbLicenceCertificate);
	}

	@Override
	public void clearCache(List<JTBLicenceCertificate> jtbLicenceCertificates) {
		for (JTBLicenceCertificate jtbLicenceCertificate :
				jtbLicenceCertificates) {

			entityCache.removeResult(
				JTBLicenceCertificateImpl.class, jtbLicenceCertificate);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JTBLicenceCertificateImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				JTBLicenceCertificateImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JTBLicenceCertificateModelImpl jtbLicenceCertificateModelImpl) {

		Object[] args = new Object[] {
			jtbLicenceCertificateModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetJtbLicenceCertiBy_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJtbLicenceCertiBy_CI, args,
			jtbLicenceCertificateModelImpl);
	}

	/**
	 * Creates a new jtb licence certificate with the primary key. Does not add the jtb licence certificate to the database.
	 *
	 * @param jTBLicenceCertificateId the primary key for the new jtb licence certificate
	 * @return the new jtb licence certificate
	 */
	@Override
	public JTBLicenceCertificate create(long jTBLicenceCertificateId) {
		JTBLicenceCertificate jtbLicenceCertificate =
			new JTBLicenceCertificateImpl();

		jtbLicenceCertificate.setNew(true);
		jtbLicenceCertificate.setPrimaryKey(jTBLicenceCertificateId);

		jtbLicenceCertificate.setCompanyId(CompanyThreadLocal.getCompanyId());

		return jtbLicenceCertificate;
	}

	/**
	 * Removes the jtb licence certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jTBLicenceCertificateId the primary key of the jtb licence certificate
	 * @return the jtb licence certificate that was removed
	 * @throws NoSuchJTBLicenceCertificateException if a jtb licence certificate with the primary key could not be found
	 */
	@Override
	public JTBLicenceCertificate remove(long jTBLicenceCertificateId)
		throws NoSuchJTBLicenceCertificateException {

		return remove((Serializable)jTBLicenceCertificateId);
	}

	/**
	 * Removes the jtb licence certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jtb licence certificate
	 * @return the jtb licence certificate that was removed
	 * @throws NoSuchJTBLicenceCertificateException if a jtb licence certificate with the primary key could not be found
	 */
	@Override
	public JTBLicenceCertificate remove(Serializable primaryKey)
		throws NoSuchJTBLicenceCertificateException {

		Session session = null;

		try {
			session = openSession();

			JTBLicenceCertificate jtbLicenceCertificate =
				(JTBLicenceCertificate)session.get(
					JTBLicenceCertificateImpl.class, primaryKey);

			if (jtbLicenceCertificate == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJTBLicenceCertificateException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(jtbLicenceCertificate);
		}
		catch (NoSuchJTBLicenceCertificateException noSuchEntityException) {
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
	protected JTBLicenceCertificate removeImpl(
		JTBLicenceCertificate jtbLicenceCertificate) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jtbLicenceCertificate)) {
				jtbLicenceCertificate = (JTBLicenceCertificate)session.get(
					JTBLicenceCertificateImpl.class,
					jtbLicenceCertificate.getPrimaryKeyObj());
			}

			if (jtbLicenceCertificate != null) {
				session.delete(jtbLicenceCertificate);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (jtbLicenceCertificate != null) {
			clearCache(jtbLicenceCertificate);
		}

		return jtbLicenceCertificate;
	}

	@Override
	public JTBLicenceCertificate updateImpl(
		JTBLicenceCertificate jtbLicenceCertificate) {

		boolean isNew = jtbLicenceCertificate.isNew();

		if (!(jtbLicenceCertificate instanceof
				JTBLicenceCertificateModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(jtbLicenceCertificate.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					jtbLicenceCertificate);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in jtbLicenceCertificate proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JTBLicenceCertificate implementation " +
					jtbLicenceCertificate.getClass());
		}

		JTBLicenceCertificateModelImpl jtbLicenceCertificateModelImpl =
			(JTBLicenceCertificateModelImpl)jtbLicenceCertificate;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (jtbLicenceCertificate.getCreateDate() == null)) {
			if (serviceContext == null) {
				jtbLicenceCertificate.setCreateDate(date);
			}
			else {
				jtbLicenceCertificate.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!jtbLicenceCertificateModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				jtbLicenceCertificate.setModifiedDate(date);
			}
			else {
				jtbLicenceCertificate.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(jtbLicenceCertificate);
			}
			else {
				jtbLicenceCertificate = (JTBLicenceCertificate)session.merge(
					jtbLicenceCertificate);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JTBLicenceCertificateImpl.class, jtbLicenceCertificateModelImpl,
			false, true);

		cacheUniqueFindersCache(jtbLicenceCertificateModelImpl);

		if (isNew) {
			jtbLicenceCertificate.setNew(false);
		}

		jtbLicenceCertificate.resetOriginalValues();

		return jtbLicenceCertificate;
	}

	/**
	 * Returns the jtb licence certificate with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jtb licence certificate
	 * @return the jtb licence certificate
	 * @throws NoSuchJTBLicenceCertificateException if a jtb licence certificate with the primary key could not be found
	 */
	@Override
	public JTBLicenceCertificate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJTBLicenceCertificateException {

		JTBLicenceCertificate jtbLicenceCertificate = fetchByPrimaryKey(
			primaryKey);

		if (jtbLicenceCertificate == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJTBLicenceCertificateException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return jtbLicenceCertificate;
	}

	/**
	 * Returns the jtb licence certificate with the primary key or throws a <code>NoSuchJTBLicenceCertificateException</code> if it could not be found.
	 *
	 * @param jTBLicenceCertificateId the primary key of the jtb licence certificate
	 * @return the jtb licence certificate
	 * @throws NoSuchJTBLicenceCertificateException if a jtb licence certificate with the primary key could not be found
	 */
	@Override
	public JTBLicenceCertificate findByPrimaryKey(long jTBLicenceCertificateId)
		throws NoSuchJTBLicenceCertificateException {

		return findByPrimaryKey((Serializable)jTBLicenceCertificateId);
	}

	/**
	 * Returns the jtb licence certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jTBLicenceCertificateId the primary key of the jtb licence certificate
	 * @return the jtb licence certificate, or <code>null</code> if a jtb licence certificate with the primary key could not be found
	 */
	@Override
	public JTBLicenceCertificate fetchByPrimaryKey(
		long jTBLicenceCertificateId) {

		return fetchByPrimaryKey((Serializable)jTBLicenceCertificateId);
	}

	/**
	 * Returns all the jtb licence certificates.
	 *
	 * @return the jtb licence certificates
	 */
	@Override
	public List<JTBLicenceCertificate> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb licence certificates
	 * @param end the upper bound of the range of jtb licence certificates (not inclusive)
	 * @return the range of jtb licence certificates
	 */
	@Override
	public List<JTBLicenceCertificate> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb licence certificates
	 * @param end the upper bound of the range of jtb licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb licence certificates
	 */
	@Override
	public List<JTBLicenceCertificate> findAll(
		int start, int end,
		OrderByComparator<JTBLicenceCertificate> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb licence certificates
	 * @param end the upper bound of the range of jtb licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb licence certificates
	 */
	@Override
	public List<JTBLicenceCertificate> findAll(
		int start, int end,
		OrderByComparator<JTBLicenceCertificate> orderByComparator,
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

		List<JTBLicenceCertificate> list = null;

		if (useFinderCache) {
			list = (List<JTBLicenceCertificate>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JTBLICENCECERTIFICATE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JTBLICENCECERTIFICATE;

				sql = sql.concat(JTBLicenceCertificateModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JTBLicenceCertificate>)QueryUtil.list(
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
	 * Removes all the jtb licence certificates from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JTBLicenceCertificate jtbLicenceCertificate : findAll()) {
			remove(jtbLicenceCertificate);
		}
	}

	/**
	 * Returns the number of jtb licence certificates.
	 *
	 * @return the number of jtb licence certificates
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
					_SQL_COUNT_JTBLICENCECERTIFICATE);

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
		return "jTBLicenceCertificateId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JTBLICENCECERTIFICATE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JTBLicenceCertificateModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jtb licence certificate persistence.
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

		_finderPathFetchBygetJtbLicenceCertiBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJtbLicenceCertiBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetJtbLicenceCertiBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJtbLicenceCertiBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetJtbLicCertiBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJtbLicCertiBy_CI",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetJtbLicCertiBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetJtbLicCertiBy_CI", new String[] {String.class.getName()},
			new String[] {"caseId"}, true);

		_finderPathCountBygetJtbLicCertiBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJtbLicCertiBy_CI", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		JTBLicenceCertificateUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JTBLicenceCertificateUtil.setPersistence(null);

		entityCache.removeCache(JTBLicenceCertificateImpl.class.getName());
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_STAGEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_JTBLICENCECERTIFICATE =
		"SELECT jtbLicenceCertificate FROM JTBLicenceCertificate jtbLicenceCertificate";

	private static final String _SQL_SELECT_JTBLICENCECERTIFICATE_WHERE =
		"SELECT jtbLicenceCertificate FROM JTBLicenceCertificate jtbLicenceCertificate WHERE ";

	private static final String _SQL_COUNT_JTBLICENCECERTIFICATE =
		"SELECT COUNT(jtbLicenceCertificate) FROM JTBLicenceCertificate jtbLicenceCertificate";

	private static final String _SQL_COUNT_JTBLICENCECERTIFICATE_WHERE =
		"SELECT COUNT(jtbLicenceCertificate) FROM JTBLicenceCertificate jtbLicenceCertificate WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"jtbLicenceCertificate.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JTBLicenceCertificate exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JTBLicenceCertificate exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JTBLicenceCertificatePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}