/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence.impl;

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

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchSecuredCreditorException;
import com.nbp.osi.insolvency.application.form.services.model.SecuredCreditor;
import com.nbp.osi.insolvency.application.form.services.model.SecuredCreditorTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.SecuredCreditorImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.SecuredCreditorModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.SecuredCreditorPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.SecuredCreditorUtil;
import com.nbp.osi.insolvency.application.form.services.service.persistence.impl.constants.OSI_INSOLVENCYPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the secured creditor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SecuredCreditorPersistence.class)
public class SecuredCreditorPersistenceImpl
	extends BasePersistenceImpl<SecuredCreditor>
	implements SecuredCreditorPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SecuredCreditorUtil</code> to access the secured creditor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SecuredCreditorImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetOsiById;
	private FinderPath _finderPathWithoutPaginationFindBygetOsiById;
	private FinderPath _finderPathCountBygetOsiById;

	/**
	 * Returns all the secured creditors where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching secured creditors
	 */
	@Override
	public List<SecuredCreditor> findBygetOsiById(long osiInsolvencyId) {
		return findBygetOsiById(
			osiInsolvencyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the secured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of secured creditors
	 * @param end the upper bound of the range of secured creditors (not inclusive)
	 * @return the range of matching secured creditors
	 */
	@Override
	public List<SecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end) {

		return findBygetOsiById(osiInsolvencyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the secured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of secured creditors
	 * @param end the upper bound of the range of secured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching secured creditors
	 */
	@Override
	public List<SecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<SecuredCreditor> orderByComparator) {

		return findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the secured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of secured creditors
	 * @param end the upper bound of the range of secured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching secured creditors
	 */
	@Override
	public List<SecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<SecuredCreditor> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetOsiById;
				finderArgs = new Object[] {osiInsolvencyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOsiById;
			finderArgs = new Object[] {
				osiInsolvencyId, start, end, orderByComparator
			};
		}

		List<SecuredCreditor> list = null;

		if (useFinderCache) {
			list = (List<SecuredCreditor>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SecuredCreditor securedCreditor : list) {
					if (osiInsolvencyId !=
							securedCreditor.getOsiInsolvencyId()) {

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

			sb.append(_SQL_SELECT_SECUREDCREDITOR_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SecuredCreditorModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				list = (List<SecuredCreditor>)QueryUtil.list(
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
	 * Returns the first secured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching secured creditor
	 * @throws NoSuchSecuredCreditorException if a matching secured creditor could not be found
	 */
	@Override
	public SecuredCreditor findBygetOsiById_First(
			long osiInsolvencyId,
			OrderByComparator<SecuredCreditor> orderByComparator)
		throws NoSuchSecuredCreditorException {

		SecuredCreditor securedCreditor = fetchBygetOsiById_First(
			osiInsolvencyId, orderByComparator);

		if (securedCreditor != null) {
			return securedCreditor;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiInsolvencyId=");
		sb.append(osiInsolvencyId);

		sb.append("}");

		throw new NoSuchSecuredCreditorException(sb.toString());
	}

	/**
	 * Returns the first secured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching secured creditor, or <code>null</code> if a matching secured creditor could not be found
	 */
	@Override
	public SecuredCreditor fetchBygetOsiById_First(
		long osiInsolvencyId,
		OrderByComparator<SecuredCreditor> orderByComparator) {

		List<SecuredCreditor> list = findBygetOsiById(
			osiInsolvencyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last secured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching secured creditor
	 * @throws NoSuchSecuredCreditorException if a matching secured creditor could not be found
	 */
	@Override
	public SecuredCreditor findBygetOsiById_Last(
			long osiInsolvencyId,
			OrderByComparator<SecuredCreditor> orderByComparator)
		throws NoSuchSecuredCreditorException {

		SecuredCreditor securedCreditor = fetchBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);

		if (securedCreditor != null) {
			return securedCreditor;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiInsolvencyId=");
		sb.append(osiInsolvencyId);

		sb.append("}");

		throw new NoSuchSecuredCreditorException(sb.toString());
	}

	/**
	 * Returns the last secured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching secured creditor, or <code>null</code> if a matching secured creditor could not be found
	 */
	@Override
	public SecuredCreditor fetchBygetOsiById_Last(
		long osiInsolvencyId,
		OrderByComparator<SecuredCreditor> orderByComparator) {

		int count = countBygetOsiById(osiInsolvencyId);

		if (count == 0) {
			return null;
		}

		List<SecuredCreditor> list = findBygetOsiById(
			osiInsolvencyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the secured creditors before and after the current secured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param securedCreditorId the primary key of the current secured creditor
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next secured creditor
	 * @throws NoSuchSecuredCreditorException if a secured creditor with the primary key could not be found
	 */
	@Override
	public SecuredCreditor[] findBygetOsiById_PrevAndNext(
			long securedCreditorId, long osiInsolvencyId,
			OrderByComparator<SecuredCreditor> orderByComparator)
		throws NoSuchSecuredCreditorException {

		SecuredCreditor securedCreditor = findByPrimaryKey(securedCreditorId);

		Session session = null;

		try {
			session = openSession();

			SecuredCreditor[] array = new SecuredCreditorImpl[3];

			array[0] = getBygetOsiById_PrevAndNext(
				session, securedCreditor, osiInsolvencyId, orderByComparator,
				true);

			array[1] = securedCreditor;

			array[2] = getBygetOsiById_PrevAndNext(
				session, securedCreditor, osiInsolvencyId, orderByComparator,
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

	protected SecuredCreditor getBygetOsiById_PrevAndNext(
		Session session, SecuredCreditor securedCreditor, long osiInsolvencyId,
		OrderByComparator<SecuredCreditor> orderByComparator,
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

		sb.append(_SQL_SELECT_SECUREDCREDITOR_WHERE);

		sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

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
			sb.append(SecuredCreditorModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(osiInsolvencyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						securedCreditor)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SecuredCreditor> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the secured creditors where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	@Override
	public void removeBygetOsiById(long osiInsolvencyId) {
		for (SecuredCreditor securedCreditor :
				findBygetOsiById(
					osiInsolvencyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(securedCreditor);
		}
	}

	/**
	 * Returns the number of secured creditors where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching secured creditors
	 */
	@Override
	public int countBygetOsiById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SECUREDCREDITOR_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

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

	private static final String _FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2 =
		"securedCreditor.osiInsolvencyId = ?";

	public SecuredCreditorPersistenceImpl() {
		setModelClass(SecuredCreditor.class);

		setModelImplClass(SecuredCreditorImpl.class);
		setModelPKClass(long.class);

		setTable(SecuredCreditorTable.INSTANCE);
	}

	/**
	 * Caches the secured creditor in the entity cache if it is enabled.
	 *
	 * @param securedCreditor the secured creditor
	 */
	@Override
	public void cacheResult(SecuredCreditor securedCreditor) {
		entityCache.putResult(
			SecuredCreditorImpl.class, securedCreditor.getPrimaryKey(),
			securedCreditor);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the secured creditors in the entity cache if it is enabled.
	 *
	 * @param securedCreditors the secured creditors
	 */
	@Override
	public void cacheResult(List<SecuredCreditor> securedCreditors) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (securedCreditors.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SecuredCreditor securedCreditor : securedCreditors) {
			if (entityCache.getResult(
					SecuredCreditorImpl.class,
					securedCreditor.getPrimaryKey()) == null) {

				cacheResult(securedCreditor);
			}
		}
	}

	/**
	 * Clears the cache for all secured creditors.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SecuredCreditorImpl.class);

		finderCache.clearCache(SecuredCreditorImpl.class);
	}

	/**
	 * Clears the cache for the secured creditor.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SecuredCreditor securedCreditor) {
		entityCache.removeResult(SecuredCreditorImpl.class, securedCreditor);
	}

	@Override
	public void clearCache(List<SecuredCreditor> securedCreditors) {
		for (SecuredCreditor securedCreditor : securedCreditors) {
			entityCache.removeResult(
				SecuredCreditorImpl.class, securedCreditor);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SecuredCreditorImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(SecuredCreditorImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new secured creditor with the primary key. Does not add the secured creditor to the database.
	 *
	 * @param securedCreditorId the primary key for the new secured creditor
	 * @return the new secured creditor
	 */
	@Override
	public SecuredCreditor create(long securedCreditorId) {
		SecuredCreditor securedCreditor = new SecuredCreditorImpl();

		securedCreditor.setNew(true);
		securedCreditor.setPrimaryKey(securedCreditorId);

		securedCreditor.setCompanyId(CompanyThreadLocal.getCompanyId());

		return securedCreditor;
	}

	/**
	 * Removes the secured creditor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param securedCreditorId the primary key of the secured creditor
	 * @return the secured creditor that was removed
	 * @throws NoSuchSecuredCreditorException if a secured creditor with the primary key could not be found
	 */
	@Override
	public SecuredCreditor remove(long securedCreditorId)
		throws NoSuchSecuredCreditorException {

		return remove((Serializable)securedCreditorId);
	}

	/**
	 * Removes the secured creditor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the secured creditor
	 * @return the secured creditor that was removed
	 * @throws NoSuchSecuredCreditorException if a secured creditor with the primary key could not be found
	 */
	@Override
	public SecuredCreditor remove(Serializable primaryKey)
		throws NoSuchSecuredCreditorException {

		Session session = null;

		try {
			session = openSession();

			SecuredCreditor securedCreditor = (SecuredCreditor)session.get(
				SecuredCreditorImpl.class, primaryKey);

			if (securedCreditor == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSecuredCreditorException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(securedCreditor);
		}
		catch (NoSuchSecuredCreditorException noSuchEntityException) {
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
	protected SecuredCreditor removeImpl(SecuredCreditor securedCreditor) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(securedCreditor)) {
				securedCreditor = (SecuredCreditor)session.get(
					SecuredCreditorImpl.class,
					securedCreditor.getPrimaryKeyObj());
			}

			if (securedCreditor != null) {
				session.delete(securedCreditor);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (securedCreditor != null) {
			clearCache(securedCreditor);
		}

		return securedCreditor;
	}

	@Override
	public SecuredCreditor updateImpl(SecuredCreditor securedCreditor) {
		boolean isNew = securedCreditor.isNew();

		if (!(securedCreditor instanceof SecuredCreditorModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(securedCreditor.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					securedCreditor);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in securedCreditor proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SecuredCreditor implementation " +
					securedCreditor.getClass());
		}

		SecuredCreditorModelImpl securedCreditorModelImpl =
			(SecuredCreditorModelImpl)securedCreditor;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (securedCreditor.getCreateDate() == null)) {
			if (serviceContext == null) {
				securedCreditor.setCreateDate(date);
			}
			else {
				securedCreditor.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!securedCreditorModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				securedCreditor.setModifiedDate(date);
			}
			else {
				securedCreditor.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(securedCreditor);
			}
			else {
				securedCreditor = (SecuredCreditor)session.merge(
					securedCreditor);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SecuredCreditorImpl.class, securedCreditorModelImpl, false, true);

		if (isNew) {
			securedCreditor.setNew(false);
		}

		securedCreditor.resetOriginalValues();

		return securedCreditor;
	}

	/**
	 * Returns the secured creditor with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the secured creditor
	 * @return the secured creditor
	 * @throws NoSuchSecuredCreditorException if a secured creditor with the primary key could not be found
	 */
	@Override
	public SecuredCreditor findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSecuredCreditorException {

		SecuredCreditor securedCreditor = fetchByPrimaryKey(primaryKey);

		if (securedCreditor == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSecuredCreditorException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return securedCreditor;
	}

	/**
	 * Returns the secured creditor with the primary key or throws a <code>NoSuchSecuredCreditorException</code> if it could not be found.
	 *
	 * @param securedCreditorId the primary key of the secured creditor
	 * @return the secured creditor
	 * @throws NoSuchSecuredCreditorException if a secured creditor with the primary key could not be found
	 */
	@Override
	public SecuredCreditor findByPrimaryKey(long securedCreditorId)
		throws NoSuchSecuredCreditorException {

		return findByPrimaryKey((Serializable)securedCreditorId);
	}

	/**
	 * Returns the secured creditor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param securedCreditorId the primary key of the secured creditor
	 * @return the secured creditor, or <code>null</code> if a secured creditor with the primary key could not be found
	 */
	@Override
	public SecuredCreditor fetchByPrimaryKey(long securedCreditorId) {
		return fetchByPrimaryKey((Serializable)securedCreditorId);
	}

	/**
	 * Returns all the secured creditors.
	 *
	 * @return the secured creditors
	 */
	@Override
	public List<SecuredCreditor> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the secured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of secured creditors
	 * @param end the upper bound of the range of secured creditors (not inclusive)
	 * @return the range of secured creditors
	 */
	@Override
	public List<SecuredCreditor> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the secured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of secured creditors
	 * @param end the upper bound of the range of secured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of secured creditors
	 */
	@Override
	public List<SecuredCreditor> findAll(
		int start, int end,
		OrderByComparator<SecuredCreditor> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the secured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of secured creditors
	 * @param end the upper bound of the range of secured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of secured creditors
	 */
	@Override
	public List<SecuredCreditor> findAll(
		int start, int end,
		OrderByComparator<SecuredCreditor> orderByComparator,
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

		List<SecuredCreditor> list = null;

		if (useFinderCache) {
			list = (List<SecuredCreditor>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SECUREDCREDITOR);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SECUREDCREDITOR;

				sql = sql.concat(SecuredCreditorModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SecuredCreditor>)QueryUtil.list(
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
	 * Removes all the secured creditors from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SecuredCreditor securedCreditor : findAll()) {
			remove(securedCreditor);
		}
	}

	/**
	 * Returns the number of secured creditors.
	 *
	 * @return the number of secured creditors
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_SECUREDCREDITOR);

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
		return "securedCreditorId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SECUREDCREDITOR;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SecuredCreditorModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the secured creditor persistence.
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

		_finderPathWithPaginationFindBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetOsiById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathWithoutPaginationFindBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathCountBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, false);

		SecuredCreditorUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SecuredCreditorUtil.setPersistence(null);

		entityCache.removeCache(SecuredCreditorImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SECUREDCREDITOR =
		"SELECT securedCreditor FROM SecuredCreditor securedCreditor";

	private static final String _SQL_SELECT_SECUREDCREDITOR_WHERE =
		"SELECT securedCreditor FROM SecuredCreditor securedCreditor WHERE ";

	private static final String _SQL_COUNT_SECUREDCREDITOR =
		"SELECT COUNT(securedCreditor) FROM SecuredCreditor securedCreditor";

	private static final String _SQL_COUNT_SECUREDCREDITOR_WHERE =
		"SELECT COUNT(securedCreditor) FROM SecuredCreditor securedCreditor WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "securedCreditor.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SecuredCreditor exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SecuredCreditor exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SecuredCreditorPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}